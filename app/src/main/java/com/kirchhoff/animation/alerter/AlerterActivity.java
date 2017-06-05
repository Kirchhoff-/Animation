package com.kirchhoff.animation.alerter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.kirchhoff.animation.R;
import com.tapadoo.alerter.Alerter;
import com.tapadoo.alerter.OnHideAlertListener;
import com.tapadoo.alerter.OnShowAlertListener;

/**
 * @author Kirchhoff-
 */

public class AlerterActivity extends AppCompatActivity {


    public static void start(Context context) {
        Intent intent = new Intent(context, AlerterActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_alerter);
    }

    public void alerterSimple(View view) {
        getAlerter()
                .setTitle("Title")
                .setText("Some not long text...")
                .show();
    }

    public void alerterBackground(View view) {
        getAlerter()
                .setTitle("Title")
                .setBackgroundColor(R.color.colorPrimary)
                .setText("Some not long text...")
                .show();
    }

    public void alerterIcon(View view) {
        getAlerter()
                .setTitle("Title")
                //At the time of writing throws exception
                // caused by: android.content.res.Resources$NotFoundException:
                // .setIcon(R.drawable.ic_menu)
                .setIcon(R.drawable.alerter_ic_face)
                .setText("Some not long text...")
                .show();
    }

    public void alerterDuration(View view) {
        getAlerter()
                .setTitle("Title")
                .setText("Some not long text...")
                .setDuration(10000)
                .show();
    }

    public void alerterTitle(View view) {
        getAlerter()
                .setText("Some not long text...")
                .show();
    }

    public void alerterOnClickListener(View view) {
        getAlerter()
                .setTitle("Title")
                .setText("Some not long text...")
                .setDuration(10000)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(AlerterActivity.this, "OnClickListener", Toast.LENGTH_LONG).show();
                    }
                })
                .show();
    }

    public void alerterVerboseText(View view) {
        getAlerter()
                .setTitle("Title")
                .setText("Some long long long long long long long  text..." +
                        "Some long long long long long long long  text..." +
                        "Some long long long long long long long  text..." +
                        "Some long long long long long long long  text...")
                .setDuration(10000)
                .show();
    }

    public void alerterVisibilityCallback(View view) {
        getAlerter()
                .setTitle("Title")
                .setText("Some not long text...")
                .setOnShowListener(new OnShowAlertListener() {
                    @Override
                    public void onShow() {
                        Toast.makeText(AlerterActivity.this, "Alert Shown", Toast.LENGTH_LONG).show();
                    }
                })
                .setOnHideListener(new OnHideAlertListener() {
                    @Override
                    public void onHide() {
                        Toast.makeText(AlerterActivity.this, "Alert Hidden", Toast.LENGTH_LONG).show();
                    }
                })
                .setDuration(3000)
                .show();
    }

    private Alerter getAlerter() {
        return Alerter.create(this);
    }
}
