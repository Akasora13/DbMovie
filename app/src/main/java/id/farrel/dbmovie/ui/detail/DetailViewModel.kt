package id.farrel.dbmovie.ui.detail

import android.widget.Toast
import androidx.lifecycle.ViewModel
import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.data.SeriesEntity
import id.farrel.dbmovie.utils.DataDummy

class DetailViewModel : ViewModel() {

    private lateinit var itemId : String

    fun setSelectedItem(itemId : String){
        this.itemId = itemId
    }

    fun getDetailMovie() : MovieEntity{

        lateinit var movie: MovieEntity

        val movieEntities = DataDummy.generateDummyMovie()
        for (movieEntity in movieEntities){
            if (movieEntity.id == itemId){
                movie = movieEntity
            }
        }
        return movie
    }

    fun getDetailSeries() : SeriesEntity{

        lateinit var series: SeriesEntity

        val seriesEntities = DataDummy.generateDummySeries()
        for (seriesEntity in seriesEntities){
            if (seriesEntity.id == itemId){
                series = seriesEntity
            }
        }
        return series
    }

}