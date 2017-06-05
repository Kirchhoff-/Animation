package com.kirchhoff.animation.awesomesplash;

import android.content.Context;
import android.content.Intent;

import com.daimajia.androidanimations.library.Techniques;
import com.kirchhoff.animation.R;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;


public class AwesomeSplashActivity extends AwesomeSplash {


    public static void start(Context context) {
        Intent intent = new Intent(context, AwesomeSplashActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void initSplash(ConfigSplash configSplash) {


        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.colorAccent);
        configSplash.setAnimCircularRevealDuration(3000);
        //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);
        //or Flags.REVEAL_TOP
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM);

        //Customize Logo
        //Can use any drawable here
        configSplash.setLogoSplash(R.mipmap.ic_launcher);
        configSplash.setAnimLogoSplashDuration(2000);
        //One techniques from (ref: https://github.com/daimajia/AndroidViewAnimations)
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce);

        //Customize Path
        configSplash.setPathSplash(Images.GITHUB_LOGO); //set path String
        configSplash.setAnimPathStrokeDrawingDuration(3000);
        configSplash.setPathSplashStrokeSize(3);
        configSplash.setPathSplashStrokeColor(R.color.colorPrimary);
        configSplash.setAnimPathFillingDuration(3000);
        configSplash.setPathSplashFillColor(R.color.yellow);


        //Customize Title
        configSplash.setTitleSplash("AwesomeSplash library test");
        configSplash.setTitleTextColor(R.color.yellow);
        configSplash.setTitleTextSize(24f); //float value
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);
    }

    @Override
    public void animationsFinished() {
        this.finish();
    }
}
