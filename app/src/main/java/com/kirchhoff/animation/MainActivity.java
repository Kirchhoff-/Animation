package com.kirchhoff.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.kirchhoff.animation.alerter.AlerterActivity;
import com.kirchhoff.animation.animation.additive.AdditiveAnimationActivity;
import com.kirchhoff.animation.awesomesplash.AwesomeSplashActivity;
import com.kirchhoff.animation.bottombar.BottomBarActivity;
import com.kirchhoff.animation.drawer.DuoNavigationDrawerActivity;
import com.kirchhoff.animation.easysplash.EasySplashActivity;
import com.kirchhoff.animation.interpolators.InterpolatorActivity;
import com.kirchhoff.animation.jellytoolbar.JellyToolbarActivity;
import com.kirchhoff.animation.loadingbutton.LoadingButtonActivity;
import com.kirchhoff.animation.particle.ParticleActivity;
import com.kirchhoff.animation.recycler.FocusResizeActivity;
import com.kirchhoff.animation.swipeback.SwipeBackLayoutActivity;
import com.kirchhoff.animation.ticker.TickerActivity;
import com.kirchhoff.animation.view.ViewActivity;

/**
 * @author Kirchhoff-
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Ticker library
     * https://github.com/robinhood/ticker
     */
    public void ticker(View view) {
        TickerActivity.start(this);
    }

    /**
     * Testing different android interpolators
     */
    public void interpolators(View view) {
        InterpolatorActivity.start(this);
    }

    /**
     * Library for realization bottom bar navigation pattern
     * <p>
     * Navigation pattern:
     * https://material.google.com/components/bottom-navigation.html
     * <p>
     * <p>
     * Library:
     * https://github.com/roughike/BottomBar
     */
    public void bottomBar(View view) {
        BottomBarActivity.start(this);
    }

    /**
     * Library for creating splash screen
     * <p>
     * https://github.com/ViksaaSkool/AwesomeSplash
     */

    public void awesomeSplash(View view) {
        AwesomeSplashActivity.start(this);
    }

    /**
     * Library for crating splash screen
     * <p>
     * https://github.com/pantrif/EasySplashScreen
     */
    public void easySplash(View view) {
        EasySplashActivity.start(this);
    }

    /**
     * Library for creating Particle view(view with interesting animation)
     * <p>
     * https://github.com/JeasonWong/Particle
     */
    public void particleView(View view) {
        ParticleActivity.start(this);
    }

    /**
     * https://github.com/Yalantis/JellyToolbar
     */
    public void jellyToolbar(View view) {
        JellyToolbarActivity.start(this);
    }

    /**
     * https://github.com/Tapadoo/Alerter
     */
    public void alerter(View view) {
        AlerterActivity.start(MainActivity.this);
    }

    /**
     * https://github.com/bravoborja/FocusResize
     */
    public void focusResize(View view) {
        FocusResizeActivity.start(this);
    }

    /**
     * https://github.com/PSD-Company/duo-navigation-drawer
     */
    public void duoNavigation(View view) {
        DuoNavigationDrawerActivity.start(this);
    }

    /**
     * For test different View library
     */
    public void viewActivity(View view) {
        ViewActivity.start(this);
    }


    /**
     * https://github.com/wirecube/android_additive_animations
     */
    public void additiveAnimation(View view) {
        AdditiveAnimationActivity.start(this);
    }


    /**
     * https://github.com/StevenDXC/DxLoadingButton
     */
    public void loadingButton(View view) {
        LoadingButtonActivity.start(this);
    }


    public void swipeBackLayout(View view) {
        SwipeBackLayoutActivity.start(this);
    }
}
