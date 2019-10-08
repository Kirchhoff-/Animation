package com.kirchhoff.scalinglayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class ScalingMainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_scaling_main)
        findViewById<View>(R.id.bScalingLayoutFab).setOnClickListener(this)
        findViewById<View>(R.id.bScalingLayoutSearchBar).setOnClickListener(this)
        findViewById<View>(R.id.bScalingLayoutCollapsing).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.bScalingLayoutFab -> startActivity(ScalingFab::class.java)
            R.id.bScalingLayoutSearchBar -> startActivity(ScalingSearchBar::class.java)
            R.id.bScalingLayoutCollapsing -> startActivity(ScalingCollapsing::class.java)
        }
    }

    private fun startActivity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}
