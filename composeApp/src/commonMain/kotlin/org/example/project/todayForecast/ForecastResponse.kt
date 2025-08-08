package org.example.project.todayForecast

import io.ktor.http.Url
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastResponse(
    val location: Location,
    val current: Current
) {
    @Serializable
    data class Location(
        @SerialName("name")
        val cityName: String
    )

    @Serializable
    data class Current(
        @SerialName("uv")
        val uvIndex: Double,
        val condition: Condition,
        @SerialName("temp_c")
        val temperature: Double
    ) {
        @Serializable
        data class Condition(
            val text: String,
            @SerialName("icon")
            val imageUrl: String
        )
    }
}

fun ForecastResponse.toDomain() = Forecast(
    cityName = location.cityName,
    imageUrl = Url(urlString = current.condition.imageUrl),
    temperature = current.temperature,
    uvIndex = current.uvIndex
)