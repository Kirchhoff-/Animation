package com.kirchhoff.animation.easysplash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.kirchhoff.animation.MainActivity;
import com.kirchhoff.animation.R;

import gr.net.maroulis.library.EasySplashScreen;


public class EasySplashActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, EasySplashActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View easySplashScreenView = new EasySplashScreen(EasySplashActivity.this)
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(3000)
                .withBackgroundResource(R.color.yellow)
                .withHeaderText("EasySplashActivity")
                .withFooterText("Footer text")
                .withBeforeLogoText("Before Logo Text")
                .withLogo(R.mipmap.ic_launcher)
                .withAfterLogoText("Text After logo")
                .create();

        setContentView(easySplashScreenView);

    }
}
