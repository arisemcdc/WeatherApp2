package com.example.weatherapp2.ui.forecast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp2.Adapters.ForecastWeatherListAdapter
import com.example.weatherapp2.R
import com.example.weatherapp2.data.response.ForecastWeather
import kotlinx.android.synthetic.main.fragment_forecast.*
import kotlinx.android.synthetic.main.fragment_forecast.view.*

class ForecastFragment : Fragment() {
    //lateinit var root: View
    private lateinit var forecastViewModel: ForecastViewModel
   lateinit var forecastWeatherListAdapter: ForecastWeatherListAdapter
    //Test mock forecastWeather
    val forecastWeatherList = arrayListOf<ForecastWeather>()
    val forecastWeather1 = ForecastWeather("12.11.2021", 10)
    val forecastWeather2 = ForecastWeather("13.11.2021", 9)
    val forecastWeather3 = ForecastWeather("14.11.2021", 10)
    val forecastWeather4 = ForecastWeather("15.11.2021", 11)
    val forecastWeather5 = ForecastWeather("16.11.2021", 9)
    val forecastWeather6 = ForecastWeather("17.11.2021", 8)
    val forecastWeather7 = ForecastWeather("18.11.2021", 10)

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        forecastViewModel =
                ViewModelProvider(this).get(ForecastViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_forecast, container, false)
        /*val textView: TextView = root.findViewById(R.id.text_dashboard)
        forecastViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        fillExampleForecastWeatherList()
        root.forecastWeatherListRecyclerView.layoutManager =LinearLayoutManager(context)
        forecastWeatherListAdapter = ForecastWeatherListAdapter(forecastWeatherList!!)
        root.forecastWeatherListRecyclerView.adapter = forecastWeatherListAdapter
        return root
    }
    fun fillExampleForecastWeatherList(){
        forecastWeatherList.add(forecastWeather1)
        forecastWeatherList.add(forecastWeather2)
        forecastWeatherList.add(forecastWeather3)
        forecastWeatherList.add(forecastWeather4)
        forecastWeatherList.add(forecastWeather5)
        forecastWeatherList.add(forecastWeather6)
        forecastWeatherList.add(forecastWeather7)
    }
}