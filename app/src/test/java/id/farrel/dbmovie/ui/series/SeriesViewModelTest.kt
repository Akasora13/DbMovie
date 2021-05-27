package id.farrel.dbmovie.ui.series

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import id.farrel.dbmovie.data.Repository
import id.farrel.dbmovie.data.SeriesEntity
import id.farrel.dbmovie.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.*

class SeriesViewModelTest {

    private lateinit var viewModel: SeriesViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private var repository = mock(Repository::class.java)

    private var observer = mock(Observer::class.java)

    @Before
    fun setUp() {
        viewModel = SeriesViewModel(repository)
    }

    @Test
    fun getSeries() {
        val dummySeries = DataDummy.generateDummySeries()
        val listSeries = MutableLiveData<List<SeriesEntity>>()
        listSeries.value = dummySeries

        `when`(repository.getListTv()).thenReturn(listSeries)
        val seriesEntities = viewModel.getSeries().value
        verify(repository).getListTv()
        assertNotNull(seriesEntities)
        assertEquals(5, seriesEntities?.size)

        viewModel.getSeries().observeForever(observer as Observer<in List<SeriesEntity>>)
        verify(observer as Observer<in List<SeriesEntity>>).onChanged(dummySeries)
    }
}