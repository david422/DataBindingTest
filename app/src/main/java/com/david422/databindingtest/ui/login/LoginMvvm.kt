package com.david422.databindingtest.ui.login

import android.databinding.Bindable
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.text.TextWatcher
import com.david422.databindingtest.ui.base.BaseMvvm

/**
 * Created by dpodolak on 17.11.16.
 */

interface LoginMvvm {

    interface View : BaseMvvm.View {

        fun openNextActivtiy()

    }

    interface ViewModel : BaseMvvm.ViewModel {

        var passwordCorect: ObservableBoolean

        var loginCorect: ObservableBoolean

        fun emailTextWatcher(): TextWatcher

        fun passwordTextWatcher() : TextWatcher

        fun text(): String

        fun searchClick(view: android.view.View)

        fun login()

    }
}
