package com.github.maksimkirko.bottom_navigation_demo_kotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.maksimkirko.bottom_navigation_demo_kotlin.R

class SendScreenFragment : ScreenFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_default_screen, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initTitleView("Send")
    }
}
