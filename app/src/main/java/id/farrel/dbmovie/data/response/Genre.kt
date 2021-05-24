package id.farrel.dbmovie.data.response

import com.google.gson.annotations.SerializedName

data class Genre(
    @field:SerializedName("name") val genreName: String? = null,
    @field:SerializedName("id") val id: Int? = 0

)
