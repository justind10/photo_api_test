package com.example.photoapitest.model.remote

import com.example.photoapitest.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

interface PhotoApi {
    //https://pixabay.com/
    // api/?
    // key=22209845-0e41a1e637ade5054d52c799e
    // &safesearch=true
    // &per_page=50
    @GET(BuildConfig.END_POINT)
    suspend fun getPhotos(
        @Query("key")
        key : String = "22209845-0e41a1e637ade5054d52c799e",
        @Query("safesearch")
        searchType : Boolean = true,
        @Query("per_page")
        responseSize: Int = 50
    )



}