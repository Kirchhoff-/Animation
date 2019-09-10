package com.kirchhoff.animation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

import com.example.TickerActivity
import com.example.alerter.AlerterActivity
import com.example.loadingbutton.LoadingButtonActivity
import com.kirchhoff.animation.expandable.ExpandableLinearLayoutActivity
import com.kirchhoff.animation.recycler.focusresize.FocusResizeActivity
import com.kirchhoff.animation.recycler.vega.VegaManagerActivity
import com.kirchhoff.animation.scaling.ScalingMainActivity
import com.kirchhoff.particle.ParticleActivity
import com.kirchhoff.swipeback.SwipeBackLayoutActivity

@Suppress("UNUSED_PARAMETER")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ticker(view: View) = startActivity(TickerActivity::class.java)
    fun particleView(view: View) = startActivity(ParticleActivity::class.java)
    fun alerter(view: View) = startActivity(AlerterActivity::class.java)
    fun focusResize(view: View) = startActivity(FocusResizeActivity::class.java)
    fun loadingButton(view: View) = startActivity(LoadingButtonActivity::class.java)
    fun swipeBackLayout(view: View) = startActivity(SwipeBackLayoutActivity::class.java)
    fun expandableLinearLayout(view: View) = startActivity(ExpandableLinearLayoutActivity::class.java)
    fun vegaLayoutManager(view: View) = startActivity(VegaManagerActivity::class.java)
    fun scalingLayoutExample(view: View) = startActivity(ScalingMainActivity::class.java)

    private fun startActivity(clazz: Class<*>) {
        startActivity(Intent(this, clazz))
    }
}
