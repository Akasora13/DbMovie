package id.farrel.dbmovie.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockitokotlin2.any
import id.farrel.dbmovie.utils.DataDummy
import id.farrel.dbmovie.utils.LiveDataTestUtil
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.*

class RepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val repository = FakeRepository(remote)

    private val movieResponse = DataDummy.generateRemoteMovie()
    private val movieId = movieResponse[0].id
    private val movieResponseDetail = DataDummy.generateMovieSpecific()
    private val seriesResponse = DataDummy.generateRemoteSeries()
    private val seriesId = seriesResponse[0].id
    private val seriesResponseDetail = DataDummy.generateSeriesSpecific()

    @Test
    fun getAllFilm() {
        doAnswer {
            (it.arguments[0] as RemoteDataSource.LoadFilmListCallback)
                .onAllFilmReceived(movieResponse)
        }.`when`(remote).getFilmList(any())

        val movieEntities = LiveDataTestUtil.getValue(repository.getListFilm())
        verify(remote).getFilmList(any())
        assertNotNull(movieEntities)
        assertEquals(movieResponse.size.toLong(), movieEntities.size.toLong())
    }

    @Test
    fun getAllSeries() {
        doAnswer {
            (it.arguments[0] as RemoteDataSource.LoadTvListCallback)
                .onAllTvShowReceived(seriesResponse)
        }.`when`(remote).getTvList(any())
        val seriesEntities = LiveDataTestUtil.getValue(repository.getListTv())
        verify(remote).getTvList(any())
        assertNotNull(seriesEntities)
        assertEquals(seriesResponse.size.toLong(), seriesEntities.size.toLong())
    }

    @Test
    fun getMovieDetail() {
        doAnswer {
            (it.arguments[1] as RemoteDataSource.LoadFilmDetailCallback)
                .onDetailMovieReceived(movieResponseDetail)
        }.`when`(remote).getDetailFilm(ArgumentMatchers.eq(movieId ?: 0), any())
        val movieEntities = LiveDataTestUtil.getValue(repository.getFilm(movieId ?: 0))
        verify(remote).getDetailFilm(ArgumentMatchers.eq(movieId ?: 0), any())
        assertNotNull(movieEntities)
        assertEquals(movieId, movieEntities.id?.toInt())
    }

    @Test
    fun getSeriesDetail() {
        doAnswer {
            (it.arguments[1] as RemoteDataSource.LoadTvDetailCallback)
                .onDetailTvShowReceived(seriesResponseDetail)
        }.`when`(remote).getDetailTv(ArgumentMatchers.eq(seriesId ?: 0), any())
        val seriesEntities = LiveDataTestUtil.getValue(repository.getTv(seriesId ?: 0))
        verify(remote).getDetailTv(ArgumentMatchers.eq(seriesId ?: 0), any())
        assertNotNull(seriesEntities)
        assertEquals(seriesId, seriesEntities.id?.toInt())
    }

    private fun delayTwoSecond() {
        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}