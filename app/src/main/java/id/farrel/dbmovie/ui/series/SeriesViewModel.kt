package id.farrel.dbmovie.ui.series

import androidx.lifecycle.ViewModel
import id.farrel.dbmovie.data.SeriesEntity
import id.farrel.dbmovie.utils.DataDummy

class SeriesViewModel : ViewModel() {

    fun getSeries() : List<SeriesEntity> = DataDummy.generateDummySeries()
}