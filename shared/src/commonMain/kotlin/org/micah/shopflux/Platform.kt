package org.micah.shopflux

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform