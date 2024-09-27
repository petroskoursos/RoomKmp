package org.example.roomdatabasekmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform