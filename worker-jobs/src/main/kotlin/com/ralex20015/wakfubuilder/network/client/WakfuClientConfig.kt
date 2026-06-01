package com.ralex20015.wakfubuilder.network.client

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestClient

@Configuration
@EnableConfigurationProperties(WakfuClientProperties::class)
class WakfuClientConfig {

    @Bean
    fun wakfuRestClient(properties: WakfuClientProperties): RestClient =
        RestClient.builder()
            .baseUrl(properties.baseUrl)
            .build()
}
