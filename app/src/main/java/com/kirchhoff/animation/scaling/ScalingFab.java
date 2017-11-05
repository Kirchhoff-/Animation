package com.kirchhoff.animation.scaling;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.kirchhoff.animation.R;

import iammert.com.view.scalinglib.ScalingLayout;
import iammert.com.view.scalinglib.ScalingLayoutListener;
import iammert.com.view.scalinglib.State;

/**
 * @author Kirchhoff-
 */

public class ScalingFab extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, ScalingFab.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_scaling_fab);

        final ImageView fabIcon = (ImageView) findViewById(R.id.fabIcon);
        final LinearLayout filterLayout = (LinearLayout) findViewById(R.id.filterLayout);
        final ScalingLayout scalingLayout = (ScalingLayout) findViewById(R.id.scalingLayout);

        scalingLayout.setListener(new ScalingLayoutListener() {
            @Override
            public void onCollapsed() {
                ViewCompat.animate(fabIcon).alpha(1).setDuration(150).start();
                ViewCompat.animate(filterLayout).alpha(0).setDuration(150).setListener(new ViewPropertyAnimatorListener() {
                    @Override
                    public void onAnimationStart(View view) {
                        fabIcon.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationEnd(View view) {
                        filterLayout.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onAnimationCancel(View view) {

                    }
                }).start();
            }

            @Override
            public void onExpanded() {
                ViewCompat.animate(fabIcon).alpha(0).setDuration(200).start();
                ViewCompat.animate(filterLayout).alpha(1).setDuration(200).setListener(new ViewPropertyAnimatorListener() {
                    @Override
                    public void onAnimationStart(View view) {
                        filterLayout.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationEnd(View view) {
                        fabIcon.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onAnimationCancel(View view) {

                    }
                }).start();
            }

            @Override
            public void onProgress(float progress) {
                if (progress > 0) {
                    fabIcon.setVisibility(View.INVISIBLE);
                }

                if (progress < 1) {
                    filterLayout.setVisibility(View.INVISIBLE);
                }
            }
        });

        scalingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scalingLayout.getState() == State.COLLAPSED) {
                    scalingLayout.expand();
                }
            }
        });


        findViewById(R.id.rootLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scalingLayout.getState() == State.EXPANDED) {
                    scalingLayout.collapse();
                }
            }
        });

    }
}
