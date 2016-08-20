package com.kirchhoff.animation.interpolators;

import android.graphics.Path;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.kirchhoff.animation.R;

/**
 * @author Kirchhoff-
 */
public class InterpolatorActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;

    ImageView image;

    TranslateAnimation animation;

    Animation animAccelerateDecelerate;
    Animation animAccelerate;
    Animation animAnticipate;
    Animation animAnticipateOvershoot;
    Animation animBounce;
    Animation animCycle;
    Animation animDecelerate;
    Animation animLinear;
    Animation animOvershoot;

    Path path;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interpolator_activity);

        String [] interpolators = getResources().getStringArray(R.array.interpolators);

        image = (ImageView) findViewById(R.id.image);
        animation = new TranslateAnimation(0, 0, -700, 0);
        animation.setDuration(3000);

        animAccelerateDecelerate = AnimationUtils.loadAnimation(this, R.anim.accelerate_decelerate);
        animAccelerate = AnimationUtils.loadAnimation(this, R.anim.accelerate);
        animAnticipate = AnimationUtils.loadAnimation(this, R.anim.anticipate);
        animAnticipateOvershoot = AnimationUtils.loadAnimation(this, R.anim.anticipate_overshoot);
        animBounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        animCycle = AnimationUtils.loadAnimation(this, R.anim.cycle);
        animDecelerate = AnimationUtils.loadAnimation(this, R.anim.decelerate);
        animLinear = AnimationUtils.loadAnimation(this, R.anim.linear);
        animOvershoot = AnimationUtils.loadAnimation(this, R.anim.overshoot);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);

        button1.setText(interpolators[0]);
        button2.setText(interpolators[1]);
        button3.setText(interpolators[2]);
        button4.setText(interpolators[3]);
        button5.setText(interpolators[4]);
        button6.setText(interpolators[5]);
        button7.setText(interpolators[6]);
        button8.setText(interpolators[7]);
        button9.setText(interpolators[8]);
        button10.setText(interpolators[9]);

        path = new Path();
        path.lineTo(0.25f, 0.25f);
        path.moveTo(0.25f, 0.5f);
        path.lineTo(1f, 1f);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button1:
              //  animation.setInterpolator(new AccelerateDecelerateInterpolator());
              //  image.startAnimation(animation);

                image.startAnimation(animAccelerateDecelerate);
                break;

            case R.id.button2:
              //  animation.setInterpolator(new AccelerateInterpolator());
              //  image.startAnimation(animation);

                image.startAnimation(animAccelerate);
                break;

            case R.id.button3:
              //  animation.setInterpolator(new AnticipateInterpolator());
              //  image.startAnimation(animation);

                image.startAnimation(animAnticipate);
                break;

            case R.id.button4:
              //  animation.setInterpolator(new AnticipateOvershootInterpolator());
              //  image.startAnimation(animation);

                image.startAnimation(animAnticipateOvershoot);
                break;

            case R.id.button5:
              //  animation.setInterpolator(new BounceInterpolator());
              //  image.startAnimation(animation);

                image.startAnimation(animBounce);
                break;

            case R.id.button6:
              //  animation.setInterpolator(new CycleInterpolator(3));
              //  image.startAnimation(animation);

                image.startAnimation(animCycle);
                break;

            case R.id.button7:
              //  animation.setInterpolator(new DecelerateInterpolator());
              // image.startAnimation(animation);

                image.startAnimation(animDecelerate);
                break;

            case R.id.button8:
              //  animation.setInterpolator(new LinearInterpolator());
              //  image.startAnimation(animation);

                image.startAnimation(animLinear);
                break;

            case R.id.button9:
              //  animation.setInterpolator(new OvershootInterpolator());
              //  image.startAnimation(animation);

                image.startAnimation(animOvershoot);
                break;

            case R.id.button10:
                animation.setInterpolator(new PathInterpolator(path));
                image.startAnimation(animation);
                break;
        }
    }
}
