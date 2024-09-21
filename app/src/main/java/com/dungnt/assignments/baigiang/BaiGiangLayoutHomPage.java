package com.dungnt.assignments.baigiang;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dungnt.assignments.R;

import java.util.ArrayList;
import java.util.List;

public class BaiGiangLayoutHomPage extends AppCompatActivity {
    RecyclerView recyclerView;
    RecycleViewAdapterTest adapter;
    private List<String> itemList;
    List<Student> students;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_giang_layout_hom_page);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Setup LayoutManager (Linear, Grid, StaggeredGrid)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Prepare data
        itemList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            itemList.add("Item " + i);
        }

        // Setup Adapter
        adapter = new RecycleViewAdapterTest(itemList);
        recyclerView.setAdapter(adapter);
    }
}