package com.kirchhoff.scalinglayout

import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import iammert.com.view.scalinglib.ScalingLayout
import iammert.com.view.scalinglib.ScalingLayoutListener
import iammert.com.view.scalinglib.State

class ScalingSearchBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_scaling_search_bar)

        val textViewSearch = findViewById<TextView>(R.id.textViewSearch)
        val searchLayout = findViewById<RelativeLayout>(R.id.searchLayout)

        val scalingLayout = findViewById<ScalingLayout>(R.id.scalingLayout)
        scalingLayout.setListener(object : ScalingLayoutListener {
            override fun onCollapsed() {
                ViewCompat.animate(textViewSearch).alpha(1f).setDuration(150).start()
                ViewCompat.animate(searchLayout).alpha(0f).setDuration(150).setListener(object : ViewPropertyAnimatorListener {
                    override fun onAnimationStart(view: View) {
                        textViewSearch.visibility = View.VISIBLE
                    }

                    override fun onAnimationEnd(view: View) {
                        searchLayout.visibility = View.INVISIBLE
                    }

                    override fun onAnimationCancel(view: View) {

                    }
                }).start()
            }

            override fun onExpanded() {
                ViewCompat.animate(textViewSearch).alpha(0f).setDuration(200).start()
                ViewCompat.animate(searchLayout).alpha(1f).setDuration(200).setListener(object : ViewPropertyAnimatorListener {
                    override fun onAnimationStart(view: View) {
                        searchLayout.visibility = View.VISIBLE
                    }

                    override fun onAnimationEnd(view: View) {
                        textViewSearch.visibility = View.INVISIBLE
                    }

                    override fun onAnimationCancel(view: View) {

                    }
                }).start()
            }

            override fun onProgress(progress: Float) {
            }
        })
        scalingLayout.setOnClickListener {
            if (scalingLayout.state == State.COLLAPSED) {
                scalingLayout.expand()
            }
        }

        findViewById<View>(R.id.rootLayout).setOnClickListener {
            if (scalingLayout.state == State.EXPANDED) {
                scalingLayout.collapse()
            }
        }

        findViewById<View>(R.id.arrowBack).setOnClickListener {
            if (scalingLayout.state == State.EXPANDED) {
                scalingLayout.collapse()
            }
        }
    }
}
