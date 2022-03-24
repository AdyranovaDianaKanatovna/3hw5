package com.example.a3hw52;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ContactAdapter adapter;
    private ArrayList<String> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        contacts = new ArrayList<>();
        contacts.add("Mother");
        contacts.add("Father");
        contacts.add("Sister");
        contacts.add("Brother");
        contacts.add("Grandmother");
        contacts.add("Grandfather");
        adapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);
    }
}