package com.example.myapplication.feature_dictionary.data.remote.dto

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String,
    val origin: String
) {
    fun toWordInfoEntity(): com.example.myapplication.feature_dictionary.domain.model.WordInfo {
        return com.example.myapplication.feature_dictionary.domain.model.WordInfo(
            meanings = meanings.map { it.toMeaning() },
            phonetic = phonetic,
            origin = origin,
            word = word
        )
    }
}