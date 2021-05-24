package id.farrel.dbmovie.data.response

import com.google.gson.annotations.SerializedName

data class FilmResponse(
    @field:SerializedName("results") val result: List<DataFilm>? = null
)

data class DataFilm(
    @field:SerializedName("id") var id: Int? = 0,
    @field:SerializedName("title") var title: String? = null,
    @field:SerializedName("vote_average") var rating: Double? = 0.0,
    @field:SerializedName("overview") var desc: String? = null,
    @field:SerializedName("release_date") var year: String? = null,
    @field:SerializedName("poster_path") var img: String? = null
)