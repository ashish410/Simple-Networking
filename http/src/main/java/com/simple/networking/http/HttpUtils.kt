package com.simple.networking.http

import java.nio.charset.StandardCharsets

internal object HttpUtils {
    fun asString(data: ByteArray?): String =
        if (data == null || data.isEmpty()) "" else String(data, StandardCharsets.UTF_8)
}