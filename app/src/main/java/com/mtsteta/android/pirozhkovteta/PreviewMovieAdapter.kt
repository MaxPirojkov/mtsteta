package com.mtsteta.android.pirozhkovteta

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import android.widget.RatingBar


class PreviewMovieAdapter(
    context: Context,
    private val onItemClick: (String) -> Unit
) : RecyclerView.Adapter<PreviewMovieAdapter.PreviewHolder>() {
    private var movies: List<PreviewMovie> = emptyList()

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreviewHolder {
        return PreviewHolder(inflater.inflate(R.layout.preview_movie_item, parent, false))
    }

    override fun onBindViewHolder(holder: PreviewHolder, position: Int) {
        holder.bind(movies.get(position))
    }

    override fun getItemCount(): Int = movies.size

    inner class PreviewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val imagePicMovie: ImageView = item.findViewById(R.id.picPreview)
        private val textNameMovie: TextView = item.findViewById(R.id.textTitle)
        private val textDescriptionMovie: TextView = item.findViewById(R.id.textDescription)
        private val textAgeLimit: TextView = item.findViewById(R.id.textOfAge)
        private val bar: RatingBar = item.findViewById(R.id.rateBar)

        fun bind(previewMovie: PreviewMovie) {
            imagePicMovie.loadImage(previewMovie.imageUrl)
            textNameMovie.text = previewMovie.title
            textDescriptionMovie.text = previewMovie.description
            textAgeLimit.text = previewMovie.ageRestriction
            bar.rating = (previewMovie.rateScore.toFloat())

            itemView.setOnClickListener { onItemClick.invoke(previewMovie.title) }
        }
    }
    fun updates(movies: List<PreviewMovie>) {
        this.movies = movies
        notifyDataSetChanged()
    }
}
private fun ImageView.loadImage(imageUrl: String) {
    Glide.with(this.context).load(imageUrl).into(this)
}





