package com.example.weatherapp2.data.Repository

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.weatherapp2.data.response.Current
import com.example.weatherapp2.data.response.CurrentWeatherResponse
import com.example.weatherapp2.data.response.Day

/*@Database(entities = [CurrentWeatherResponse::class], version = 2)*/
/*@TypeConverters(Converters::class)*/
/*@Database(entities = [Day::class], version = 4, exportSchema = false)*/
abstract class RoomDB:RoomDatabase() {
    /*abstract fun currentWeatherDAO(): CurrentWeatherDAO*/
    abstract fun forecastDAO():ForecastDAO
}