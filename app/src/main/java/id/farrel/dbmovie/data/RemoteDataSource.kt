package id.farrel.dbmovie.data

import android.os.Handler
import android.os.Looper
import android.util.Log
import id.farrel.dbmovie.BuildConfig.API_KEY
import id.farrel.dbmovie.api.ApiConfig
import id.farrel.dbmovie.data.response.DataFilm
import id.farrel.dbmovie.data.response.DataTv
import id.farrel.dbmovie.data.response.FilmResponse
import id.farrel.dbmovie.data.response.TvResponse
import id.farrel.dbmovie.utils.EspressoIdlingResource
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class RemoteDataSource {

    private val handler = Handler(Looper.getMainLooper())

    companion object {
        private val TAG = RemoteDataSource::class.java.simpleName
        private val SERVICE_LATENCY_IN_MILLIS = 1500L

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

        handler.postDelayed({
            ApiConfig.getApiService().getFilmList(API_KEY).enqueue(object : Callback<FilmResponse> {
                override fun onResponse(
                    call: Call<FilmResponse>,
                    response: Response<FilmResponse>
                ) {
                    response.body()?.result?.let { callback.onAllFilmReceived(it) }
                    EspressoIdlingResource.decrement()
                }

                override fun onFailure(call: Call<FilmResponse>, t: Throwable) {
                    Log.d(TAG, t.printStackTrace().toString())
                }

            })
        }, SERVICE_LATENCY_IN_MILLIS)
    }

    fun getTvList(callback: LoadTvListCallback) {
        EspressoIdlingResource.increment()

        handler.postDelayed({
            ApiConfig.getApiService().getTvList(API_KEY).enqueue(object : Callback<TvResponse> {
                override fun onResponse(call: Call<TvResponse>, response: Response<TvResponse>) {
                    response.body()?.result?.let { callback.onAllTvShowReceived(it) }
                    EspressoIdlingResource.decrement()
                }

                override fun onFailure(call: Call<TvResponse>, t: Throwable) {
                    Log.d(TAG, t.printStackTrace().toString())
                }
            })
        }, SERVICE_LATENCY_IN_MILLIS)
    }

    fun getDetailFilm(id: Int, callback: LoadFilmDetailCallback) {
        EspressoIdlingResource.increment()

        handler.postDelayed({
            ApiConfig.getApiService().getFilmDetail(id, API_KEY).enqueue(object : Callback<DataFilm> {
                override fun onResponse(call: Call<DataFilm>, response: Response<DataFilm>) {
                    response.body()?.let { callback.onDetailMovieReceived(it) }
                    EspressoIdlingResource.decrement()
                }

                override fun onFailure(call: Call<DataFilm>, t: Throwable) {
                    Log.d(TAG, t.printStackTrace().toString())
                }

            })
        },SERVICE_LATENCY_IN_MILLIS)

    }

    fun getDetailTv(id: Int, callback: LoadTvDetailCallback) {
        EspressoIdlingResource.increment()

        handler.postDelayed({
            ApiConfig.getApiService().getTvDetail(id, API_KEY).enqueue(object : Callback<DataTv> {
                override fun onResponse(call: Call<DataTv>, response: Response<DataTv>) {
                    response.body()?.let { callback.onDetailTvShowReceived(it) }
                    EspressoIdlingResource.decrement()
                }

                override fun onFailure(call: Call<DataTv>, t: Throwable) {
                    Log.d(TAG, t.printStackTrace().toString())
                }
            })
        },SERVICE_LATENCY_IN_MILLIS)
    }
}
