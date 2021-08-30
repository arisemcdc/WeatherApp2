package com.example.weatherapp2.data

import android.util.Log
import junit.framework.TestCase
import kotlinx.coroutines.runBlocking
import org.junit.Test

class WeatherApiTest{
    @Test
    fun getForecastWeather(): Unit = runBlocking{
        val data = WeatherApi.retrofitService.getForecastWeather()
        Log.d("myLog", data.toString() )
               }
    @Test
    fun getCurrentWeather(): Unit = runBlocking{
        val data = WeatherApi.retrofitService.getCurrentWeather()
        Log.d("myLog", data.toString() )
    }
}

