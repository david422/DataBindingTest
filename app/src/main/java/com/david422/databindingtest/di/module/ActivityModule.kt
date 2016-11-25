package com.david422.databindingtest.di.module

import android.app.Activity
import android.content.Context
import com.david422.databindingtest.di.scope.PerActivity
import com.david422.databindingtest.ui.login.LoginActivity

import dagger.Module
import dagger.Provides
/**
 * Created by dpodolak on 18.11.16.
 */

@Module
class ActivityModule constructor(var activity: Activity){

    @PerActivity
    @Provides
    fun providesContext(): Context{
        return activity.applicationContext;
    }

}
