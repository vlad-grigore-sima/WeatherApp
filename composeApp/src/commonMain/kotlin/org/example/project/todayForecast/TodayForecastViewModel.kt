package org.example.project.todayForecast

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TodayForecastViewModel(private val dependencies: Dependencies) {
    data class Dependencies(val fetchForecast: suspend () -> String)

    private val _forecast = MutableStateFlow<String?>(null)
    val forecast: StateFlow<String?> = _forecast

    suspend fun loadForecast() {
        val forecast = dependencies.fetchForecast()
        // process it
    }
}