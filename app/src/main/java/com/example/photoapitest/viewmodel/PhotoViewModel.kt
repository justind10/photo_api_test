package com.example.photoapitest.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.photoapitest.model.remote.Network
import com.example.photoapitest.model.remote.PhotoApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

private const val TAG = "PhotoViewModel"
class PhotoViewModel:ViewModel() {

    private val networkService: PhotoApi by lazy{
        Network().api
    }

    /**
     * Executes immediately after Constructor invocation.
     */
    init {
        // todo execute network call
        //todo create the live data
        //todo update the livedata from coroutine response
        CoroutineScope(Dispatchers.IO).launch {
        val response = networkService.getPhotos()
            Log.d(TAG, "Coroutine response: $response")
        }
    }
}