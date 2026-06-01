package com.ralex20015.wakfubuilder.service

import com.ralex20015.wakfubuilder.domain.GameDataVersion
import com.ralex20015.wakfubuilder.network.client.WakfuCdnClient
import com.ralex20015.wakfubuilder.repository.GameDataVersionRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class GameDataSyncService(
    private val wakfuCdnClient: WakfuCdnClient,
    private val repository: GameDataVersionRepository
) {
    private val log = LoggerFactory.getLogger(javaClass)

    fun syncIfOutdated() {
        val latest = wakfuCdnClient.fetchConfig().version
        val stored = repository.findById(1L).map { it.version }.orElse(null)

        if (stored == latest) {
            log.info("Game data is up to date (version {})", latest)
            return
        }

        log.info("New game data version detected: {} -> {}. Starting sync...", stored ?: "none", latest)
        repository.save(GameDataVersion(version = latest))
        // TODO: trigger JSON downloads here
    }
}
