package id.farrel.dbmovie.data.response

import com.google.gson.annotations.SerializedName

data class TvResponse(
    @field:SerializedName ("results") val result: List<DataTv>? = null
)

data class DataTv(
    @field:SerializedName("id") var id: Int? = 0,
    @field:SerializedName("name") var title: String? = null,
    @field:SerializedName("vote_average") var rating: Double? = 0.0,
    @field:SerializedName("overview") var desc: String? = null,
    @field:SerializedName("first_air_date") var year: String? = null,
    @field:SerializedName("poster_path") var img: String? = null
)