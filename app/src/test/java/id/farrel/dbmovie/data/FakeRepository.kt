package id.farrel.dbmovie.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import id.farrel.dbmovie.data.RemoteDataSource.*
import id.farrel.dbmovie.data.response.DataFilm
import id.farrel.dbmovie.data.response.DataTv


class FakeRepository constructor(private val remoteDataSource: RemoteDataSource) :
    DataSource {

    override fun getListFilm(): LiveData<List<MovieEntity>> {
        val filmList = MutableLiveData<List<MovieEntity>>()

        remoteDataSource.getFilmList(object : LoadFilmListCallback {
            override fun onAllFilmReceived(movieList: List<DataFilm>) {
                val list = ArrayList<MovieEntity>()

                for (response in movieList) {
                    list.add(addDataFilm(response))
                }
                filmList.postValue(list)
            }

        })
        return filmList
    }

    override fun getListTv(): LiveData<List<SeriesEntity>> {
        val tvListt = MutableLiveData<List<SeriesEntity>>()

        remoteDataSource.getTvList(object : LoadTvListCallback {
            override fun onAllTvShowReceived(tvList: List<DataTv>) {
                val list = ArrayList<SeriesEntity>()

                for (response in tvList) {
                    list.add(addDataTv(response))
                }
                tvListt.postValue(list)
            }
        })
        return tvListt
    }

    override fun getFilm(filmId: Int): LiveData<MovieEntity> {
        val filmDetail = MutableLiveData<MovieEntity>()

        remoteDataSource.getDetailFilm(filmId, object : LoadFilmDetailCallback {
            override fun onDetailMovieReceived(movieDetail: DataFilm) {
                filmDetail.postValue(addDataFilm(movieDetail))
            }
        })
        return filmDetail
    }

    override fun getTv(tvId: Int): LiveData<SeriesEntity> {
        val tvDetail = MutableLiveData<SeriesEntity>()

        remoteDataSource.getDetailTv(tvId, object : LoadTvDetailCallback {
            override fun onDetailTvShowReceived(tvShowDetail: DataTv) {
                tvDetail.postValue(addDataTv(tvShowDetail))
            }
        })
        return tvDetail
    }

    private fun addDataFilm(r: DataFilm): MovieEntity {

        val Film = MovieEntity(
            id = r.id?.toString() ?: "0",
            title = r.title ?: "",
            year = r.year ?: "",
            rating = r.rating ?: 0.0,
            genre = "",
            img = r.img ?: "",
            desc = r.desc ?: ""
        )
        return Film
    }

    private fun addDataTv(r: DataTv): SeriesEntity {

        val Tv = SeriesEntity(
            id = r.id?.toString() ?: "",
            title = r.title ?: "",
            year = r.year ?: "",
            rating = r.rating ?: 0.0,
            genre = "",
            img = r.img ?: "",
            desc = r.desc ?: ""
        )
        return Tv
    }


}