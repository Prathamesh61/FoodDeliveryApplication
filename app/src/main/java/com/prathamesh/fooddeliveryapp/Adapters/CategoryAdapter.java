package com.prathamesh.fooddeliveryapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.Interfaces.CategoryViewListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.Subcategory;
import com.prathamesh.fooddeliveryapp.R;
import com.prathamesh.fooddeliveryapp.ViewHolder.CategoryViewHolder;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {
    private ArrayList<Subcategory> categoryList;
    private CategoryViewListener categoryViewListener;

    public CategoryAdapter(ArrayList<Subcategory> categoryList,CategoryViewListener categoryViewListener) {
        this.categoryList = categoryList;
        this.categoryViewListener = categoryViewListener;

    }
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_category, parent, false);
        return new CategoryViewHolder(view, categoryViewListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Subcategory subcategory = categoryList.get(position);
        holder.setCategoryViewData(subcategory);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
