package id.farrel.dbmovie.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieEntity(
        var id: String?,
        var title: String?,
        var year: String?,
        var genre: String?,
        var rating: Double?,
        var img: String?,
        var desc: String?
) : Parcelable