package id.farrel.dbmovie.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.data.Repository
import id.farrel.dbmovie.data.SeriesEntity
import id.farrel.dbmovie.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.*

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val dummySeries = DataDummy.generateDummySeries()[0]
    private val idMovie = dummyMovie.id?.toInt()
    private val idSeries = dummySeries.id?.toInt()

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private var repository = mock(Repository::class.java)

    private var observer = mock(Observer::class.java)

    @Before
    fun setUp() {
        viewModel = DetailViewModel(repository)
    }

    @Test
    fun getDetailMovie() {
        val movie = MutableLiveData<MovieEntity>()
        movie.value = dummyMovie

        if (idMovie != null) {
            `when`(repository.getFilm(idMovie)).thenReturn(movie)
        }
        val movieEntity = idMovie?.let { viewModel.getDetailMovie(it.toInt()).value } as MovieEntity
        verify(repository).getFilm(idMovie.toInt())
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.id, movieEntity.id)
        assertEquals(dummyMovie.img, movieEntity.img)
        assertEquals(dummyMovie.year, movieEntity.year)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.rating, movieEntity.rating)
        assertEquals(dummyMovie.desc, movieEntity.desc)
        assertEquals(dummyMovie.title, movieEntity.title)

        viewModel.getDetailMovie(idMovie.toInt())
            .observeForever(observer as Observer<in MovieEntity>)
        verify(observer as Observer<in MovieEntity>).onChanged(dummyMovie)
    }

    @Test
    fun getDetailSeries() {
        val series = MutableLiveData<SeriesEntity>()
        series.value = dummySeries

        if (idSeries != null) {
            `when`(repository.getTv(idSeries.toInt())).thenReturn(series)
        }
        val seriesEntity =
            idSeries?.let { viewModel.getDetailSeries(it.toInt()).value } as SeriesEntity
        verify(repository).getTv(idSeries.toInt())
        assertNotNull(seriesEntity)
        assertEquals(dummySeries.id, seriesEntity.id)
        assertEquals(dummySeries.img, seriesEntity.img)
        assertEquals(dummySeries.year, seriesEntity.year)
        assertEquals(dummySeries.genre, seriesEntity.genre)
        assertEquals(dummySeries.rating, seriesEntity.rating)
        assertEquals(dummySeries.desc, seriesEntity.desc)
        assertEquals(dummySeries.title, seriesEntity.title)

        viewModel.getDetailSeries(idSeries.toInt())
            .observeForever(observer as Observer<in SeriesEntity>)
        verify(observer as Observer<in SeriesEntity>).onChanged(dummySeries)
    }
}