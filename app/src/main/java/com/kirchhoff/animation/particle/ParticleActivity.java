package com.kirchhoff.animation.particle;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kirchhoff.animation.R;

import me.wangyuwei.particleview.ParticleView;

public class ParticleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.particle_activity);

        ParticleView particleView = (ParticleView)findViewById(R.id.particleView);

        particleView.startAnim();
    }
}
