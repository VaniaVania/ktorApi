package com.ivan.plugins

import com.ivan.routes.randomCar
import io.ktor.routing.*
import io.ktor.http.content.*
import io.ktor.application.*

fun Application.configureRouting() {
    routing {
        randomCar()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
