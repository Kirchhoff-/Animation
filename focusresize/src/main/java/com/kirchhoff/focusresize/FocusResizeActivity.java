package com.kirchhoff.focusresize;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.library.FocusResizeScrollListener;
import com.kirchhoff.focusresize.adapter.ResizeAdapter;

public class FocusResizeActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, FocusResizeActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_focus_resize);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        ResizeAdapter resizeAdapter = new ResizeAdapter(this, (int) getResources().getDimension(R.dimen.focus_resize_item_height));

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(resizeAdapter);
        recyclerView.addOnScrollListener(new FocusResizeScrollListener<>(resizeAdapter, linearLayoutManager));
    }
}
