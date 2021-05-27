package id.farrel.dbmovie.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.farrel.dbmovie.data.Repository
import id.farrel.dbmovie.ui.detail.DetailViewModel
import id.farrel.dbmovie.ui.movie.MovieViewModel
import id.farrel.dbmovie.ui.series.SeriesViewModel

class ViewModelFactory private constructor(private val mContentRepository: Repository) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRespository())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        when {
            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                DetailViewModel(mContentRepository) as T
            }
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                MovieViewModel(mContentRepository) as T
            }
            modelClass.isAssignableFrom(SeriesViewModel::class.java) -> {
                SeriesViewModel(mContentRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }


}