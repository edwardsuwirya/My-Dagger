package com.enigmacamp.mydagger.di.module

import com.enigmacamp.mydagger.di.component.MainSubComponent
import com.enigmacamp.mydagger.di.scope.ActivityScope
import dagger.Module

@Module(subcomponents = [MainSubComponent::class])
class SubComponentModule {
}