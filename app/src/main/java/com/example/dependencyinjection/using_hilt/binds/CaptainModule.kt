package com.example.dependencyinjection.using_hilt.binds

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class CaptainModule {
    //In Bind Case Careem Repository binds with Careem Captain, Whenever user calls for captain repository object it will always return Careem Captain object..........
    @Binds
    abstract fun provideCaptainRepository(careemCaptain: CareemCaptain): CaptainRepository
}