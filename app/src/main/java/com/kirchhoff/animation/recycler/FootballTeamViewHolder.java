package com.kirchhoff.animation.recycler;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.kirchhoff.animation.R;

/**
 * @author Kirchhoff-
 */

public class FootballTeamViewHolder extends RecyclerView.ViewHolder {

    public FrameLayout background;
    public TextView clubName;
    public TextView country;

    public FootballTeamViewHolder(View itemView) {
        super(itemView);
        background = (FrameLayout) itemView.findViewById(R.id.background);
        clubName = (TextView) itemView.findViewById(R.id.clubName);
        country = (TextView) itemView.findViewById(R.id.country);
    }
}
