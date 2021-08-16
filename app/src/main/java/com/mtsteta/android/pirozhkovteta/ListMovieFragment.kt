package com.mtsteta.android.pirozhkovteta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_list_movie.*
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListMovieFragment : Fragment() {
    private var list: List<PreviewMovie> = emptyList()
    private var adapter: PreviewMovieAdapter? = null
    private val viewModel = ListMovieViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_movie, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.rcView)
        val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        adapter = PreviewMovieAdapter(requireContext()) { onItemClick(it) }
        recyclerView.adapter = adapter
        refreshList()
        viewModel.movieList.observe(viewLifecycleOwner, Observer {
            adapter?.updates(it)
            list = it
            swipeToRefresh.isRefreshing = false
        })
        viewModel.requestState.observe(viewLifecycleOwner, Observer {
            if(it.hasData){
            }
            else if(it.isProgress){
                progressBar.visibility=View.VISIBLE
                swipeToRefresh.visibility = View.GONE
            }else{
                progressBar.visibility=View.GONE
                swipeToRefresh.visibility = View.VISIBLE
            }
//            swipeToRefresh.isRefreshing = false
        })
    }

    private fun onItemClick(position: Int) {
        list?.get(position)?.let { previewMovie ->
            val fragment = MovieDetailFragment.newInstance(previewMovie)
            requireActivity().supportFragmentManager
                .beginTransaction()
                .add(R.id.content, fragment)
                .addToBackStack(null)
                .commit()
        }
    }


    private fun refreshList() {
        swipeToRefresh.setOnRefreshListener {
            viewModel.refreshList()
        }
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ListMovieFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            ListMovieFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}
