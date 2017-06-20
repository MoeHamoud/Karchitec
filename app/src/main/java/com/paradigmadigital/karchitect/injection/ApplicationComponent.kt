package com.paradigmadigital.karchitect.injection

import com.paradigmadigital.karchitect.api.ApiModule
import com.paradigmadigital.karchitect.domain.DomainModule
import com.paradigmadigital.karchitect.platform.ActivityModule
import com.paradigmadigital.karchitect.platform.ApplicationModule
import com.paradigmadigital.karchitect.ui.detail.DetailViewModel
import com.paradigmadigital.karchitect.ui.main.MainViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        ApiModule::class,
        DomainModule::class))
interface ApplicationComponent {

    fun inject(into: MainViewModel)

    fun inject(into: DetailViewModel)

    fun plus(homeModule: ActivityModule): ActivityComponent
}
