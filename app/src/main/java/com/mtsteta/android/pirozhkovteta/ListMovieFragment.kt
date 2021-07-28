package com.mtsteta.android.pirozhkovteta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_list_movie.*

class ListMovieFragment : Fragment() {
    private val dataSource: MoviesDataSource = MoviesDataSourceImpl()
    private val list = dataSource.getMovies()

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
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        val adapter = PreviewMovieAdapter(requireContext()) { onItemClick(it) }
        recyclerView.adapter = adapter
        adapter.updates(list)
    }

    private fun onItemClick(position: Int) {
        val previewMovie :PreviewMovie = list.get(position)
        val fragment = MovieDetailFragment.newInstance(previewMovie)
        requireActivity().supportFragmentManager
            .beginTransaction()
            .add(R.id.content, fragment)
            .addToBackStack(null)
            .commit()
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
