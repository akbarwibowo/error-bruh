package com.example.lelangku_coba_api.data.remote

import com.example.lelangku_coba_api.data.remote.response.MyProductsItem
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("photos")
    suspend fun getProducts(): Response<MyProductsItem>
}