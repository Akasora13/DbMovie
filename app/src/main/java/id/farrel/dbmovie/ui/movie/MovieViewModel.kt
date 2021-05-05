package id.farrel.dbmovie.ui.movie

import androidx.lifecycle.ViewModel
import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovie(): List<MovieEntity> = DataDummy.generateDummyMovie()
}