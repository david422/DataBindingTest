package com.david422.databindingtest.ui.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.david422.databindingtest.R
import com.david422.databindingtest.databinding.ActivityMainBinding
import com.david422.databindingtest.ui.base.BaseActivity

/**
 * Created by dpodolak on 24.11.16.
 */
class MainActivity : BaseActivity<MainMvvm.ViewModel>(), MainMvvm.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent.inject(this)
        var binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.mainVM = viewModel
    }
}