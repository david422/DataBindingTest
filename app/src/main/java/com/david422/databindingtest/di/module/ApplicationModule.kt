package com.david422.databindingtest.di.module

import android.content.Context
import android.support.design.widget.TabLayout
import com.david422.databindingtest.TApplication
import com.david422.databindingtest.di.scope.PerActivity
import com.david422.databindingtest.di.scope.PerApplication
import com.david422.databindingtest.ui.login.LoginMvvm
import com.david422.databindingtest.ui.login.LoginViewModelImpl
import dagger.Module
import dagger.Provides
import timber.log.Timber
import javax.inject.Named

/**
 * Created by dpodolak on 22.11.16.
 */

@Module
class ApplicationModule(var app: TApplication) {

    @PerApplication
    @Provides
    fun provideContext(): Context {
        return app.applicationContext
    }

    @Named("test")
    @Provides
    fun provideTestString() : String {
        return "test"
    }

}