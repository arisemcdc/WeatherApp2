package com.example.weatherapp2.ui.detailforecastweatherfragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.example.weatherapp2.R
import com.example.weatherapp2.data.DataResult
import kotlinx.android.synthetic.main.detail_forecast_weather_fragment.*
import kotlinx.android.synthetic.main.detail_forecast_weather_fragment.view.*

class DetailForecastWeatherFragment : Fragment() {
    lateinit var root: View
    companion object {
        fun newInstance() = DetailForecastWeatherFragment()
    }
    val args: DetailForecastWeatherFragmentArgs by navArgs()
    private lateinit var viewModel: DetailForecastWeatherViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewModel.setDayId(args.dayId)
        root = inflater.inflate(R.layout.detail_forecast_weather_fragment, container, false)
        viewModel.day.observe(viewLifecycleOwner, Observer {day ->
            if (day != null) {
                root.avgTempTextViewValue.setText(day.avgtemp.toString())
                root.dateTextViewValue.setText(day.date)
                root.dateEpochTextViewValue.setText(day.dateEpoch.toString())
                root.maxTempTextViewValue.setText(day.maxtemp.toString())
                root.minTempTextViewValue.setText(day.mintemp.toString())
                root.sunHourTextViewValue.setText(day.sunhour.toString())
                root.totalSnowTextViewValue.setText(day.totalsnow.toString())
                root.uvIndexTextViewValue.setText(day.uvIndex.toString())
                root.containerDetailForecastWeather.visibility = View.VISIBLE
                //root.errorTextView.visibility = View.GONE
            } else {
                root.containerDetailForecastWeather.visibility = View.GONE
                root.errorTextView.visibility = View.VISIBLE
            }
        })


        return root
    }

override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailForecastWeatherViewModel::class.java)
        // TODO: Use the ViewModel
    }


}
