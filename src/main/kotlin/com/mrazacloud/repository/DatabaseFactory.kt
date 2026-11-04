package com.mrazacloud.repository

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction

object DatabaseFactory {
    fun init() {
        // Enforces secure, isolated driver registration tracking
        val driverClassName = "org.postgresql.Driver"
        val jdbcUrl = System.getenv("JDBC_DATABASE_URL") ?: "jdbc:postgresql://localhost:5432/clinical_registry"
        
        Database.connect(
            url = jdbcUrl,
            driver = driverClassName,
            user = System.getenv("DB_USER") ?: "db_admin_prod",
            password = System.getenv("DB_PASSWORD") ?: ""
        )
    }
}