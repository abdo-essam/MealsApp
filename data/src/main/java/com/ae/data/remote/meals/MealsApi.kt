package com.ae.data.remote.meals

import com.ae.domain.entity.meals.MealsModelResponse
import retrofit2.http.GET

interface MealsApi {
    @GET("api/json/v1/1/categories.php")
    suspend fun getMealsRequest(): MealsModelResponse
}