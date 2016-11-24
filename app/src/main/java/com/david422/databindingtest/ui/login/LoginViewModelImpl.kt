package com.david422.databindingtest.ui.login

import android.databinding.ObservableBoolean
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.david422.databindingtest.ui.base.BaseViewModelImpl

import timber.log.Timber

/**
 * Created by dpodolak on 17.11.16.
 */

class LoginViewModelImpl : BaseViewModelImpl<LoginMvvm.View>(), LoginMvvm.ViewModel{

    override var passwordCorect: ObservableBoolean = ObservableBoolean()

    override var loginCorect: ObservableBoolean = ObservableBoolean()

    override fun passwordTextWatcher(): TextWatcher {
        return object : TextWatcher{

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                passwordCorect.set(p0!!.length > 2)
                Timber.d("Password text change: isDataCorrect: %b, text: %s, is ", passwordCorect.get(), p0)
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        }
    }

    override fun login() {
        baseView.openNextActivtiy()
    }


    override fun onViewSet() {
        Timber.d("is view: " + (baseView != null))
    }

    override fun searchClick(view: View) {
        Timber.d("Click view")
    }


    override fun emailTextWatcher(): TextWatcher {
        return object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                loginCorect.set(p0!!.length > 2)
            }

        }
    }

    override fun text(): String {
        return "test"
    }
}
