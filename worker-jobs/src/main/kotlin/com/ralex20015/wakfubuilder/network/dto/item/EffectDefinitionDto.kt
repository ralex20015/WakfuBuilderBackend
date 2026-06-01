package com.ralex20015.wakfubuilder.network.dto.item

data class EffectDefinitionDto(
    val id: Long,
    val actionId: Int,
    val areaShape: Long,
    val areaSize: List<Int?>,
    val params: List<Double>
)