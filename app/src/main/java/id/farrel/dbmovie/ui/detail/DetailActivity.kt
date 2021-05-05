package id.farrel.dbmovie.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.data.SeriesEntity
import id.farrel.dbmovie.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var idData: String
    private lateinit var flag: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]

        flag = intent.getStringExtra("FLAG")!!
        if (flag == "0"){
            idData = intent.getStringExtra("ID_M")!!
            viewModel.setSelectedItem(idData)
            populateViewMovie(viewModel.getDetailMovie())
        }else if (flag == "1"){
            idData = intent.getStringExtra("ID_S")!!
            viewModel.setSelectedItem(idData)
            populateViewSeries(viewModel.getDetailSeries())
        }else {
            Toast.makeText(this, "Data is Missing", Toast.LENGTH_SHORT).show()
        }

    }

    fun populateViewMovie(movie: MovieEntity){
        with(binding){
            tvItemTitle.text = movie.title
            tvItemGenre.text = movie.genre
            tvItemYear.text = movie.year
            tvItemRating.text = movie.rating
            tvItemDesc.text = movie.desc

            Glide.with(this@DetailActivity)
                .load(movie.img)
                .into(imgPoster)
        }
    }

    fun populateViewSeries(series: SeriesEntity){
        with(binding){
            tvItemTitle.text = series.title
            tvItemGenre.text = series.genre
            tvItemYear.text = series.year
            tvItemRating.text = series.rating
            tvItemDesc.text = series.desc

            Glide.with(this@DetailActivity)
                .load(series.img)
                .into(imgPoster)
        }

    }
}