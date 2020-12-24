package com.simple.networking.http

import org.json.JSONObject

interface JSONObjectListener {
    fun onResponse(req: Http.Request?, res: JSONObject?)
    fun onFailure(req: Http.Request?, res: Http.Response?, e: Exception?)
}