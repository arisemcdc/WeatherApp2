package com.example.weatherapp2.data.response


import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class Day(
        val avgtemp: Int,
        val date: String,
        val dateEpoch: Int,
        val maxtemp: Int,
        val mintemp: Int,
        val sunhour: Double,
        val totalsnow: Int,
        val uvIndex: Int
)
typealias Forecast = Map<String, Day>
