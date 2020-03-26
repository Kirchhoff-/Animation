package com.example.vegalayoutmanager.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vegalayoutmanager.ImageObject
import com.example.vegalayoutmanager.R
import com.example.vegalayoutmanager.adapter.holder.FootballTeamViewHolder
import java.util.*

class FootballAdapter : RecyclerView.Adapter<FootballTeamViewHolder>() {

    private val items: MutableList<ImageObject>

    init {
        items = ArrayList()
        items.add(ImageObject("Milan", "Italy", R.drawable.vega_focus_image_1))
        items.add(ImageObject("Chelsea", "England", R.drawable.vega_focus_image_2))
        items.add(ImageObject("Real Madrid", "Spain", R.drawable.vega_focus_image_3))
        items.add(ImageObject("PSG", "France", R.drawable.vega_focus_image_4))
        items.add(ImageObject("Bayern", "Germany", R.drawable.vega_focus_image_5))
        items.add(ImageObject("Milan", "Italy", R.drawable.vega_focus_image_1))
        items.add(ImageObject("Chelsea", "England", R.drawable.vega_focus_image_2))
        items.add(ImageObject("Real Madrid", "Spain", R.drawable.vega_focus_image_3))
        items.add(ImageObject("PSG", "France", R.drawable.vega_focus_image_4))
        items.add(ImageObject("Bayern", "Germany", R.drawable.vega_focus_image_5))
        items.add(ImageObject("Milan", "Italy", R.drawable.vega_focus_image_1))
        items.add(ImageObject("Chelsea", "England", R.drawable.vega_focus_image_2))
        items.add(ImageObject("Real Madrid", "Spain", R.drawable.vega_focus_image_3))
        items.add(ImageObject("PSG", "France", R.drawable.vega_focus_image_4))
        items.add(ImageObject("Bayern", "Germany", R.drawable.vega_focus_image_5))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            FootballTeamViewHolder(LayoutInflater
                    .from(parent.context)
                    .inflate(R.layout.v_focus_resize, parent, false))

    override fun onBindViewHolder(holder: FootballTeamViewHolder, position: Int) {
        val (clubName, country, clubBackground) = items[position]
        holder.clubName.text = clubName
        holder.country.text = country
        holder.background.setBackgroundResource(clubBackground)
    }

    override fun getItemCount() = items.size
}
