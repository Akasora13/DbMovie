package id.farrel.dbmovie.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import id.farrel.dbmovie.BuildConfig
import id.farrel.dbmovie.BuildConfig.IMAGE_URL
import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.data.SeriesEntity
import id.farrel.dbmovie.databinding.ActivityDetailBinding
import id.farrel.dbmovie.utils.ViewModelFactory

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var idData: String
    private lateinit var flag: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        flag = intent.getStringExtra("FLAG")!!
        if (flag == "0"){
            idData = intent.getStringExtra("ID_M")!!
            viewModel.getDetailMovie(idData.toInt()).observe(this, {
                populateViewMovie(it)
            })
        }else if (flag == "1"){
            idData = intent.getStringExtra("ID_S")!!
            viewModel.getDetailSeries(idData.toInt()).observe(this,{
                populateViewSeries(it)
            })

        }else {
            Toast.makeText(this, "Data is Missing", Toast.LENGTH_SHORT).show()
        }

    }

    fun populateViewMovie(movie: MovieEntity){
        with(binding){
            tvItemTitle.text = movie.title
            tvItemGenre.text = movie.genre
            tvItemYear.text = movie.year
            tvItemRating.text = movie.rating.toString()
            tvItemDesc.text = movie.desc

            Glide.with(this@DetailActivity)
                .load("${IMAGE_URL}${movie.img}")
                .into(imgPoster)
        }
    }

    fun populateViewSeries(series: SeriesEntity){
        with(binding){
            tvItemTitle.text = series.title
            tvItemGenre.text = series.genre
            tvItemYear.text = series.year
            tvItemRating.text = series.rating.toString()
            tvItemDesc.text = series.desc

            Glide.with(this@DetailActivity)
                .load("${IMAGE_URL}${series.img}")
                .into(imgPoster)
        }

    }
}