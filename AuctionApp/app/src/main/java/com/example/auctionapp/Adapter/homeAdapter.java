package com.example.auctionapp.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.auctionapp.databinding.ItemRvHomeBinding;

import java.util.ArrayList;

public class homeAdapter extends RecyclerView.Adapter<homeAdapter.MyViewHolder> {
    ArrayList<String> arrayList;
    public homeAdapter(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemRvHomeBinding binding = ItemRvHomeBinding.inflate(inflater, parent, false);
        return new MyViewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }
    public int getItemCount() {
        return arrayList != null ? arrayList.size() : 0;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ItemRvHomeBinding itemView;

        public MyViewHolder(@NonNull ItemRvHomeBinding itemView) {
            super(itemView.getRoot());
            this.itemView = itemView;
        }
    }
}
