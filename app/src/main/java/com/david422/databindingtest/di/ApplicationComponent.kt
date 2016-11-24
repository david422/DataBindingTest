package com.david422.databindingtest.di

import com.david422.databindingtest.TApplication
import com.david422.databindingtest.di.module.ApplicationModule
import com.david422.databindingtest.di.scope.PerApplication

import dagger.Component

/**
 * Created by dpodolak on 22.11.16.
 */

@PerApplication
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(app: TApplication)

}
