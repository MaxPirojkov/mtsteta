package com.mtsteta.android.pirozhkovteta

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListMovieViewModel: ViewModel() {

    private val _movieList =  MutableLiveData<List<PreviewMovie>>()
    val movieList: LiveData<List<PreviewMovie>> =  _movieList
    private val dataSource: MoviesDataSource = MoviesDataSourceImpl()

    private val _requsetState =  MutableLiveData<RequestState>()
    val requestState: LiveData<RequestState> =  _requsetState
    val viewState = RequestState(isProgress = true)

    init {
        getMovieList()
    }


    fun refreshList(){
        getMovieList(true)
    }

    private fun getMovieList (isRefresh: Boolean = false) {
        viewModelScope.launch {
            _requsetState.value = RequestState(isProgress = true,hasData = isRefresh )

            var list = withContext(Dispatchers.IO) { dataSource.getMovies() }
            _movieList.value = list
            _requsetState.value = RequestState(isProgress = false, hasData = isRefresh)
        }
    }

}