package com.ralex20015.wakfubuilder.network.dto.item

data class BaseParametersDto(
    val itemTypeId: Int,
    val itemSetId: Int,
    val rarity: Byte,
    val bindType: Byte,
    val minimumShardSlotNumber: Byte,
    val maximumShardSlotNumber: Byte,
)