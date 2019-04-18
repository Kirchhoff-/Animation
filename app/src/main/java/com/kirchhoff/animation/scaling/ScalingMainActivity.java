package com.kirchhoff.animation.scaling;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.kirchhoff.animation.R;

/**
 * @author Kirchhoff-
 */

public class ScalingMainActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, ScalingMainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_scaling_main);
    }

    public void scalingLayoutFab(View view) {
        ScalingFab.Companion.start(this);
    }

    public void scalingLayoutSearchBar(View view) {
        ScalingSearchBar.start(this);
    }

    public void scalingLayoutCollapsing(View view) {
        ScalingCollapsing.start(this);
    }
}
