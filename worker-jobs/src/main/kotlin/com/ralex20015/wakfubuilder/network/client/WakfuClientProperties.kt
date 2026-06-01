package com.ralex20015.wakfubuilder.network.client

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("client")
data class WakfuClientProperties(
    val baseUrl: String,
    val images: ImageProperties
) {
    data class ImageProperties(
        val primaryUrl: String,
        val secondaryUrl: String
    )
}
