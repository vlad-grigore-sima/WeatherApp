package org.example.project.networking

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

expect fun makeHttpClient(): HttpClient

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