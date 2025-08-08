package org.example.project.todayForecast

import androidx.compose.runtime.Composable

class TodayForecastFactory {
    companion object  {
        @Composable
        fun makeView() {
            // inject HttpClient here
            return TodayForecast()
        }
    }
}