package com.example.rickmortydemogradle7.api

import com.example.rickmortydemogradle7.model.CharacterResponse
import com.example.rickmortydemogradle7.model.Results
import retrofit2.Response

interface RickAndMortyApiHelper {

    suspend fun getCharacters(page: Int): Response<CharacterResponse>

    suspend fun getCharacterById(charId: Int): Response<Results>

}