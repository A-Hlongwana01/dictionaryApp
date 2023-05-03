package com.example.myapplication.feature_dictionary.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.plcoding.dictionary.feature_dictionary.data.local.Converters
import com.plcoding.dictionary.feature_dictionary.data.local.WordInfoDao
import com.plcoding.dictionary.feature_dictionary.data.local.entity.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class WordInfoDatabase: RoomDatabase() {

    abstract val dao: WordInfoDao
}
