package id.farrel.dbmovie.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.databinding.ListMovieBinding
import id.farrel.dbmovie.ui.detail.DetailActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ViewHolder>()  {

    private var listMovie = ArrayList<MovieEntity>()

    fun setMovie(movie: List<MovieEntity>?){
        if (movie == null) return
        this.listMovie.clear()
        this.listMovie.addAll(movie)
    }

    inner class ViewHolder (private val binding: ListMovieBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(movie: MovieEntity){
            with(binding){
                tvItemTitle.text =movie.title
                tvItemGenre.text = movie.genre
                tvItemYear.text = movie.year

                Glide.with(itemView.context)
                    .load(movie.img)
                    .into(binding.imgPoster)

                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra("ID_M", movie.id)
                    intent.putExtra("FLAG", "0")
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val series = listMovie[position]
        holder.bind(series)
    }

    override fun getItemCount(): Int = listMovie.size

}