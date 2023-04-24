package com.example.android_4_lesson_4.model

import com.google.gson.annotations.SerializedName

data class Snippet(
    @SerializedName("channelId")
    val channelId: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("assignable")
    val assignable: Boolean,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("channelTitle")
    val channelTitle: String,
    @SerializedName("thumbnails")
    val thumbnails: Thumbnails
)
