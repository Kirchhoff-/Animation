package com.example.vegalayoutmanager.adapter.holder


import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import com.example.vegalayoutmanager.ImageObject
import com.example.vegalayoutmanager.R

class FootballTeamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var background: FrameLayout = itemView.findViewById(R.id.background)
    var clubName: TextView = itemView.findViewById(R.id.clubName)
    var country: TextView = itemView.findViewById(R.id.country)

    fun bind(imageObject: ImageObject) {
        clubName.text = imageObject.clubName
        country.text = imageObject.country
        background.setBackgroundResource(imageObject.clubBackground)
    }
}
