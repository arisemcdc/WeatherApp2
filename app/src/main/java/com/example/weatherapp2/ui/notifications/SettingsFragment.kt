package com.example.weatherapp2.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp2.R
import com.example.weatherapp2.data.WeatherApi
import com.example.weatherapp2.data.response.CurrentWeatherResponse
import kotlinx.android.synthetic.main.fragment_notifications.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SettingsFragment : Fragment() {

    private lateinit var settingsViewModel: SettingsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        settingsViewModel =
                ViewModelProvider(this).get(SettingsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
        /*val textView: TextView = root.findViewById(R.id.text_notifications)
        settingsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        getCurrentWeather()
        return root
    }
    fun getCurrentWeather() {
        WeatherApi.retrofitService.getCurrentWeather().enqueue(object : Callback<CurrentWeatherResponse?> {
            override fun onResponse(call: Call<CurrentWeatherResponse?>, response: Response<CurrentWeatherResponse?>) {
                val responseBody = response.body()!!
                responseTextView.text = responseBody.toString()
            }

            override fun onFailure(call: Call<CurrentWeatherResponse?>, t: Throwable) {

            }
        })
    }
}