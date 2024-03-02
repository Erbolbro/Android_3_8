package com.example.android_3_8.di

import com.example.android_3_8.data.remote.apiservises.NewApi
import com.example.android_3_8.data.repositories.NewRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoriesModule {

    @Provides
    @Singleton
    fun provideNewsRepository(newApi: NewApi) = NewRepository(newApi)
}