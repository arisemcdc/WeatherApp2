package com.example.weatherapp2.ui.today_weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp2.R
import com.example.weatherapp2.data.WeatherApi
import kotlinx.android.synthetic.main.fragment_today_weather.*
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
        /*val textView: TextView = root.findViewById(R.id.text_home)
        todayWeatherViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        /*val retrofit = retrofit*/
       // getCurrentWeather()
        return root
    }
    fun getCurrentWeather() {
        /*WeatherApi.retrofitService.getCurrentWeather().enqueue(object : Callback<CurrentWeatherResponse?> {
            override fun onResponse(call: Call<CurrentWeatherResponse?>, response: Response<CurrentWeatherResponse?>) {
                val responseBody = response.body()!!
                text_home.text = responseBody.toString()
            }

            override fun onFailure(call: Call<CurrentWeatherResponse?>, t: Throwable) {

            }
        })*/
       /* GlobalScope.launch {
            val data = WeatherApi.retrofitService.getCurrentWeather()
            descriptionTextView.text = data.toString()
        }*/
    }
}