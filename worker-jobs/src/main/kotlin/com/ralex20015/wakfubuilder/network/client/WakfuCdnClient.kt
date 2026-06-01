package com.ralex20015.wakfubuilder.network.client

import com.ralex20015.wakfubuilder.network.dto.GameDataConfigDto
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient

@Component
class WakfuCdnClient(private val restClient: RestClient) {

    fun fetchConfig(): GameDataConfigDto =
        restClient.get()
            .uri("config.json")
            .retrieve()
            .body(GameDataConfigDto::class.java)!!
}
