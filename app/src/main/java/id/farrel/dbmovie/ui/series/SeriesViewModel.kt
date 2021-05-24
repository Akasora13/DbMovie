package id.farrel.dbmovie.ui.series

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.farrel.dbmovie.data.Repository
import id.farrel.dbmovie.data.SeriesEntity
import id.farrel.dbmovie.utils.DataDummy

class SeriesViewModel(private val seriesRepository: Repository) : ViewModel() {

    fun getSeries() : LiveData<List<SeriesEntity>> = seriesRepository.getListTv()
}