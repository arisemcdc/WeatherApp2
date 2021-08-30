package com.example.weatherapp2.data.response


import com.google.gson.annotations.SerializedName

data class ForecastWeather(
    val current: CurrentX,
    val forecast: Forecast,
    val location: LocationX,
    val request: RequestX
)