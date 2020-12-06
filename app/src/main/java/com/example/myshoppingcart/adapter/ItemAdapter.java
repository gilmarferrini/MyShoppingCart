package com.example.myshoppingcart.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myshoppingcart.R;
import com.example.myshoppingcart.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private List<Item> itemsList = new ArrayList<>();

    @NonNull
    @Override
    public ItemAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // converter XML para um objeto do tipo view
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_items_list, parent, false);

        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.MyViewHolder holder, int position) {
        Item item = itemsList.get(position);

        holder.name.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.textViewNameItem);
        }
    }
}
