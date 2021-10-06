package com.example.weatherapp2.data.Repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.weatherapp2.data.response.Day

@Dao
interface ForecastDAO {
    @Query("SELECT * FROM Days")
    fun getForecastLiveData(): LiveData<List<Day>>
    @Query("SELECT * FROM Days")
    suspend fun getForecast(): List<Day>
    @Insert
    suspend fun insert(days: List<Day>)
    @Update
    suspend fun update(day: Day)
    @Delete
    suspend fun delete(day: Day)

    @Query("DELETE FROM Days")
    suspend fun deleteAll()
}