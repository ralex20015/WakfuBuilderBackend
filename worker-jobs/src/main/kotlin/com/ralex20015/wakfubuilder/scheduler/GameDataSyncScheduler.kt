package com.ralex20015.wakfubuilder.scheduler

import com.ralex20015.wakfubuilder.service.GameDataSyncService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class GameDataSyncScheduler(private val syncService: GameDataSyncService) {

    @Scheduled(cron = "\${scheduling.game-data-sync-cron}")
    fun syncGameData() = syncService.syncIfOutdated()
}
