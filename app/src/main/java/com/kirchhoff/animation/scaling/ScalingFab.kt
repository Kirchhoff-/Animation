package com.kirchhoff.animation.scaling

import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.kirchhoff.animation.R
import iammert.com.view.scalinglib.ScalingLayout
import iammert.com.view.scalinglib.ScalingLayoutListener
import iammert.com.view.scalinglib.State

class ScalingFab : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_scaling_fab)

        val fabIcon = findViewById<ImageView>(R.id.fabIcon)
        val filterLayout = findViewById<LinearLayout>(R.id.filterLayout)
        val scalingLayout = findViewById<ScalingLayout>(R.id.scalingLayout)

        scalingLayout.setListener(object : ScalingLayoutListener {
            override fun onCollapsed() {
                ViewCompat.animate(fabIcon).alpha(1f).setDuration(150).start()
                ViewCompat.animate(filterLayout).alpha(0f).setDuration(150).setListener(object : ViewPropertyAnimatorListener {
                    override fun onAnimationStart(view: View) {
                        fabIcon.visibility = View.VISIBLE
                    }

                    override fun onAnimationEnd(view: View) {
                        filterLayout.visibility = View.INVISIBLE
                    }

                    override fun onAnimationCancel(view: View) {

                    }
                }).start()
            }

            override fun onExpanded() {
                ViewCompat.animate(fabIcon).alpha(0f).setDuration(200).start()
                ViewCompat.animate(filterLayout).alpha(1f).setDuration(200).setListener(object : ViewPropertyAnimatorListener {
                    override fun onAnimationStart(view: View) {
                        filterLayout.visibility = View.VISIBLE
                    }

                    override fun onAnimationEnd(view: View) {
                        fabIcon.visibility = View.INVISIBLE
                    }

                    override fun onAnimationCancel(view: View) {

                    }
                }).start()
            }

            override fun onProgress(progress: Float) {
                if (progress > 0) {
                    fabIcon.visibility = View.INVISIBLE
                }

                if (progress < 1) {
                    filterLayout.visibility = View.INVISIBLE
                }
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
    }
}
