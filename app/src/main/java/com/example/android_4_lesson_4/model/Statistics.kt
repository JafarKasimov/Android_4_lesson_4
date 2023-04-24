package com.example.android_4_lesson_4.model

import com.google.gson.annotations.SerializedName

data class Statistics(
    @SerializedName("viewCount")
    val viewCount: String? = null,
    @SerializedName("likeCount")
    val likeCount: String
)