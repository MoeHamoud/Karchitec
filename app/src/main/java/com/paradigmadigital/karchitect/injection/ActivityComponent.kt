package com.paradigmadigital.karchitect.injection

import com.paradigmadigital.karchitect.platform.ActivityModule
import com.paradigmadigital.karchitect.ui.detail.DetailActivity
import com.paradigmadigital.karchitect.ui.main.MainActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(detailActivity: DetailActivity)
}
