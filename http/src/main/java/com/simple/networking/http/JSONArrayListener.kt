package com.simple.networking.http

import org.json.JSONArray

interface JSONArrayListener {
    fun onResponse(req: Http.Request?, res: JSONArray?)
    fun onFailure(req: Http.Request?, res: Http.Response?, e: Exception?)
}