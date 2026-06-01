package com.ralex20015.wakfubuilder.network.dto.item

import com.ralex20015.wakfubuilder.network.dto.TitleDto

data class ItemDto(
    val definitionDto: DefinitionDto,
    val titleDto: TitleDto,
    val descriptionDto: DescriptionDto,
)
