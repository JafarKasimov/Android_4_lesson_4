package com.example.android_4_lesson_4.data.remote.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor: Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url = request.url.newBuilder().addQueryParameter("key", "AIzaSyCLwx2OtfUCoE68K7LpiTnqM5WpsDyt-B8").build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}