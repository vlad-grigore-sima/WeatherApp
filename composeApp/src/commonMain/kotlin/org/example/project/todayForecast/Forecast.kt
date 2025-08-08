package org.example.project.todayForecast

import io.ktor.http.Url

data class Forecast(
    val cityName: String,
    val imageUrl: Url,
    val temperature: Double,
    val uvIndex: Double
)