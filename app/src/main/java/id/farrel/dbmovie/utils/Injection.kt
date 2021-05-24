package id.farrel.dbmovie.utils

import id.farrel.dbmovie.data.RemoteDataSource
import id.farrel.dbmovie.data.Repository

object Injection {
    fun provideRespository(): Repository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return Repository.getInstance(remoteDataSource)
    }
}