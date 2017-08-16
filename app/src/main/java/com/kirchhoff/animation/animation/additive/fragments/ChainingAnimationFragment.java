package com.kirchhoff.animation.animation.additive.fragments;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.kirchhoff.animation.R;
import com.kirchhoff.animation.animation.additive.AdditiveAnimationActivity;

import at.wirecube.additiveanimations.additive_animator.AdditiveAnimator;
import at.wirecube.additiveanimations.helper.EaseInOutPathInterpolator;

/**
 * @author Kirchhoff-
 */

public class ChainingAnimationFragment extends Fragment {

    FrameLayout rootView;
    View animatedView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = (FrameLayout) inflater.inflate(R.layout.f_chaining_animation, container, false);
        animatedView = rootView.findViewById(R.id.animated_view);

        rootView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE || event.getAction() == MotionEvent.ACTION_DOWN) {
                    if (AdditiveAnimationActivity.ADDITIVE_ANIMATIONS_ENABLED) {

                        AdditiveAnimator.animate(animatedView)
                                .centerX(event.getX()).centerY(event.getY())
                                .then() // execute the following animations after the previous ones have finished
                                .centerX(event.getX()).centerY(event.getY())
                                .start();

                    } else {

                        PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, event.getX() - animatedView.getWidth() / 2);
                        PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, event.getY() - animatedView.getHeight() / 2);
                        ObjectAnimator animator1 = ObjectAnimator.ofPropertyValuesHolder(animatedView, pvhX, pvhY);

                        PropertyValuesHolder pvhX2 = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, (event.getX() - animatedView.getWidth() / 2));
                        PropertyValuesHolder pvhY2 = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, (event.getY() - animatedView.getHeight() / 2));
                        ObjectAnimator animator2 = ObjectAnimator.ofPropertyValuesHolder(animatedView, pvhX2, pvhY2);

                        AnimatorSet animators = new AnimatorSet();
                        animators.playSequentially(animator1, animator2);
                        animators.setDuration(2000);
                        animators.setInterpolator(EaseInOutPathInterpolator.create());
                        animators.start();
                    }
                }
                return true;
            }
        });
        return rootView;
    }
}
