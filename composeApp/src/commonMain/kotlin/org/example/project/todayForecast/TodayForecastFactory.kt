package org.example.project.todayForecast

import androidx.compose.runtime.Composable
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import org.example.project.networking.apiKey
import org.example.project.networking.baseURL

class TodayForecastFactory {
    companion object {
        @Composable
        fun makeView(httpClient: HttpClient) {
            val dependencies =
                TodayForecastViewModel.Dependencies(fetchForecast = { fetchForecast(httpClient = httpClient) })
            val viewModel = TodayForecastViewModel(dependencies = dependencies)
            return TodayForecast(viewModel = viewModel)
        }

        private suspend fun fetchForecast(httpClient: HttpClient): Forecast =
            httpClient.get(urlString = baseURL) {
                url {
                    parameters.append("key", apiKey)
                    parameters.append("q", "46.7667, 23.6")
                }
            }.body<ForecastResponse>().toDomain()
    }
}