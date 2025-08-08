package org.example.project.networking

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

expect val engineProvider: HttpClientEngineFactory<*>

fun makeHttpClient(engine: HttpClientEngine): HttpClient{
    return HttpClient(engine) {
        install(Logging) {
            level = LogLevel.ALL
        }
        install(ContentNegotiation) {
            json(
                json = Json {
                    ignoreUnknownKeys = true

                }
            )
        }
    }
}

data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)

suspend fun testRequest(httpClient: HttpClient) {
    try {
        val response = httpClient.get(urlString = "https://jsonplaceholder.typicode.com/posts").body<List<Post>>()
        println(response)
    } catch (e: Exception) {
        println(e)
    }
}