package com.kirchhoff.animation.animation.additive;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kirchhoff.animation.R;

/**
 * @author Kirchhoff-
 */

public class AdditiveAnimationActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, AdditiveAnimationActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_additive_animation);
    }
}
