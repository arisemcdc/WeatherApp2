package com.example.weatherapp2.data.response


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*
/*
@Entity(tableName = "currentWeatherResponse")
data class CurrentWeatherResponse(
        @PrimaryKey
        val id:String= UUID.randomUUID().toString(),
        @Embedded
        val current: Current,
        @Embedded
        val location: Location,
        @Embedded
        val request: Request
)*/
data class CurrentWeatherResponse(
        val current: Current,
        val location: Location,
        val request: Request
)