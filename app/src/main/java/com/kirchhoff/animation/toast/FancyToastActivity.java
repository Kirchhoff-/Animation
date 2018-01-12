package com.kirchhoff.animation.toast;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.kirchhoff.animation.R;
import com.shashank.sony.fancytoastlib.FancyToast;

/**
 * @author Kirchhoff-
 */

public class FancyToastActivity extends AppCompatActivity {


    public static void start(Context context) {
        Intent intent = new Intent(context, FancyToastActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_fancy_toast);

        findViewById(R.id.bToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FancyToast.makeText(FancyToastActivity.this, "Test", FancyToast.LENGTH_LONG,
                        FancyToast.ERROR, false).show();
            }
        });
    }
}
