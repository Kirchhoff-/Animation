package com.kirchhoff.animation.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kirchhoff.animation.R;
import com.marcinmoskala.arcseekbar.ArcSeekBar;

/**
 * @author Kirchhoff-
 */

public class ViewActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, ViewActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_view);

        ArcSeekBar gradientSeekBar = (ArcSeekBar) findViewById(R.id.gradientSeekBar);
        int[] intArray = getResources().getIntArray(R.array.progressGradientColors);
        gradientSeekBar.setProgressGradient(intArray);
    }
}
