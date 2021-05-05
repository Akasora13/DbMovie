package id.farrel.dbmovie.ui.series

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class SeriesViewModelTest {

    private lateinit var viewModel : SeriesViewModel

    @Before
    fun setUp(){
        viewModel = SeriesViewModel()
    }

    @Test
    fun getSeries() {
        val series = viewModel.getSeries()
        assertNotNull(series)
        assertEquals(10, series.size)
    }
}