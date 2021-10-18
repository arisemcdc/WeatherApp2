package com.example.weatherapp2.ui.today_weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp2.R
import com.example.weatherapp2.data.WeatherApi
import com.squareup.picasso.Picasso
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
        /*todayWeatherViewModel.currentWeather.observe(viewLifecycleOwner, Observer {
            root.descriptionTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.weatherDescriptions[0])
            root.temperatureTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.temperature.toString())
            root.feelsLikeTemperatureTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.feelslike.toString())
            root.windTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.windSpeed.toString())
            root.visibilityTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.visibility.toString())
            root.pressureTextView.setText(todayWeatherViewModel.currentWeather.value!!.current.pressure.toString())
        })*/
        todayWeatherViewModel.description.observe(viewLifecycleOwner, Observer {
            root.descriptionTextView.setText(todayWeatherViewModel.description.value)
        })
        todayWeatherViewModel.temperature.observe(viewLifecycleOwner, Observer {
            root.temperatureTextView.setText(todayWeatherViewModel.temperature.value.toString())
        })
        todayWeatherViewModel.feelslike.observe(viewLifecycleOwner, Observer {
            root.feelsLikeTemperatureTextView.setText(todayWeatherViewModel.feelslike.value.toString())
        })
        todayWeatherViewModel.windSpeed.observe(viewLifecycleOwner, Observer {
            root.windTextView.setText(todayWeatherViewModel.windSpeed.value.toString())
        })
        todayWeatherViewModel.visibility.observe(viewLifecycleOwner, Observer {
            root.visibilityTextView.setText(todayWeatherViewModel.visibility.value.toString())
        })
        todayWeatherViewModel.pressure.observe(viewLifecycleOwner, Observer {
            root.pressureTextView.setText(todayWeatherViewModel.pressure.value.toString())
        })
        todayWeatherViewModel.weatherIcon.observe(viewLifecycleOwner, Observer {
            Picasso.with(context)
                .load(it)
                /*.placeholder(R.drawable.ic_dashboard_black_24dp)
                .error(R.drawable.ic_home_black_24dp)*/
                .into(weatherConditionsImageView, object: com.squareup.picasso.Callback {
                    override fun onSuccess() {
                    }

                    override fun onError() {

                    }
                }  )
        })
        todayWeatherViewModel.isLoading.observe(viewLifecycleOwner, Observer {
            if (it == true)
                root.progressBar.visibility = View.VISIBLE
            else
                root.progressBar.visibility = View.GONE
        })


        return root
    }

}