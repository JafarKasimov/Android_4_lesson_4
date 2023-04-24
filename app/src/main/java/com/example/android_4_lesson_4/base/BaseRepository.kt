package com.example.android_4_lesson_4.base

import androidx.lifecycle.liveData
import com.example.android_4_lesson_4.Resource

open class BaseRepository {

    fun<T> doRequest(request : suspend () -> T) = liveData {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(request()))
        }catch (exception : Exception){
            emit(Resource.Error(exception.localizedMessage ?: "Error", null))
        }
    }
}