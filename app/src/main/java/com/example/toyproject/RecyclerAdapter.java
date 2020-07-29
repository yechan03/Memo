package com.example.toyproject;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private ArrayList<Data> mList;




    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        protected TextView swift;

        public RecyclerViewHolder(View view) {
            super(view);
            this.swift = view.findViewById(R.id.list_item);
        }
    }

    public RecyclerAdapter(ArrayList<Data> list) {
        this.mList = list;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder viewHolder, int position) {

        viewHolder.swift.setText(mList.get(position).getSwift());

    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }
}

