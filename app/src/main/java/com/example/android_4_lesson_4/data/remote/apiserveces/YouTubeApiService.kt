package com.example.android_4_lesson_4.data.remote.apiserveces

import com.example.android_4_lesson_4.model.ResponseModel
import com.example.android_4_lesson_4.model.YoutubeModel
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeApiService {
    @GET("videos")
    suspend fun fetchYouTube(
        @Query("regionCode") regionCode: String = "ru",
        @Query("part") part: String = "snippet,statistics",
        @Query("chart") chart: String = "mostPopular",
        @Query("pageToken") pageToken: String
    ): ResponseModel<YoutubeModel>
}