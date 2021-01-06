# Simple-Networking


<!-- ABOUT THE PROJECT -->
## About The Project

A very simple android networking library. It is built entirely in kotlin. Internals are not complex for this library, it simply uses HttpURLConnnection. But it does proper thread management. Just make request and listen for the response. <br> 
This project was part of my first article on medium. Here is the article [link](https://medium.com/@ay3524/build-a-simple-networking-library-in-android-3ec67a515a8e)


## Requirements

Simple android networking library supports Android 5.0 (Lollipop) and later.

<!-- GETTING STARTED -->
## Getting Started

Add this in your app/build.gradle
```groovy
implementation 'com.simple.networking:http:0.1.0'
```

Add this in your project/build.gradle
```groovy
repositories {
    maven {
        url "url  "https://simple-android-libs.bintray.com/SimpleAndroidNetworking"
    }
}
```

### Making a GET Request (JSONArray Response)
```java
        Http.Request(Http.GET)
            .url("https://jsonplaceholder.typicode.com/users")
            .enableLog(true)
            .execute(object : JSONArrayListener {
                override fun onResponse(res: JSONArray?) {

                }

                override fun onFailure(e: Exception?) {
                    
                }
            })              
```

### Making a GET Request (JSONObject Response)
```java
        Http.Request(Http.GET)
            .url("https://jsonplaceholder.typicode.com/users/1")
            .enableLog(true)
            .execute(object : JSONObjectListener {
                override fun onResponse(res: JSONObject?) {

                }

                override fun onFailure(e: Exception?) {

                }
            })
```

### Making a Request with header
```java
        Http.Request(Http.GET)
            .url("https://jsonplaceholder.typicode.com/users")
            .header("k1", "v1")
            .header("k2", "v2")
            .enableLog(true)
            .execute(object : JSONArrayListener {
                override fun onResponse(res: JSONArray?) {
                    Log.d("MainActivity", res.toString())
                }

                override fun onFailure(e: Exception?) {
                    Log.d("MainActivity", e.toString())
                }
            })
```

### Making a Request with header (or using map)
```java
        val headerMap: HashMap<String, String> = HashMap()
        headerMap["k1"] = "v1"
        headerMap["k2"] = "v2"
        Http.Request(Http.GET)
            .url("https://jsonplaceholder.typicode.com/users")
            .header(headerMap)
            .enableLog(true)
            .execute(object : JSONArrayListener {
                override fun onResponse(res: JSONArray?) {
                    Log.d("MainActivity", res.toString())
                }

                override fun onFailure(e: Exception?) {
                    Log.d("MainActivity", e.toString())
                }
            })
```

### Making a POST Request
```java
        val js = JSONObject()
        js.put("name", "ashish")
        Http.Request(Http.POST)
            .url("https://jsonplaceholder.typicode.com/users")
            .body(js)
            .enableLog(true)
            .execute(object : JSONObjectListener {
                override fun onResponse(res: JSONObject?) {

                }

                override fun onFailure(e: Exception?) {

                }
            })
```


### Making a PUT Request
```java
        val js = JSONObject()
        js.put("name", "ashish")
        Http.Request(Http.PUT)
            .url("https://jsonplaceholder.typicode.com/users")
            .body(js)
            .enableLog(true)
            .execute(object : JSONObjectListener {
                override fun onResponse(res: JSONObject?) {
                    
                }

                override fun onFailure(e: Exception?) {

                }
            })
```

### Making a DELETE Request
```java
        val js = JSONObject()
        js.put("name", "ashish")
        Http.Request(Http.DELETE)
            .url("https://jsonplaceholder.typicode.com/users")
            .body(js)
            .enableLog(true)
            .execute(object : JSONObjectListener {
                override fun onResponse(res: JSONObject?) {

                }

                override fun onFailure(e: Exception?) {

                }
            })
```


### Contact - Let's become friend
- [Twitter](https://twitter.com/ashishy410)
- [Medium](https://medium.com/@ay3524)
- [LinkedIn](https://www.linkedin.com/in/ay3524)
