package com.example.dependencyinjection.using_hilt.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

//Module is used to access 3rd party or built-in class functions........
// There are multiple level of components
// --Application Component
// --Activity Component
// --Fragment Component

@InstallIn(ActivityComponent::class)
@Module
class DriverModule {
    @Provides
    fun provideDriverRepository(): DriverRepository {
        return PrivateDriver()
    }
}