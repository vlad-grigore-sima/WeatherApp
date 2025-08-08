package org.example.project.todayForecast

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.launch
import org.example.project.networking.makeHttpClient
import org.example.project.networking.testRequest

@Composable
fun TodayForecast() {
    val scope = rememberCoroutineScope()

    return Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        contentAlignment = Alignment.Center // centers content inside the Box
    ) {
        Button(onClick = {
            val httpClient = makeHttpClient()
            scope.launch {
                testRequest(httpClient = httpClient)
            }
        }) {
            Text("Click Me")
        }
    }
}