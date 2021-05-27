package id.farrel.dbmovie.ui.series

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.farrel.dbmovie.BuildConfig.IMAGE_URL
import id.farrel.dbmovie.data.SeriesEntity
import id.farrel.dbmovie.databinding.ListSeriesBinding
import id.farrel.dbmovie.ui.detail.DetailActivity

class SeriesAdapter(private val context: Context) :
    RecyclerView.Adapter<SeriesAdapter.ViewHolder>() {

    private var listSeries = ArrayList<SeriesEntity>()

    fun setSeries(series: List<SeriesEntity>) {
        if (series == null) return
        this.listSeries.clear()
        this.listSeries.addAll(series)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesAdapter.ViewHolder {
        val binding = ListSeriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SeriesAdapter.ViewHolder, position: Int) {
        val series = listSeries[position]
        holder.bind(series)
    }

    override fun getItemCount(): Int = listSeries.size

    inner class ViewHolder(private val binding: ListSeriesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(series: SeriesEntity) {
            with(binding) {
                tvItemTitle.text = series.title
                tvItemGenre.text = series.genre
                tvItemYear.text = series.year

                Glide.with(itemView.context)
                    .load("${IMAGE_URL}${series.img}")
                    .into(binding.imgPoster)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra("ID_S", series.id)
                    intent.putExtra("FLAG", "1")
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}