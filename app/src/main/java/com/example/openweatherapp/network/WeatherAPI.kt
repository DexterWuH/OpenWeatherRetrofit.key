package com.example.openweatherapp.network

import com.example.openweatherapp.data.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET("forecast")
    suspend fun getFiveDaysWeather(
        @Query("lat")lat:Double,
        @Query("lon")lon:Double,
    ):WeatherResponse
}