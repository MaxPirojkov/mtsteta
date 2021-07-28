package com.mtsteta.android.pirozhkovteta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_list_movie.*
import kotlinx.android.synthetic.main.fragment_movie_details.*

class MovieDetailFragment : Fragment() {
    private var previewMovie: PreviewMovie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        previewMovie = arguments?.getParcelable<PreviewMovie>(KEY_MOVIE)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_details, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        previewMovie?.let {
            view.findViewById<ImageView>(R.id.mainPic).loadImage(it.imageUrl)
            view.findViewById<TextView>(R.id.nameOfMovie).setText(it.title)
            view.findViewById<TextView>(R.id.descriptionOfMovie).setText(it.description)
            view.findViewById<TextView>(R.id.ageLimit).setText(it.ageRestriction)
        }
    }


    companion object {
        @JvmStatic
        fun newInstance(previewMovie: PreviewMovie) =
            MovieDetailFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(KEY_MOVIE, previewMovie)
                }
            }

        private const val KEY_MOVIE = "key_movie"
    }

}

private fun RatingBar.getRating(rateScore: Int) {

}
