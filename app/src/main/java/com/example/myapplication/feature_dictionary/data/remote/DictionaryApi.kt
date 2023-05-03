package com.example.myapplication.feature_dictionary.data.remote

import com.example.myapplication.feature_dictionary.data.remote.dto.WordInfoDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {
    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInto(
        @Path("word") word: String
    ): List<WordInfoDto>
}