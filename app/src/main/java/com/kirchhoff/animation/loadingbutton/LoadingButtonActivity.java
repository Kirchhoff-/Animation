package com.kirchhoff.animation.loadingbutton;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dx.dxloadingbutton.lib.LoadingButton;
import com.kirchhoff.animation.R;

/**
 * @author Kirchhoff-
 */

public class LoadingButtonActivity extends AppCompatActivity {


    private Button bSuccess;
    private Button bFailed;
    private Button bReset;
    private Button bCancel;
    private LoadingButton loadingButton;

    public static void start(Context context) {
        Intent intent = new Intent(context, LoadingButtonActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_loading_button);
        initView();
    }

    private void initView() {
        bSuccess = (Button) findViewById(R.id.bSuccess);
        bFailed = (Button) findViewById(R.id.bFailed);
        bReset = (Button) findViewById(R.id.bReset);
        bCancel = (Button) findViewById(R.id.bCancel);
        loadingButton = (LoadingButton) findViewById(R.id.loadingButton);


        loadingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingButton.startLoading();
            }
        });

        bFailed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingButton.loadingFailed();
            }
        });

        bReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingButton.reset();
            }
        });

        bCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingButton.cancelLoading();
            }
        });

        bSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingButton.loadingSuccessful();
            }
        });
    }
}
