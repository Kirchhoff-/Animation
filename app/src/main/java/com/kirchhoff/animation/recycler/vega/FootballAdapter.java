package com.kirchhoff.animation.recycler.vega;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.kirchhoff.animation.R;
import com.kirchhoff.animation.recycler.FootballTeamViewHolder;
import com.kirchhoff.animation.recycler.ImageObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kirchhoff-
 */

public class FootballAdapter extends RecyclerView.Adapter<FootballTeamViewHolder> {

    private List<ImageObject> items;

    public FootballAdapter() {
        items = new ArrayList<>();
        items.add(new ImageObject("Milan", "Italy", R.drawable.focus_image_1));
        items.add(new ImageObject("Chelsea", "England", R.drawable.focus_image_2));
        items.add(new ImageObject("Real Madrid", "Spain", R.drawable.focus_image_3));
        items.add(new ImageObject("PSG", "France", R.drawable.focus_image_4));
        items.add(new ImageObject("Bayern", "Germany", R.drawable.focus_image_5));
        items.add(new ImageObject("Milan", "Italy", R.drawable.focus_image_1));
        items.add(new ImageObject("Chelsea", "England", R.drawable.focus_image_2));
        items.add(new ImageObject("Real Madrid", "Spain", R.drawable.focus_image_3));
        items.add(new ImageObject("PSG", "France", R.drawable.focus_image_4));
        items.add(new ImageObject("Bayern", "Germany", R.drawable.focus_image_5));
        items.add(new ImageObject("Milan", "Italy", R.drawable.focus_image_1));
        items.add(new ImageObject("Chelsea", "England", R.drawable.focus_image_2));
        items.add(new ImageObject("Real Madrid", "Spain", R.drawable.focus_image_3));
        items.add(new ImageObject("PSG", "France", R.drawable.focus_image_4));
        items.add(new ImageObject("Bayern", "Germany", R.drawable.focus_image_5));
    }

    @Override
    public FootballTeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FootballTeamViewHolder(LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.v_focus_resize, parent, false));
    }

    @Override
    public void onBindViewHolder(FootballTeamViewHolder holder, int position) {
        ImageObject customObject = items.get(position);
        holder.clubName.setText(customObject.getClubName());
        holder.country.setText(customObject.getCountry());
        holder.background.setBackgroundResource(customObject.getClubBackground());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
