package com.kirchhoff.animation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.example.TickerActivity
import com.example.alerter.AlerterActivity
import com.example.loadingbutton.LoadingButtonActivity
import com.example.vegalayoutmanager.VegaManagerActivity
import com.kirchhoff.focusresize.FocusResizeActivity
import com.kirchhoff.expandablelayout.ExpandableLayoutActivity
import com.kirchhoff.particle.ParticleActivity
import com.kirchhoff.scalinglayout.ScalingMainActivity
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
    fun expandableLayout(view: View) = startActivity(ExpandableLayoutActivity::class.java)
    fun vegaLayoutManager(view: View) = startActivity(VegaManagerActivity::class.java)
    fun scalingLayoutExample(view: View) = startActivity(ScalingMainActivity::class.java)

    private fun startActivity(clazz: Class<*>) {
        startActivity(Intent(this, clazz))
    }
}
