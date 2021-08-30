package com.example.weatherapp2.data.response


import com.google.gson.annotations.SerializedName

data class AstroXXXX(
    @SerializedName("moon_illumination")
    val moonIllumination: Int,
    @SerializedName("moon_phase")
    val moonPhase: String,
    val moonrise: String,
    val moonset: String,
    val sunrise: String,
    val sunset: String
)