package com.kirchhoff.focusresize

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.library.FocusResizeScrollListener
import com.kirchhoff.focusresize.adapter.ResizeAdapter

class FocusResizeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_focus_resize)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val linearLayoutManager = LinearLayoutManager(this)

        val resizeAdapter = ResizeAdapter(this, resources.getDimension(R.dimen.focus_resize_item_height).toInt())

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = resizeAdapter
        recyclerView.addOnScrollListener(FocusResizeScrollListener(resizeAdapter, linearLayoutManager))
    }
}
