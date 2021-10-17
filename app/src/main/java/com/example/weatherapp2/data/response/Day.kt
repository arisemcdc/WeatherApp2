package com.example.weatherapp2.data.response


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
/*@Entity(
        tableName = "Days"
)
data class Day(
        var avgtemp: Int,
        @PrimaryKey
        var date: String,
        var dateEpoch: Int,
        var maxtemp: Int,
        var mintemp: Int,
        var sunhour: Double,
        var totalsnow: Int,
        var uvIndex: Int
)*/
data class Day(
        val avgtemp: Int,
        val date: String,
        val dateEpoch: Int,
        val maxtemp: Int,
        val mintemp: Int,
        val sunhour: Double,
        val totalsnow: Double,
        val uvIndex: Int
)
typealias Forecast = Map<String, Day>
