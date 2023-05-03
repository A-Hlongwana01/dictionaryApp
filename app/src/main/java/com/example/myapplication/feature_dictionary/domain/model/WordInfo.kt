package com.example.myapplication.feature_dictionary.domain.model

import com.example.myapplication.feature_dictionary.data.remote.dto.License
import com.example.myapplication.feature_dictionary.data.remote.dto.PhoneticDto

data class WordInfo(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
)