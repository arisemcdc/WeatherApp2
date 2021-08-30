package com.example.weatherapp2.data.Repository

import com.example.weatherapp2.data.WeatherApi

class Repository {
    suspend fun getCurrentWeather() = WeatherApi.retrofitService.getCurrentWeather()
}