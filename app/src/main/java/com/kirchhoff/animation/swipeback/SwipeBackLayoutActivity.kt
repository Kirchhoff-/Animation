package com.kirchhoff.animation.swipeback

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.gw.swipeback.SwipeBackLayout
import com.kirchhoff.animation.R

class SwipeBackLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_swipe_back_layout)
        initView()
    }

    private fun initView() {
        val swipeBackLayout = findViewById<SwipeBackLayout>(R.id.swipeBackLayout)

        findViewById<Button>(R.id.bLeft).setOnClickListener {
            swipeBackLayout.directionMode = SwipeBackLayout.FROM_LEFT
            swipeBackLayout.maskAlpha = 125
            swipeBackLayout.swipeBackFactor = 0.6f
        }

        findViewById<Button>(R.id.bRight).setOnClickListener {
            swipeBackLayout.directionMode = SwipeBackLayout.FROM_RIGHT
            swipeBackLayout.maskAlpha = 175
            swipeBackLayout.swipeBackFactor = 0.5f
        }

        findViewById<Button>(R.id.bTop).setOnClickListener {
            swipeBackLayout.directionMode = SwipeBackLayout.FROM_TOP
            swipeBackLayout.maskAlpha = 255
            swipeBackLayout.swipeBackFactor = 0.7f
        }

        findViewById<Button>(R.id.bBottom).setOnClickListener {
            swipeBackLayout.directionMode = SwipeBackLayout.FROM_BOTTOM
            swipeBackLayout.maskAlpha = 0
            swipeBackLayout.swipeBackFactor = 0.8f
        }
    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(0, 0)
    }
}
