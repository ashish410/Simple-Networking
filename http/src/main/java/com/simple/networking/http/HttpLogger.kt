package com.simple.networking.http

import android.util.Log

internal object HttpLogger {
    var isLogsRequired = true
    fun d(tag: String?, message: String?) {
        if (isLogsRequired) Log.d(tag, message!!)
    }

    fun e(tag: String?, message: String?) {
        if (isLogsRequired) Log.e(tag, message!!)
    }
}