package id.farrel.dbmovie.data

import android.util.Log
import id.farrel.dbmovie.BuildConfig.API_KEY
import id.farrel.dbmovie.api.ApiConfig
import id.farrel.dbmovie.data.response.DataFilm
import id.farrel.dbmovie.data.response.DataTv
import id.farrel.dbmovie.data.response.FilmResponse
import id.farrel.dbmovie.data.response.TvResponse
import id.farrel.dbmovie.utils.EspressoIdlingResource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource {

    companion object {
        private val TAG = RemoteDataSource::class.java.simpleName

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource().apply { instance = this }
            }
    }

    interface LoadFilmListCallback {
        fun onAllFilmReceived(movieList: List<DataFilm>)
    }

    interface LoadTvListCallback {
        fun onAllTvShowReceived(tvList: List<DataTv>)
    }

    interface LoadFilmDetailCallback {
        fun onDetailMovieReceived(movieDetail: DataFilm)
    }

    interface LoadTvDetailCallback {
        fun onDetailTvShowReceived(tvShowDetail: DataTv)
    }

    fun getFilmList(callback: LoadFilmListCallback) {
        EspressoIdlingResource.increment()

        ApiConfig.getApiService().getFilmList(API_KEY).enqueue(object : Callback<FilmResponse> {
            override fun onResponse(call: Call<FilmResponse>, response: Response<FilmResponse>) {
                response.body()?.result?.let { callback.onAllFilmReceived(it) }
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<FilmResponse>, t: Throwable) {
                Log.d(TAG, t.printStackTrace().toString())
            }

        })
    }

    fun getTvList(callback: RemoteDataSource.LoadTvListCallback) {
        EspressoIdlingResource.increment()

        ApiConfig.getApiService().getTvList(API_KEY).enqueue(object : Callback<TvResponse> {
            override fun onResponse(call: Call<TvResponse>, response: Response<TvResponse>) {
                response.body()?.result?.let { callback.onAllTvShowReceived(it) }
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<TvResponse>, t: Throwable) {
                Log.d(TAG, t.printStackTrace().toString())
            }

        })
    }

    fun getDetailFilm(id: Int, callback: RemoteDataSource.LoadFilmDetailCallback) {
        EspressoIdlingResource.increment()

        ApiConfig.getApiService().getFilmDetail(id, API_KEY).enqueue(object : Callback<DataFilm> {
            override fun onResponse(call: Call<DataFilm>, response: Response<DataFilm>) {
                response.body()?.let { callback.onDetailMovieReceived(it) }
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<DataFilm>, t: Throwable) {
                Log.d(TAG, t.printStackTrace().toString())
            }

        })
    }

    fun getDetailTv(id: Int, callback: RemoteDataSource.LoadTvDetailCallback) {
        EspressoIdlingResource.increment()

        ApiConfig.getApiService().getTvDetail(id, API_KEY).enqueue(object : Callback<DataTv> {
            override fun onResponse(call: Call<DataTv>, response: Response<DataTv>) {
                response.body()?.let { callback.onDetailTvShowReceived(it) }
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<DataTv>, t: Throwable) {
                Log.d(TAG, t.printStackTrace().toString())
            }
        })
    }
}
