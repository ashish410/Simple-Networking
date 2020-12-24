package com.simple.networking.http

interface ProgressListener {
    fun download(
        directory: String?,
        fileName: String?,
        url: String?,
        listener: ResponseListener?,
        priority: Int
    )

    interface ResponseListener {
        fun onSuccess()
        fun onFailure()
    }
}