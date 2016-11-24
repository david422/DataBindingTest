package com.david422.databindingtest.ui.base

/**
 * Created by dpodolak on 23.11.16.
 */
interface BaseMvvm {

    interface View

    interface ViewModel {

        fun setView(view: View)

        fun onResume()

        fun onPause()

        fun onDestroy()
    }
}