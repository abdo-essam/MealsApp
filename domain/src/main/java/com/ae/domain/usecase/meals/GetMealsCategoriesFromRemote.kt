package com.ae.domain.usecase.meals

import com.ae.domain.repo.meals.MealsRepo

class GetMealsCategoriesFromRemote(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke() = mealsRepo.getMealsCategoriesFromRemote()
}