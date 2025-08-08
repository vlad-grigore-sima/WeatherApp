package org.example.project.networking

import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.darwin.Darwin

actual val engineProvider: HttpClientEngineFactory<*>
    get() = Darwin