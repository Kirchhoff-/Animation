package com.kirchhoff.animation.particle


import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.kirchhoff.animation.R

import me.wangyuwei.particleview.ParticleView

class ParticleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.particle_activity)

        findViewById<ParticleView>(R.id.particleView).startAnim()
    }
}
