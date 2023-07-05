package com.example.rickmortydemogradle7.repository

import com.example.rickmortydemogradle7.api.RickAndMortyApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val rickAndMortyApiHelper: RickAndMortyApiHelper) {

    suspend fun getCharacters(page: Int) = rickAndMortyApiHelper.getCharacters(page)

    suspend fun getCharacterById(charId: Int) = rickAndMortyApiHelper.getCharacterById(charId)

}