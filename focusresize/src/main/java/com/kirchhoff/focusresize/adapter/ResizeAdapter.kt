package com.kirchhoff.focusresize.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.library.FocusResizeAdapter
import com.kirchhoff.focusresize.R
import com.kirchhoff.focusresize.adapter.holder.FootballTeamViewHolder
import com.kirchhoff.focusresize.data.ImageObject
import java.util.*

class ResizeAdapter(context: Context, height: Int) : FocusResizeAdapter<RecyclerView.ViewHolder>(context, height) {

    private val items: MutableList<ImageObject>

    init {
        items = ArrayList()
        items.add(ImageObject("Milan", "Italy", R.drawable.focus_image_1))
        items.add(ImageObject("Chelsea", "England", R.drawable.focus_image_2))
        items.add(ImageObject("Real Madrid", "Spain", R.drawable.focus_image_3))
        items.add(ImageObject("PSG", "France", R.drawable.focus_image_4))
        items.add(ImageObject("Bayern", "Germany", R.drawable.focus_image_5))
    }

    override fun getFooterItemCount() = items.size

    override fun onCreateFooterViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        // Inflate your custom item layout
        val v = LayoutInflater.from(parent.context).inflate(R.layout.v_focus_resize, parent, false)
        return FootballTeamViewHolder(v)
    }

    override fun onBindFooterViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // Set your data into your custom layout
        val customObject = items[position]
        fill(holder as FootballTeamViewHolder, customObject)
    }

    private fun fill(holder: FootballTeamViewHolder, customObject: ImageObject) {
        holder.bind(customObject)
    }

    override fun onItemBigResize(viewHolder: RecyclerView.ViewHolder, position: Int, dyAbs: Int) {
        // The focused item will resize to big size while is scrolling
    }

    override fun onItemBigResizeScrolled(viewHolder: RecyclerView.ViewHolder, position: Int, dyAbs: Int) {
        // The focused item resize to big size when scrolled is finished
    }

    override fun onItemSmallResizeScrolled(viewHolder: RecyclerView.ViewHolder, position: Int, dyAbs: Int) {
        // All items except the focused item will resize to small size when scrolled is finished
    }

    override fun onItemSmallResize(viewHolder: RecyclerView.ViewHolder, position: Int, dyAbs: Int) {
        // All items except the focused item will resize to small size while is scrolling
    }

    override fun onItemInit(viewHolder: RecyclerView.ViewHolder) {
        // Init first item when the view is loaded
    }
}
