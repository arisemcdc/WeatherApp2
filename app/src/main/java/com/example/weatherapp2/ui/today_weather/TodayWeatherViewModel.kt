package com.example.weatherapp2.ui.today_weather

import androidx.lifecycle.*
import com.example.weatherapp2.WeatherApp2
import com.example.weatherapp2.data.DataResult
import com.example.weatherapp2.data.WeatherApi
import com.example.weatherapp2.data.response.CurrentWeatherResponse
import kotlinx.coroutines.delay

class TodayWeatherViewModel : ViewModel() {
    private val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> = _isLoading
    val currentWeather = liveData {
        val data = WeatherApp2.repository.getCurrentWeather()
        _isLoading.value = true
        //delay(2000)
        emit(data)
        _isLoading.value = false

    }
    val description = Transformations.map(currentWeather) { response ->
        if (response is DataResult.Success)
            response.data.current.weatherDescriptions[0]
        else
            "Error!"
    }
    val temperature = Transformations.map(currentWeather) { response ->
        if (response is DataResult.Success)
            response.data.current.temperature
        else
            "Error!"
    }
    val feelslike = Transformations.map(currentWeather) { response ->
        if (response is DataResult.Success)
            response.data.current.feelslike
        else
            "Error!"
    }
    val windSpeed = Transformations.map(currentWeather) { response ->
        if (response is DataResult.Success)
            response.data.current.windSpeed
        else
            "Error!"
    }
    val visibility = Transformations.map(currentWeather) { response ->
        if (response is DataResult.Success)
            response.data.current.visibility
        else
            "Error!"
    }
    val pressure = Transformations.map(currentWeather) { response ->
        if (response is DataResult.Success)
            response.data.current.pressure
        else
            "Error!"
    }
    val weatherIcon = Transformations.map(currentWeather) { response ->
        if (response is DataResult.Success)
            response.data.current.weatherIcons[0]
        else
            "Error!"
    }
}

