package com.simple.networking

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