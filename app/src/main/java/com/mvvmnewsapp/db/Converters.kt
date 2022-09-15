package com.mvvmnewsapp.db

import androidx.room.TypeConverter
import com.mvvmnewsapp.models.Source
import org.json.JSONObject

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return JSONObject().apply {
            put("id", source.id)
            put("name", source.name)
        }.toString()

    }

    @TypeConverter
    fun toSource(source: String): Source {
        val json = JSONObject(source)
        return Source(json.get("id"),
        json.getString("name"))
    }
}