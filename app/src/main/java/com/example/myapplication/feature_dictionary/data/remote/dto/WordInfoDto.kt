package com.example.myapplication.feature_dictionary.data.remote.dto

import com.example.myapplication.feature_dictionary.data.local.entity.WordInfoEntity
import com.example.myapplication.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String,
    val origin: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings.map { it.toMeaning() },
            phonetic = phonetic,
            origin = origin
        )
    }
}