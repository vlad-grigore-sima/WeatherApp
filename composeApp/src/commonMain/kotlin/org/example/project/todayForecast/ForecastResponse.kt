package org.example.project.todayForecast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastResponse(
    val location: Location
) {
    @Serializable
    data class Location(
        @SerialName("name")
        val cityName: String
    )
}

fun ForecastResponse.toDomain() = Forecast(cityName = location.cityName)