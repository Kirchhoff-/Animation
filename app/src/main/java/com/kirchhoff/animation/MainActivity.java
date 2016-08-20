package com.kirchhoff.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kirchhoff.animation.interpolators.InterpolatorActivity;
import com.kirchhoff.animation.ticker.TickerActivity;

/**
 * @author Kirchhoff-
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ticker = (Button) findViewById(R.id.ticker);
        Button interpolators = (Button) findViewById(R.id.interpolators);


        ticker.setOnClickListener(this);
        interpolators.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            /**
             * Ticker library
             * https://github.com/robinhood/ticker
             */
            case R.id.ticker:
                intent = new Intent(this, TickerActivity.class);
                startActivity(intent);
                break;


            /**
             * Testing different android interpolators
             */
            case R.id.interpolators:
                intent = new Intent(this, InterpolatorActivity.class);
                startActivity(intent);
                break;

        }
    }
}
