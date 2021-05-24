package id.farrel.dbmovie.data

import androidx.lifecycle.LiveData


interface DataSource {

    fun getListFilm(): LiveData<List<MovieEntity>>

    fun getListTv(): LiveData<List<SeriesEntity>>

    fun getFilm(filmId: Int): LiveData<MovieEntity>

    fun getTv(tvId: Int): LiveData<SeriesEntity>

}