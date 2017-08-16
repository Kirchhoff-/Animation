package com.kirchhoff.animation.animation.additive;

import android.util.TypedValue;

import com.kirchhoff.animation.App;

public class DpConverter {

    public static int converDpToPx(float dp) {
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                App.getContext().getResources().getDisplayMetrics());
        return Math.round(px);
    }
}