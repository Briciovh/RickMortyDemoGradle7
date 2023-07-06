package com.example.rickmortydemogradle7.di

import com.example.rickmortydemogradle7.api.RickAndMortyApiHelper
import com.example.rickmortydemogradle7.api.RickAndMortyApiHelperImp
import com.example.rickmortydemogradle7.api.RickAndMortyApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RickAndMortyModule {

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): RickAndMortyApiService =
        retrofit.create(RickAndMortyApiService::class.java)

    @Provides
    @Singleton
    fun provideApiHelper(apiHelper: RickAndMortyApiHelperImp): RickAndMortyApiHelper = apiHelper

}