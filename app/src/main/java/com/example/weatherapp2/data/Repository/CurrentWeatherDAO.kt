package com.example.weatherapp2.data.Repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.weatherapp2.data.response.Current
import com.example.weatherapp2.data.response.CurrentWeatherResponse

@Dao
interface CurrentWeatherDAO {
    @Query("SELECT * FROM currentWeatherResponse")
    fun getCurrentLiveData(): LiveData<List<CurrentWeatherResponse>>
    @Query("SELECT * FROM currentWeatherResponse")
    fun getCurrent(): List<CurrentWeatherResponse>
    @Insert
    suspend fun insert(currentWeatherResponse: CurrentWeatherResponse)
    @Update
    suspend fun update(currentWeatherResponse: CurrentWeatherResponse)
    @Delete
    suspend fun delete(currentWeatherResponse: CurrentWeatherResponse)
}