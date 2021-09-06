package com.example.weatherapp2.data.Repository

import com.example.weatherapp2.data.DataResult
import com.example.weatherapp2.data.WeatherApi
import com.example.weatherapp2.data.response.CurrentWeatherResponse
import java.lang.Exception

class Repository {
    suspend fun getCurrentWeather():DataResult<CurrentWeatherResponse>{
        val rezult = try {
            DataResult.Success(WeatherApi.retrofitService.getCurrentWeather())
        } catch (e : Exception) {
            DataResult.Error(e)
        }
        return rezult
    }
    suspend fun getForecastWeather() = WeatherApi.retrofitService.getForecastWeather()
}
