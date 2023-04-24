package com.example.android_4_lesson_4.model

import com.example.android_4_lesson_4.base.IBaseDiffModel
import com.google.gson.annotations.SerializedName

data class YoutubeModel(
    @SerializedName("id")
    override val id: String,
    @SerializedName("snippet")
    val snippet: Snippet,
    @SerializedName("statistics")
    val statistics: Statistics
): IBaseDiffModel
