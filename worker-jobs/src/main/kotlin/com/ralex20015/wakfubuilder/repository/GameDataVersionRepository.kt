package com.ralex20015.wakfubuilder.repository

import com.ralex20015.wakfubuilder.domain.GameDataVersion
import org.springframework.data.jpa.repository.JpaRepository

interface GameDataVersionRepository : JpaRepository<GameDataVersion, Long>
