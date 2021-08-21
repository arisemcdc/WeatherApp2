package com.example.weatherapp2.data.response


import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val current: Current,
    val location: Location,
    val request: Request
)