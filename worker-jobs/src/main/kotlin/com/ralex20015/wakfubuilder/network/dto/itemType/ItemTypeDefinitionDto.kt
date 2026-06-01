package com.ralex20015.wakfubuilder.network.dto.itemType

data class ItemTypeDefinitionDto(
    val id: Short,
    val parentId: Short,
    val equipmentPositions: List<String?>,
    val equipmentDisabledPositions: List<String?>,
    val isRecyclable: Boolean,
    val isVisibleAnimation: Boolean,
)