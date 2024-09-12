package com.ae.domain.repo.meals

import com.ae.domain.entity.meals.MealsModelResponse

interface MealsRepo {
    suspend fun getMealsCategoriesFromRemote(): MealsModelResponse
}