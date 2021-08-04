package com.mtsteta.android.pirozhkovteta

interface MoviesDataSource {
    fun getMovies(): List<PreviewMovie>
}