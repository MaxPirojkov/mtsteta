package com.mtsteta.android.pirozhkovteta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), PreviewMovieAdapter.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler = findViewById<RecyclerView>(R.id.rcView)
        val movies = MoviesDataSourceImpl().getMovies()
        val adapter = PreviewMovieAdapter(this, this)
        recycler.adapter = adapter
        recycler.layoutManager = GridLayoutManager(this@MainActivity, 2)
        adapter.updates(movies)
    }


    override fun onItemClick(item: TextView, position: Int) {
        Toast.makeText(this, item.text, Toast.LENGTH_SHORT).show()
    }
}
