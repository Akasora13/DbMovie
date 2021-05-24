package id.farrel.dbmovie.ui.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.data.Repository
import id.farrel.dbmovie.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.mockito.Mock
import org.mockito.Mockito.*

class MovieViewModelTest {

    private lateinit var viewModel : MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private var repository = mock(Repository::class.java)

    private var observer = mock(Observer::class.java)

    /*@Mock
    private lateinit var observer: Observer<List<MovieEntity>>*/

    @Before
    fun setUp(){
        viewModel = MovieViewModel(repository)
    }

    @Test
    fun getMovie() {
        val dummyMovie = DataDummy.generateDummyMovie()
        val listMovie = MutableLiveData<List<MovieEntity>>()
        listMovie.value = dummyMovie

        `when`(repository.getListFilm()).thenReturn(listMovie)
        val movieEntities = viewModel.getMovie().value
        verify(repository).getListFilm()
        assertNotNull(movieEntities)
        assertEquals(5, movieEntities?.size)

        viewModel.getMovie().observeForever(observer as Observer<in List<MovieEntity>>)
        verify(observer as Observer<in List<MovieEntity>>).onChanged(dummyMovie)

    }
}