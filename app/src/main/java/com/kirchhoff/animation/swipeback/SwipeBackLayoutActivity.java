package com.kirchhoff.animation.swipeback;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.gw.swipeback.SwipeBackLayout;
import com.kirchhoff.animation.R;

/**
 * @author Kirchhoff-
 */

public class SwipeBackLayoutActivity extends AppCompatActivity {

    private SwipeBackLayout swipeBackLayout;
    private Button bLeft;
    private Button bRight;
    private Button bTop;
    private Button bBottom;

    public static void start(Context context) {
        Intent intent = new Intent(context, SwipeBackLayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_swipe_back_layout);
        initView();
    }

    private void initView() {
        swipeBackLayout = (SwipeBackLayout) findViewById(R.id.swipeBackLayout);
        bLeft = (Button) findViewById(R.id.bLeft);
        bRight = (Button) findViewById(R.id.bRight);
        bTop = (Button) findViewById(R.id.bTop);
        bBottom = (Button) findViewById(R.id.bBottom);

        bLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipeBackLayout.setDirectionMode(SwipeBackLayout.FROM_LEFT);
                swipeBackLayout.setMaskAlpha(125);
                swipeBackLayout.setSwipeBackFactor(0.6f);
            }
        });

        bRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipeBackLayout.setDirectionMode(SwipeBackLayout.FROM_RIGHT);
                swipeBackLayout.setMaskAlpha(175);
                swipeBackLayout.setSwipeBackFactor(0.5f);
            }
        });

        bTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipeBackLayout.setDirectionMode(SwipeBackLayout.FROM_TOP);
                swipeBackLayout.setMaskAlpha(255);
                swipeBackLayout.setSwipeBackFactor(0.7f);
            }
        });

        bBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipeBackLayout.setDirectionMode(SwipeBackLayout.FROM_BOTTOM);
                swipeBackLayout.setMaskAlpha(0);
                swipeBackLayout.setSwipeBackFactor(0.8f);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
