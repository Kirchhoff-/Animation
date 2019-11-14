package com.example.vegalayoutmanager.adapter;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.vegalayoutmanager.ImageObject;
import com.example.vegalayoutmanager.R;
import com.example.vegalayoutmanager.adapter.holder.FootballTeamViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kirchhoff-
 */

public class FootballAdapter extends RecyclerView.Adapter<FootballTeamViewHolder> {

    private List<ImageObject> items;

    public FootballAdapter() {
        items = new ArrayList<>();
        items.add(new ImageObject("Milan", "Italy", R.drawable.vega_focus_image_1));
        items.add(new ImageObject("Chelsea", "England", R.drawable.vega_focus_image_2));
        items.add(new ImageObject("Real Madrid", "Spain", R.drawable.vega_focus_image_3));
        items.add(new ImageObject("PSG", "France", R.drawable.vega_focus_image_4));
        items.add(new ImageObject("Bayern", "Germany", R.drawable.vega_focus_image_5));
        items.add(new ImageObject("Milan", "Italy", R.drawable.vega_focus_image_1));
        items.add(new ImageObject("Chelsea", "England", R.drawable.vega_focus_image_2));
        items.add(new ImageObject("Real Madrid", "Spain", R.drawable.vega_focus_image_3));
        items.add(new ImageObject("PSG", "France", R.drawable.vega_focus_image_4));
        items.add(new ImageObject("Bayern", "Germany", R.drawable.vega_focus_image_5));
        items.add(new ImageObject("Milan", "Italy", R.drawable.vega_focus_image_1));
        items.add(new ImageObject("Chelsea", "England", R.drawable.vega_focus_image_2));
        items.add(new ImageObject("Real Madrid", "Spain", R.drawable.vega_focus_image_3));
        items.add(new ImageObject("PSG", "France", R.drawable.vega_focus_image_4));
        items.add(new ImageObject("Bayern", "Germany", R.drawable.vega_focus_image_5));
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
        holder.getClubName().setText(customObject.getClubName());
        holder.getCountry().setText(customObject.getCountry());
        holder.getBackground().setBackgroundResource(customObject.getClubBackground());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}