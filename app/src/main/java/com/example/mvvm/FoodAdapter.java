package com.example.mvvm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    Context context;
    List<FoodItems> items;

    public FoodAdapter(Context context, List<FoodItems> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FoodViewHolder(
                LayoutInflater.from(context).inflate(R.layout.items, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodItems item = items.get(position);

        holder.imageView.setImageResource(item.getImage());
        holder.foodName.setText(item.getFoodName());
        holder.foodPrice.setText(item.getFoodPrice());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
