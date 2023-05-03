package com.example.myapplication.feature_dictionary.domain.repository

import com.example.myapplication.feature_dictionary.domain.model.WordInfo
import com.example.myapplication.core.util.Resource
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}