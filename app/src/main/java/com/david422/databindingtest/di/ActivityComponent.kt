package com.david422.databindingtest.di

import android.app.Activity
import com.david422.databindingtest.di.module.ActivityModule
import com.david422.databindingtest.di.module.ViewModelModule
import com.david422.databindingtest.di.scope.PerActivity
import com.david422.databindingtest.ui.login.LoginActivity
import com.david422.databindingtest.ui.main.MainActivity

import dagger.Component
import javax.inject.Singleton

/**
 * Created by dpodolak on 18.11.16.
 */
@PerActivity
@Component(modules = arrayOf(ActivityModule::class, ViewModelModule::class))
interface ActivityComponent {

    fun inject(activity: LoginActivity)

    fun inject(activity: MainActivity)
}

