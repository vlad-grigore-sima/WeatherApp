package org.example.project.todayForecast

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun TodayForecast(viewModel: TodayForecastViewModel) {
    val forecast by viewModel.forecast.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadForecast()
    }

    return Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        contentAlignment = Alignment.Center // centers content inside the Box
    ) {
        Column {
            Button(onClick = {
            }) {
                Text("Click Me")
            }

            forecast?.let { Text(text = it.cityName) }
        }
    }
}