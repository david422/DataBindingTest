package com.david422.databindingtest.ui.base

import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import com.david422.databindingtest.di.ActivityComponent
import com.david422.databindingtest.di.DaggerActivityComponent
import com.david422.databindingtest.di.module.ActivityModule
import javax.inject.Inject

/**
 * Created by dpodolak on 24.11.16.
 */
open class BaseActivity<VM : BaseMvvm.ViewModel> : AppCompatActivity() {

    @Inject lateinit var viewModel : VM

    lateinit var activityComponent : ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           activityComponent = DaggerActivityComponent.builder().activityModule(ActivityModule(this)).build()
    }
}