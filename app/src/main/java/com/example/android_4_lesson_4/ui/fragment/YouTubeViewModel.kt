package com.example.android_4_lesson_4.ui.fragment

import com.example.android_4_lesson_4.base.BaseViewModel
import com.example.android_4_lesson_4.repository.YouTubeRepository

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class YouTubeViewModel @Inject constructor (
    private val youTubeRepository: YouTubeRepository
) : BaseViewModel() {

    fun fetchYouTube() = youTubeRepository.fetchVideos()
}