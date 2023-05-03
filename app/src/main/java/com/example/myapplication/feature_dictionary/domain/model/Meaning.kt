package com.example.myapplication.feature_dictionary.domain.model

import com.example.myapplication.feature_dictionary.data.remote.dto.Definition

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)
