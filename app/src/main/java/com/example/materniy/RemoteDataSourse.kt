package com.example.materniy

import android.telecom.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


    interface GitHubService {
        @GET("insult")
        suspend fun materki(@Path("insult") mat: String): Materki
    }

    var retrofit = Retrofit.Builder()
        .baseUrl("https://evilinsult.com/generate_insult.php?lang=en&type=json")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    var gitHubService:GitHubService = retrofit.create(GitHubService::class.java)
