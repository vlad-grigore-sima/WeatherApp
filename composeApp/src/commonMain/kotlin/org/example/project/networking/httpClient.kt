package org.example.project.networking

import io.ktor.client.HttpClient

expect fun makeHttpClient(): HttpClient

// Never commit this
const val apiKey = ""
const val baseURL = " https://api.weatherapi.com/v1/forecast.json"