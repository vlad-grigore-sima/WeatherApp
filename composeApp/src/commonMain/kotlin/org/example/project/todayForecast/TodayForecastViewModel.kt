package org.example.project.todayForecast

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TodayForecastViewModel(private val dependencies: Dependencies) {
    data class Dependencies(val fetchForecast: suspend () -> Forecast)

    private val _forecast = MutableStateFlow<Forecast?>(null)
    val forecast: StateFlow<Forecast?> = _forecast

    suspend fun loadForecast() {
        val forecast = dependencies.fetchForecast()
        _forecast.value = forecast
    }
}