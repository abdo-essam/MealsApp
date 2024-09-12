package com.ae.data.repo.meals

import com.ae.data.remote.meals.MealsApi
import com.ae.domain.entity.meals.MealsModelResponse
import com.ae.domain.repo.meals.MealsRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealsRepoImpl(private val mealsApi: MealsApi) : MealsRepo {
    override suspend fun getMealsCategoriesFromRemote(): MealsModelResponse =
        withContext(Dispatchers.IO) {
            return@withContext mealsApi.getMealsRequest()
        }
}