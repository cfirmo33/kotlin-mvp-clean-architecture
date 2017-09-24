package com.petrulak.cleankotlin.ui.example1.fragment

import com.petrulak.cleankotlin.domain.model.Weather
import com.petrulak.cleankotlin.ui.base.BasePresenter
import com.petrulak.cleankotlin.ui.base.BaseView

interface Example1Contract {
    interface View : BaseView<Presenter> {
        override fun attachPresenter(presenter: Presenter)
        fun showWeather(data: Weather)
    }

    interface Presenter : BasePresenter<View> {
        override fun attachView(view: View)
        fun refresh()
    }
}
