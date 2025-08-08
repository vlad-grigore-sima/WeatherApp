package org.example.project.networking

import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.okhttp.OkHttp

actual val engineProvider: HttpClientEngineFactory<*>
    get() = OkHttp