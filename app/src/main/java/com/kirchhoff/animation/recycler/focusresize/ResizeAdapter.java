package com.kirchhoff.animation.recycler.focusresize;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.library.FocusResizeAdapter;
import com.kirchhoff.animation.R;
import com.kirchhoff.animation.recycler.FootballTeamViewHolder;
import com.kirchhoff.animation.recycler.ImageObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kirchhoff-
 */

public class ResizeAdapter extends FocusResizeAdapter<RecyclerView.ViewHolder> {

    private List<ImageObject> items;

    public ResizeAdapter(Context context, int height) {
        super(context, height);
        items = new ArrayList<>();
        items.add(new ImageObject("Milan", "Italy", R.drawable.focus_image_1));
        items.add(new ImageObject("Chelsea", "England", R.drawable.focus_image_2));
        items.add(new ImageObject("Real Madrid", "Spain", R.drawable.focus_image_3));
        items.add(new ImageObject("PSG", "France", R.drawable.focus_image_4));
        items.add(new ImageObject("Bayern", "Germany", R.drawable.focus_image_5));
    }

    @Override
    public int getFooterItemCount() {
        // Return items size
        return items.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup parent, int viewType) {
        // Inflate your custom item layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.v_focus_resize, parent, false);
        return new FootballTeamViewHolder(v);
    }

    @Override
    public void onBindFooterViewHolder(RecyclerView.ViewHolder holder, int position) {
        // Set your data into your custom layout
        ImageObject customObject = items.get(position);
        fill((FootballTeamViewHolder) holder, customObject);
    }

    private void fill(FootballTeamViewHolder holder, ImageObject customObject) {
        holder.clubName.setText(customObject.getClubName());
        holder.country.setText(customObject.getCountry());
        holder.background.setBackgroundResource(customObject.getClubBackground());
    }

    @Override
    public void onItemBigResize(RecyclerView.ViewHolder viewHolder, int position, int dyAbs) {
        // The focused item will resize to big size while is scrolling
    }

    @Override
    public void onItemBigResizeScrolled(RecyclerView.ViewHolder viewHolder, int position, int dyAbs) {
        // The focused item resize to big size when scrolled is finished
    }

    @Override
    public void onItemSmallResizeScrolled(RecyclerView.ViewHolder viewHolder, int position, int dyAbs) {
        // All items except the focused item will resize to small size when scrolled is finished
    }

    @Override
    public void onItemSmallResize(RecyclerView.ViewHolder viewHolder, int position, int dyAbs) {
        // All items except the focused item will resize to small size while is scrolling
    }

    @Override
    public void onItemInit(RecyclerView.ViewHolder viewHolder) {
        // Init first item when the view is loaded
    }
}
