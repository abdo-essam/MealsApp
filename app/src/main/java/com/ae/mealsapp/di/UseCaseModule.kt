package com.ae.mealsapp.di
import com.ae.domain.repo.meals.MealsRepo
import com.ae.domain.usecase.meals.GetMealsCategoriesFromRemote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetDataFromRemoteUseCase(mainRepo: MealsRepo): GetMealsCategoriesFromRemote {
        return GetMealsCategoriesFromRemote(mainRepo)
    }


}