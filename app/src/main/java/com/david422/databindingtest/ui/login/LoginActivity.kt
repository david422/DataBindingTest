package com.david422.databindingtest.ui.login

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle

import com.david422.databindingtest.R
import com.david422.databindingtest.databinding.ActivityLoginBinding
import com.david422.databindingtest.ui.base.BaseActivity
import com.david422.databindingtest.ui.main.MainActivity


class LoginActivity : BaseActivity<LoginMvvm.ViewModel>(), LoginMvvm.View{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityComponent.inject(this)
        val binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
        binding.viewModel = viewModel
        viewModel.setView(this)
    }

    override fun openNextActivtiy() {
        var activityIntent = Intent()
        activityIntent.setClass(this, MainActivity::class.java)
        startActivity(activityIntent)
    }
}
