package com.example.weatherapp2.ui.forecast

import androidx.lifecycle.*
import com.example.weatherapp2.WeatherApp2
import com.example.weatherapp2.data.DataResult
import kotlinx.coroutines.delay

class ForecastViewModel : ViewModel() {
    private val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> = _isLoading
    val forecastWeather = liveData {
        val data = WeatherApp2.repository.getForecastWeather()
        _isLoading.value = true
        delay(2000)
        emit(data)
        _isLoading.value = false
    }
    val dates = Transformations.map(forecastWeather) {
        if (it is DataResult.Success)
            it.data.forecast.values.toList()
        else
            null
    }
}