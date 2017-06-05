package com.kirchhoff.animation.bottombar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.kirchhoff.animation.R;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

/**
 * @author Kirchhoff-
 */
public class BottomBarActivity extends AppCompatActivity {


    private BottomBar bottomBar;
    private FrameLayout contentContainer;

    public static void start(Context context) {
        Intent intent = new Intent(context, BottomBarActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_bar_activity);


        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        contentContainer = (FrameLayout) findViewById(R.id.contentContainer);

        contentContainer.setBackgroundColor(getResources().getColor(R.color.blue));


        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {

                switch (tabId){

                    case R.id.tab_favorite:
                        contentContainer.setBackgroundColor(getResources().getColor(R.color.yellow));
                        break;

                    case R.id.tab_settings:
                        contentContainer.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;

                    case R.id.tab_euro:
                        contentContainer.setBackgroundColor(getResources().getColor(R.color.green));
                        break;
                }
            }
        });

        bottomBar.setDefaultTab(R.id.tab_settings);

    }
}
