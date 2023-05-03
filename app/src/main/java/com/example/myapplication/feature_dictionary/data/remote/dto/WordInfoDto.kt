package com.example.myapplication.feature_dictionary.data.remote.dto

import com.example.myapplication.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val license: License,
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
//    val sourceUrls: List<String>,
    val word: String,
    val origin: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings.map { it.toMeaning() },
            license = license,
            phonetic = phonetic,
            //            sourceUrls = sourceUrls,
            origin = origin,
            phonetics = phonetics
        )
    }
}