package id.farrel.dbmovie.ui.detail

import id.farrel.dbmovie.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {

    private lateinit var viewModel : DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val dummySeries = DataDummy.generateDummySeries()[0]
    private val courseIdMovie = dummyMovie.id
    private val courseIdSeries = dummySeries.id

    @Before
    fun setUp(){
        viewModel = DetailViewModel()
    }

    @Test
    fun getDetailMovie() {
        viewModel.setSelectedItem(courseIdMovie)
        val movieEntity = viewModel.getDetailMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.id, movieEntity.id)
        assertEquals(dummyMovie.img, movieEntity.img)
        assertEquals(dummyMovie.year, movieEntity.year)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.rating, movieEntity.rating)
        assertEquals(dummyMovie.desc, movieEntity.desc)
        assertEquals(dummyMovie.title, movieEntity.title)
    }

    @Test
    fun getDetailSeries() {
        viewModel.setSelectedItem(courseIdSeries)
        val seriesEntity = viewModel.getDetailSeries()
        assertNotNull(seriesEntity)
        assertEquals(dummySeries.id, seriesEntity.id)
        assertEquals(dummySeries.img, seriesEntity.img)
        assertEquals(dummySeries.year, seriesEntity.year)
        assertEquals(dummySeries.genre, seriesEntity.genre)
        assertEquals(dummySeries.rating, seriesEntity.rating)
        assertEquals(dummySeries.desc, seriesEntity.desc)
        assertEquals(dummySeries.title, seriesEntity.title)
    }
}