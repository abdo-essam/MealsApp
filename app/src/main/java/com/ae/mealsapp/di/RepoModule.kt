package com.ae.mealsapp.di
import com.ae.data.remote.meals.MealsApi
import com.ae.data.repo.meals.MealsRepoImpl
import com.ae.domain.repo.meals.MealsRepo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun providedMealsRepo(
        mealsApi: MealsApi,
    ): MealsRepo {
        return MealsRepoImpl(mealsApi)
    }
}