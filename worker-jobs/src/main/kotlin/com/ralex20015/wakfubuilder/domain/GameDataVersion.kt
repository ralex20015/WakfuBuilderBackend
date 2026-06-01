package com.ralex20015.wakfubuilder.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "game_data_version")
class GameDataVersion(
    @Id
    val id: Long = 1L,
    val version: String
)
