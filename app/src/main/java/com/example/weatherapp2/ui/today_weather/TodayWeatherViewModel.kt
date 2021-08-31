package com.example.weatherapp2.ui.today_weather

import androidx.lifecycle.*
import com.example.weatherapp2.WeatherApp2
import com.example.weatherapp2.data.WeatherApi
import com.example.weatherapp2.data.response.CurrentWeatherResponse

class TodayWeatherViewModel : ViewModel() {
    val currentWeather = liveData {
        val data = WeatherApp2.repository.getCurrentWeather()
        emit(data)
    }
  /*  val description = Transformations.map(currentWeather){
        it.current.weatherDescriptions[0]
    }
    val temperature = Transformations.map(currentWeather){
        it.current.temperature
    }
    val feelslike = Transformations.map(currentWeather){
        it.current.feelslike
    }
    val windSpeed = Transformations.map(currentWeather){
        it.current.windSpeed
    }
    val visibility = Transformations.map(currentWeather){
        it.current.visibility
    }
    val pressure = Transformations.map(currentWeather){
        it.current.pressure
    }*/
   /* private val _responseCurrentWeather = MutableLiveData<CurrentWeatherResponse>().apply {

    }
    val responseCurrentWeather: LiveData<CurrentWeatherResponse> = _responseCurrentWeather
    init {
        getCurrentWeather()
    }
    private fun getCurrentWeather(){

    }*/
}