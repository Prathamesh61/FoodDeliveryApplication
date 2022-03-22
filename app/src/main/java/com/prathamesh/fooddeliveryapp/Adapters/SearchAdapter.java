package com.prathamesh.fooddeliveryapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.Interfaces.ProductViewListener;
import com.prathamesh.fooddeliveryapp.R;
import com.prathamesh.fooddeliveryapp.ViewHolder.SearchViewHolder;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder>{
    public  ArrayList<Product> list;
    private ProductViewListener productViewListener;
    public void filterList(ArrayList<Product> searchList) {
        list=searchList;
        notifyDataSetChanged();
    }

    public SearchAdapter(ArrayList<Product> list,ProductViewListener productViewListener) {
        this.list = list;
        this.productViewListener=productViewListener;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.seach_list, parent, false);
        return new SearchViewHolder(view,productViewListener);
    }
    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        Product item = list.get(position);
        holder.setSearchItems();
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
