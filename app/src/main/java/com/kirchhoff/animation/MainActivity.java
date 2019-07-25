package com.kirchhoff.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.alerter.AlerterActivity;
import com.kirchhoff.animation.expandable.ExpandableLinearLayoutActivity;
import com.kirchhoff.animation.loadingbutton.LoadingButtonActivity;
import com.kirchhoff.animation.particle.ParticleActivity;
import com.kirchhoff.animation.recycler.focusresize.FocusResizeActivity;
import com.kirchhoff.animation.recycler.vega.VegaManagerActivity;
import com.kirchhoff.animation.scaling.ScalingMainActivity;
import com.kirchhoff.animation.swipeback.SwipeBackLayoutActivity;
import com.kirchhoff.animation.ticker.TickerActivity;

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
		Intent intent = new Intent(this, TickerActivity.class);
		startActivity(intent);
	}

	/**
	 * Library for creating Particle view(view with interesting animation)
	 * <p>
	 * https://github.com/JeasonWong/Particle
	 */
	public void particleView(View view) {
		Intent intent = new Intent(this, ParticleActivity.class);
		startActivity(intent);
	}

	/**
	 * https://github.com/Tapadoo/Alerter
	 */
	public void alerter(View view) {
		Intent intent = new Intent(this, AlerterActivity.class);
		startActivity(intent);
	}

	/**
	 * https://github.com/bravoborja/FocusResize
	 */
	public void focusResize(View view) {
		FocusResizeActivity.start(this);
	}

	/**
	 * https://github.com/StevenDXC/DxLoadingButton
	 */
	public void loadingButton(View view) {
		Intent intent = new Intent(this, LoadingButtonActivity.class);
		startActivity(intent);
	}


	public void swipeBackLayout(View view) {
		Intent intent = new Intent(this, SwipeBackLayoutActivity.class);
		startActivity(intent);
	}

	/**
	 * https://github.com/iammert/ExpandableLayout
	 */
	public void expandableLinearLayout(View view) {
		Intent intent = new Intent(this, ExpandableLinearLayoutActivity.class);
		startActivity(intent);
	}


	/**
	 * https://github.com/xmuSistone/VegaLayoutManager
	 */
	public void vegaLayoutManager(View view) {
		VegaManagerActivity.start(this);
	}

	/**
	 * https://github.com/iammert/ScalingLayout
	 */
	public void scalingLayoutExample(View view) {
		Intent intent = new Intent(this, ScalingMainActivity.class);
		startActivity(intent);
	}
}
