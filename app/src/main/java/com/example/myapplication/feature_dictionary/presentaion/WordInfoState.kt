package com.example.myapplication.feature_dictionary.presentaion
import com.example.myapplication.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)