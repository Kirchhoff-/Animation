package com.example.vegalayoutmanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

import com.example.vegalayoutmanager.adapter.FootballAdapter
import com.stone.vega.library.VegaLayoutManager

class VegaManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_vega_manager)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = VegaLayoutManager()
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = FootballAdapter()
    }
}
