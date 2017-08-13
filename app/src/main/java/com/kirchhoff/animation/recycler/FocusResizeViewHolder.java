package com.kirchhoff.animation.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.kirchhoff.animation.R;

/**
 * @author Kirchhoff-
 */

public class FocusResizeViewHolder extends RecyclerView.ViewHolder {

    FrameLayout background;
    TextView clubName;
    TextView country;

    public FocusResizeViewHolder(View itemView) {
        super(itemView);
        background = (FrameLayout) itemView.findViewById(R.id.background);
        clubName = (TextView) itemView.findViewById(R.id.clubName);
        country = (TextView) itemView.findViewById(R.id.country);
    }
}
