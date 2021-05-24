package id.farrel.dbmovie.ui.series

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import id.farrel.dbmovie.databinding.FragmentSeriesBinding
import id.farrel.dbmovie.utils.ViewModelFactory

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
            val factory = ViewModelFactory.getInstance()
            val viewModel = ViewModelProvider(this, factory)[SeriesViewModel::class.java]

            val seriesAdapter = SeriesAdapter(requireContext())

            fragmentSeriesBinding.rvListSeries.adapter = seriesAdapter

            viewModel.getSeries().observe(viewLifecycleOwner, {
                seriesAdapter.setSeries(it)
            })
        }
    }


}