package com.example.dependencyinjection.using_hilt.qualifiers

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class SubjectModule {

    //Now here both the methods is returning subject repository, now in this case we will use qualifiers.....
    //We will create qualifier annotation and will use that qualifier instead of @Named due to spell mistakes...

    @Provides
    @MathQualifier
    fun provideMathRepository(): SubjectRepository {
        return MathRepository()
    }

    @Named("physics")
    @Provides
    fun providePhysicsRepository(): SubjectRepository {
        return PhysicsRepository()
    }
}