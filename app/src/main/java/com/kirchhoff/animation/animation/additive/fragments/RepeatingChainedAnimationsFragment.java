package com.kirchhoff.animation.animation.additive.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.kirchhoff.animation.R;
import com.kirchhoff.animation.animation.additive.AdditiveAnimatorSubclassDemo;
import com.kirchhoff.animation.animation.additive.DpConverter;

import at.wirecube.additiveanimations.additive_animator.AdditiveAnimator;


/**
 * @author Kirchhoff-
 */
public class RepeatingChainedAnimationsFragment extends Fragment {
    ViewGroup rootView;
    View animatedView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(R.layout.f_chaining_animation, container, false);
        animatedView = rootView.findViewById(R.id.animated_view);

        rootView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    AdditiveAnimator.cancelAnimation(animatedView, View.ROTATION);
                }
                return true;
            }
        });

        animate();
        return rootView;
    }

    private void animate() {
        final int colors[] = new int[]{
                ContextCompat.getColor(getContext(), R.color.orange),
                ContextCompat.getColor(getContext(), R.color.blue_4AA5E3),
                ContextCompat.getColor(getContext(), R.color.green_7D19E),
                ContextCompat.getColor(getContext(), R.color.pink)
        };
        AdditiveAnimatorSubclassDemo.animate(animatedView)
                .x(px(50)).y(px(100)).backgroundColor(colors[1]).rotation(0)
                .thenBounceBeforeEnd(800, 300)
                .thenBeforeEnd(400).x(px(250)).backgroundColor(colors[2]).rotationBy(45).setDuration(1000)
                .thenBounceBeforeEnd(800, 300)
                .thenBeforeEnd(400).y(px(200)).backgroundColor(colors[3]).rotationBy(45).setDuration(1000)
                .thenBounceBeforeEnd(800, 300)
                .thenBeforeEnd(400).x(px(50)).backgroundColor(colors[0]).rotationBy(90).setDuration(1000)
                .thenBounceBeforeEnd(800, 300)
                .addEndAction(new AdditiveAnimator.AnimationEndListener() {
                    @Override
                    public void onAnimationEnd(boolean wasCancelled) {
                        if (getActivity() != null) {
                            animate();
                        }
                    }
                })
                .start();
    }

    private int px(int dp) {
        return DpConverter.converDpToPx(dp);
    }

}