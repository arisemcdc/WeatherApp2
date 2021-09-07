package com.example.weatherapp2.data.Repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.weatherapp2.data.response.Current

@Dao
interface CurrentWeatherDAO {
    @Query("SELECT * FROM currentWeather")
    fun getCurrentLiveData(): LiveData<List<Current>>
    @Query("SELECT * FROM currentWeather")
    fun getCurrent(): List<Current>
    @Insert
    suspend fun insert(current: Current)
    @Update
    suspend fun update(current: Current)
    @Delete
    suspend fun delete(country: Current)
}