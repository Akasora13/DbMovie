package id.farrel.dbmovie.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.data.Repository
import id.farrel.dbmovie.utils.DataDummy

class MovieViewModel(private val movieRepository: Repository) : ViewModel() {

    fun getMovie(): LiveData<List<MovieEntity>> = movieRepository.getListFilm()
}