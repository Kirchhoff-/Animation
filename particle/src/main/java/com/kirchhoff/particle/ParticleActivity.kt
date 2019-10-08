package com.kirchhoff.particle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import me.wangyuwei.particleview.ParticleView

class ParticleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_particle)

        findViewById<ParticleView>(R.id.particleView).startAnim()
    }
}
