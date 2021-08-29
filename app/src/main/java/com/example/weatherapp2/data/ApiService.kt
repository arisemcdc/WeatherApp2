package com.example.weatherapp2.data

import com.example.weatherapp2.data.response.CurrentWeatherResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
const val API_KEY = "26b16c3e204bf93eff79c438b4364dcf"
//https://api.openweathermap.org/data/2.5/weather?q=Saint%20Petersburg&appid=26b16c3e204bf93eff79c438b4364dcf
// const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
const val BASE_URL = "http://api.weatherstack.com/"
 val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
/*interface ApiCurrentWeatherService {
    @GET("weather?q=Saint%20Petersburg&appid=26b16c3e204bf93eff79c438b4364dcf")
    suspend fun getCurrentWeather(): CurrentWeatherResponse
}*/
interface ApiCurrentWeatherService {
    /*@GET("weather?q=Saint%20Petersburg&appid=26b16c3e204bf93eff79c438b4364dcf")
    fun getCurrentWeather(): Call<CurrentWeatherResponse>*/
    @GET("/forecast?access_key=782ed2295063e5aa2c4e5367f9451b5b&query=Saint-Petersburg&forecast_days=7&hourly=1")
    //https://api.weatherstack.com/current?access_key=782ed2295063e5aa2c4e5367f9451b5b&query=New%20York
    fun getCurrentWeather(): Call<CurrentWeatherResponse>
}
class ApiService {
}
object WeatherApi {
    val retrofitService: ApiCurrentWeatherService by lazy {
        retrofit.create(ApiCurrentWeatherService::class.java)
    }
}