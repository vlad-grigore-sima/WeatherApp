package org.example.project.todayForecast

import androidx.compose.runtime.Composable
import io.ktor.client.HttpClient

class TodayForecastFactory {
    companion object  {
        @Composable
        fun makeView(httpClient: HttpClient) {
            // we will need it into the fetch forecast method the client
            val dependencies = TodayForecastViewModel.Dependencies(fetchForecast = { "" })
            val viewModel = TodayForecastViewModel(dependencies = dependencies)
            return TodayForecast(viewModel = viewModel)
        }
    }
}