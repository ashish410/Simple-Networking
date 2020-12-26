package com.simple.networking.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.simple.networking.Http
import com.simple.networking.JSONArrayListener
import org.json.JSONArray
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        thread {
            Http.Request(Http.GET)
                .url("https://jsonplaceholder.typicode.com/users")
                .enableLog(true)
                .execute(object : JSONArrayListener {
                    override fun onResponse(res: JSONArray?) {
                        Log.d("MainActivity", res.toString())
                    }

                    override fun onFailure(e: Exception?) {
                        Log.d("MainActivity", e.toString())
                    }
                })
        }
    }
}