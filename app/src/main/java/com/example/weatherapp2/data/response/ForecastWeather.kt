package com.example.weatherapp2.data.response

import com.google.gson.annotations.SerializedName

class ForecastWeather (
        @SerializedName("forecast")
        val forecast: Forecast
        )