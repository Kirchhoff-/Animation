package com.kirchhoff.animation.recycler;

import androidx.annotation.DrawableRes;

import com.kirchhoff.animation.R;

/**
 * @author Kirchhoff-
 */

public class ImageObject {

    private String clubName;
    private String country;
    @DrawableRes
    private int clubBackground;

    public ImageObject() {
        this.clubName = "Default";
        this.country = "Default";
        this.clubBackground = R.drawable.focus_image_1;
    }

    public ImageObject(String clubName, String country, @DrawableRes int clubBackground) {
        this.clubName = clubName;
        this.country = country;
        this.clubBackground = clubBackground;
    }

    public String getClubName() {
        return clubName;
    }

    public String getCountry() {
        return country;
    }

    public int getClubBackground() {
        return clubBackground;
    }
}
