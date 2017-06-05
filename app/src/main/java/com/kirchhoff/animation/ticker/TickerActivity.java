package com.kirchhoff.animation.ticker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;

import com.kirchhoff.animation.R;
import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;

import java.util.Random;

/**
 * @author Kirchhoff-
 */
public class TickerActivity extends AppCompatActivity implements View.OnClickListener {

    TickerView tickerView1;
    TickerView tickerView2;
    /**
     * Without setting width = match_parent, gravity = center
     * animation in this tickerView look ugly
     */
    TickerView tickerView3;

     char[] charList = new char[] { TickerUtils.EMPTY_CHAR, 'a', 'b', 'c', 'd',
             'e', 'f', 'g', 'h' ,'i', 'j', 'k' , 'l', 'm', 'n', 'o', 'p', 'q', 'r',
             's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };


    public static void start(Context context) {
        Intent intent = new Intent(context, TickerActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticker_activity);

        tickerView1 = (TickerView) findViewById(R.id.tickerView1);
        tickerView2 = (TickerView) findViewById(R.id.tickerView2);
        tickerView3 = (TickerView) findViewById(R.id.tickerView3);

        tickerView1.setOnClickListener(this);
        tickerView2.setOnClickListener(this);
        tickerView3.setOnClickListener(this);

        tickerView1.setCharacterList(TickerUtils.getDefaultNumberList());
        tickerView2.setCharacterList(TickerUtils.getDefaultListForUSCurrency());
        tickerView3.setCharacterList(charList);


        tickerView1.setText(randomIntNumber());
        tickerView2.setText(randomDoubleNumber());
        tickerView3.setText(randomString());

        tickerView1.setAnimationDuration(1000);
        tickerView2.setAnimationDuration(2000);
        tickerView3.setAnimationDuration(3000);


        tickerView1.setAnimationInterpolator(new OvershootInterpolator());
        tickerView2.setAnimationInterpolator(new BounceInterpolator());
        tickerView3.setAnimationInterpolator(new AnticipateInterpolator());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.tickerView1:
                tickerView1.setText(randomIntNumber());
                break;

            case R.id.tickerView2:
                tickerView2.setText(randomDoubleNumber());
                break;

            case R.id.tickerView3:
                tickerView3.setText(randomString());
                break;
        }
    }


    private String randomIntNumber(){
        return "" + new Random().nextInt(1000);
    }

    private String randomDoubleNumber(){
        return "" + new Random().nextDouble();
    }

    public String randomString() {
        Random rand = new Random();
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder buf = new StringBuilder();
        for (int i=0; i<10; i++) {
            buf.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return buf.toString();
    }
}
