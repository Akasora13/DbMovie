package id.farrel.dbmovie.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.data.Repository
import id.farrel.dbmovie.data.SeriesEntity

class DetailViewModel(private val detailRepository: Repository) : ViewModel() {

    private lateinit var itemId: String

    fun setSelectedItem(itemId: String) {
        this.itemId = itemId
    }

    fun getDetailMovie(movieId: Int): LiveData<MovieEntity> = detailRepository.getFilm(movieId)

    fun getDetailSeries(tvId: Int): LiveData<SeriesEntity> = detailRepository.getTv(tvId)

}