package com.david422.databindingtest


import android.app.PendingIntent
import android.content.Context
import com.david422.databindingtest.di.ApplicationComponent
import com.david422.databindingtest.di.DaggerApplicationComponent
import com.david422.databindingtest.di.module.ApplicationModule
import com.david422.databindingtest.ui.login.LoginMvvm

import timber.log.Timber
import javax.inject.Inject

/**
 * Created by dpodolak on 17.11.16.
 */

class TApplication : android.app.Application() {


    companion object {
        @JvmStatic lateinit var appComponent: ApplicationComponent
        @JvmStatic lateinit var appModule: ApplicationModule
    }

    @Inject
    lateinit var context: Context


    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        appModule = ApplicationModule(this)
        appComponent = DaggerApplicationComponent.builder().applicationModule(appModule).build()
        appComponent.inject(this)

        Timber.d("is context: " + (context != null))
//        appComponent = DaggerLoginComponent.builder().loginModule(ActivityModule()).build()


    }


}
