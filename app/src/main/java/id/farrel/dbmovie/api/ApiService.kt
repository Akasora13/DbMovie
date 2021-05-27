package id.farrel.dbmovie.api

import id.farrel.dbmovie.data.response.DataFilm
import id.farrel.dbmovie.data.response.DataTv
import id.farrel.dbmovie.data.response.FilmResponse
import id.farrel.dbmovie.data.response.TvResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular")
    fun getFilmList(@Query("api_key") api_key: String): Call<FilmResponse>

    @GET("tv/popular")
    fun getTvList(@Query("api_key") api_key: String): Call<TvResponse>

    @GET("movie/{movie_id}")
    fun getFilmDetail(@Path("movie_id") id: Int, @Query("api_key") api_key: String): Call<DataFilm>

    @GET("tv/{tv_id}")
    fun getTvDetail(@Path("tv_id") id: Int, @Query("api_key") api_key: String): Call<DataTv>

}
