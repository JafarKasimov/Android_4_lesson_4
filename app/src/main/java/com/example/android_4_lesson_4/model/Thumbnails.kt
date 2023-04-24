package com.example.android_4_lesson_4.model

import com.google.gson.annotations.SerializedName

data class Thumbnails(
    @SerializedName("maxres")
    val maxRes: MaxRes
)
