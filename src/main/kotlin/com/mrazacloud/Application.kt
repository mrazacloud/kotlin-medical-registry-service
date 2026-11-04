package com.mrazacloud

import io.ktor.server.application.*
import com.mrazacloud.plugins.*
import com.mrazacloud.repository.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureSerialization()
    configureRouting()
}