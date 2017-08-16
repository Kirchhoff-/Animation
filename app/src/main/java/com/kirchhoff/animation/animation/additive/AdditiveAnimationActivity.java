package com.kirchhoff.animation.animation.additive;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.kirchhoff.animation.R;
import com.kirchhoff.animation.animation.additive.fragments.ChainingAnimationFragment;
import com.kirchhoff.animation.animation.additive.fragments.ChangeColorAnimationFragment;
import com.kirchhoff.animation.animation.additive.fragments.RepeatingChainedAnimationsFragment;

/**
 * @author Kirchhoff-
 */

public class AdditiveAnimationActivity extends AppCompatActivity {

    public static boolean ADDITIVE_ANIMATIONS_ENABLED = true;

    private Switch animationSwitch;

    public static void start(Context context) {
        Intent intent = new Intent(context, AdditiveAnimationActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_additive_animation);

        animationSwitch = (Switch) findViewById(R.id.animationSwitch);
        animationSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                ADDITIVE_ANIMATIONS_ENABLED = b;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.additive_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.chainingAnimation) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,
                    new ChainingAnimationFragment()).commit();
        } else if (id == R.id.chainingColor) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,
                    new ChangeColorAnimationFragment()).commit();
        } else if (id == R.id.repeating) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,
                    new RepeatingChainedAnimationsFragment()).commit();
        }
        return true;
    }

}
