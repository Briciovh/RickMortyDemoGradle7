package com.example.rickmortydemogradle7.model

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("info") val info: Info,
    @SerializedName("results") val results: List<Results>
)