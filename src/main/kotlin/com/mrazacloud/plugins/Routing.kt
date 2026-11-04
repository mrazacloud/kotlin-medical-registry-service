package com.mrazacloud.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        // Essential endpoint used by our Application Load Balancer health checks
        get("/health") {
            call.respond(mapOf("status" to "UP", "service" to "clinical-registry-backend"))
        }

        get("/api/v1/patients") {
            call.respond(listOf(
                mapOf("id" to 1, "status" to "Secured", "registry" to "Enforced")
            ))
        }
    }
}