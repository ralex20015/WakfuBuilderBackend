package com.ralex20015.wakfubuilder.network.dto.item

data class UseParametersDto(
    val useCostAp: Byte,
    val useCostMp: Byte,
    val useCostWp: Byte,
    val useRangeMin: Byte,
    val useRangeMax: Byte,
    val useTestFreeCell: Boolean,
    val useTestLos: Boolean,
    val useTestOnlyLine: Boolean,
    val useTestNoBorderCell: Boolean,
    val useWorldTarget: Byte,
)
