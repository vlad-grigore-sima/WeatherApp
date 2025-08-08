package org.example.project.todayForecast

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun TodayForecast() {
    return Box(modifier = Modifier.fillMaxSize().background(Color.Green))
}