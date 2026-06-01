package com.ralex20015.wakfubuilder.network.dto.item

data class ItemDefinitionDto(
    val id: Long,
    val level: Int,
    val baseParameters: BaseParametersDto,
    val useParameters: UseParametersDto,
    val graphicParameters: GraphicParametersDto,
    val properties: List<Any?>
)