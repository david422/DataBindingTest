package com.david422.databindingtest.ui.base

import android.databinding.BaseObservable
import com.david422.databindingtest.ui.base.BaseMvvm

/**
 * Created by dpodolak on 23.11.16.
 */
open abstract class BaseViewModelImpl<V : BaseMvvm.View> : BaseMvvm.ViewModel {

    lateinit var baseView : V

    override fun setView(view: BaseMvvm.View) {
        baseView = view as V
        onViewSet()
    }

    override fun onPause() {
    }

    override fun onDestroy() {
    }

    override fun onResume() {
    }

    abstract fun onViewSet()
}
