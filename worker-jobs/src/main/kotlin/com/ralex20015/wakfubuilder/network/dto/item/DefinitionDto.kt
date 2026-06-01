package com.ralex20015.wakfubuilder.network.dto.item

data class DefinitionDto(
    val itemDefinitionDto: ItemDefinitionDto,
    val useEffects: List<EffectDto>,
    val useCriticalEffects: List<EffectDto>,
    val equipEffects: List<EffectDto>,
)
