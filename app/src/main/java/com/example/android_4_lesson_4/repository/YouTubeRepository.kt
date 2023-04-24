package com.example.android_4_lesson_4.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.android_4_lesson_4.data.remote.apiserveces.YouTubeApiService
import com.example.youtubeapi.data.repository.pagingsource.YouTubePagingSource
import javax.inject.Inject

class YouTubeRepository @Inject constructor(
    private val youTubeApiService: YouTubeApiService
) {
    fun fetchVideos() = Pager(
        PagingConfig(pageSize = 20, initialLoadSize = 20)
    ) {
        YouTubePagingSource(youTubeApiService)
    }.liveData
}