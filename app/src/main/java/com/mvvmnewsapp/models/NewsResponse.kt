package com.mvvmnewsapp.models

import com.mvvmnewsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)