package com.example.weatherapp2.ui.today_weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp2.R
import com.example.weatherapp2.data.WeatherApi
import kotlinx.android.synthetic.main.fragment_today_weather.*
import kotlinx.android.synthetic.main.fragment_today_weather.view.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TodayWeatherFragment : Fragment() {

    private lateinit var todayWeatherViewModel: TodayWeatherViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        todayWeatherViewModel =
                ViewModelProvider(this).get(TodayWeatherViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_today_weather, container, false)
        todayWeatherViewModel.currentWeather.observe(viewLifecycleOwner, Observer {
            root.descriptionTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.weatherDescriptions[0])
            root.temperatureTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.temperature.toString())
            root.feelsLikeTemperatureTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.feelslike.toString())
            root.windTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.windSpeed.toString())
            root.visibilityTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.visibility.toString())
            root.pressureTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.pressure.toString())
        })

        /*root.descriptionTextView.setText(todayWeatherViewModel.description.value)
        root.temperatureTextView.setText(todayWeatherViewModel.temperature.value.toString())
        root.feelsLikeTemperatureTextView.setText(todayWeatherViewModel.feelslike.value.toString())
        root.windTextView.setText(todayWeatherViewModel.windSpeed.value.toString())
        root.visibilityTextView.setText(todayWeatherViewModel.visibility.value.toString())
        root.pressureTextView.setText(todayWeatherViewModel.pressure.value.toString())*/

        /*val textView: TextView = root.findViewById(R.id.text_home)
        todayWeatherViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        /*val retrofit = retrofit*/
       // getCurrentWeather()
        return root
    }
    /*fun getCurrentWeather() {
        *//*WeatherApi.retrofitService.getCurrentWeather().enqueue(object : Callback<CurrentWeatherResponse?> {
            override fun onResponse(call: Call<CurrentWeatherResponse?>, response: Response<CurrentWeatherResponse?>) {
                val responseBody = response.body()!!
                text_home.text = responseBody.toString()
            }

            override fun onFailure(call: Call<CurrentWeatherResponse?>, t: Throwable) {

            }
        })*//*
       *//* GlobalScope.launch {
            val data = WeatherApi.retrofitService.getCurrentWeather()
            descriptionTextView.text = data.toString()
        }*//*
    }*/
}