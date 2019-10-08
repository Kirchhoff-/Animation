package com.kirchhoff.animation.recycler.vega;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.kirchhoff.animation.R;
import com.stone.vega.library.VegaLayoutManager;

/**
 * @author Kirchhoff-
 */

public class VegaManagerActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, VegaManagerActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_focus_resize);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        FootballAdapter footballAdapter = new FootballAdapter();

        recyclerView.setLayoutManager(new VegaLayoutManager());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(footballAdapter);
    }
}
