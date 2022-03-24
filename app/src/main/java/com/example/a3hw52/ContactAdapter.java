package com.example.a3hw52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    private ArrayList<String> list;

    public ContactAdapter(ArrayList<String> contacts) {
        list= contacts;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_contact,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
 holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

