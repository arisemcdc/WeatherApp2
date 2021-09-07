package com.example.weatherapp2.ui.notifications

import androidx.lifecycle.*
import com.example.weatherapp2.WeatherApp2

class SettingsViewModel : ViewModel() {
    val forecastWeather = liveData {
        val data = WeatherApp2.repository.getForecastWeather()
        emit(data)
    }
    val dates = Transformations.map(forecastWeather) {
        it.forecast.values
    }
}