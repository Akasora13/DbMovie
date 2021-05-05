package id.farrel.dbmovie.ui.series

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import id.farrel.dbmovie.databinding.FragmentSeriesBinding

class SeriesFragment : Fragment() {

    private lateinit var fragmentSeriesBinding: FragmentSeriesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        fragmentSeriesBinding = FragmentSeriesBinding.inflate(layoutInflater, container,false)
        return fragmentSeriesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[SeriesViewModel::class.java]
            val series = viewModel.getSeries()

            val seriesAdapter = SeriesAdapter()
            seriesAdapter.setSeries(series)
            with(fragmentSeriesBinding.rvListSeries) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter =seriesAdapter
            }
        }
    }


}