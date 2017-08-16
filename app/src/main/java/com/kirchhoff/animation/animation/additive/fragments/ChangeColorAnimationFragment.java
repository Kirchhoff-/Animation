package com.kirchhoff.animation.animation.additive.fragments;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kirchhoff.animation.R;
import com.kirchhoff.animation.animation.additive.AdditiveAnimationActivity;
import com.kirchhoff.animation.animation.additive.AdditiveAnimatorSubclassDemo;

import at.wirecube.additiveanimations.helper.EaseInOutPathInterpolator;

/**
 * @author Kirchhoff-
 */

public class ChangeColorAnimationFragment extends Fragment {
    ViewGroup rootView;
    View animatedView;

    int index = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(R.layout.f_change_color_animation, container, false);
        animatedView = rootView.findViewById(R.id.animated_view);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final int colors[] = new int[]{
                ContextCompat.getColor(getContext(), R.color.orange),
                ContextCompat.getColor(getContext(), R.color.blue_4AA5E3),
                ContextCompat.getColor(getContext(), R.color.green_7D19E),
                ContextCompat.getColor(getContext(), R.color.pink)
        };
        animatedView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AdditiveAnimationActivity.ADDITIVE_ANIMATIONS_ENABLED) {
                    AdditiveAnimatorSubclassDemo.animate(v).backgroundColor(colors[++index % 4]).start();
                } else {
                    final ObjectAnimator backgroundColorAnimator = ObjectAnimator.ofObject(animatedView,
                            "backgroundColor",
                            new ArgbEvaluator(),
                            ((ColorDrawable) v.getBackground()).getColor(),
                            colors[++index % 4]);
                    backgroundColorAnimator.setDuration(1000);
                    backgroundColorAnimator.setInterpolator(EaseInOutPathInterpolator.create());
                    backgroundColorAnimator.start();
                }
            }
        });
    }
}
