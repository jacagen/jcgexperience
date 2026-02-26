package com.jacagen.jcgexperience

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform