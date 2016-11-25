package com.david422.databindingtest.di.module

import com.david422.databindingtest.di.scope.PerActivity
import com.david422.databindingtest.ui.login.LoginMvvm
import com.david422.databindingtest.ui.login.LoginViewModelImpl
import com.david422.databindingtest.ui.main.MainMvvm
import com.david422.databindingtest.ui.main.MainViewModel
import dagger.Module
import dagger.Provides

/**
 * Created by dpodolak on 23.11.16.
 */
@Module
class ViewModelModule {

    @PerActivity
    @Provides
    fun provideLoginViewModel(): LoginMvvm.ViewModel {
        return LoginViewModelImpl()
    }

    @PerActivity
    @Provides
    fun provideMainViewModel(): MainMvvm.ViewModel {
        return MainViewModel()
    }
}
