package com.prathamesh.fooddeliveryapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.Interfaces.ProductViewListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.R;
import com.prathamesh.fooddeliveryapp.ViewHolder.MyOrdersViewHolder;
import com.prathamesh.fooddeliveryapp.ViewHolder.ProductViewHolder;

import java.util.ArrayList;

public class MyOrdersAdapter extends RecyclerView.Adapter<MyOrdersViewHolder> {
    private ArrayList<Product> myOrderList;
    private ProductViewListener productViewListener;
    public MyOrdersAdapter(ArrayList<Product> myOrderList, ProductViewListener productViewListener) {
        this.myOrderList = myOrderList;
        this.productViewListener = productViewListener;
    }
    @NonNull
    @Override
    public MyOrdersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_my_orders, parent, false);
        return new MyOrdersViewHolder(view,productViewListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOrdersViewHolder holder, int position) {

        Product product=myOrderList.get(position);
        holder.setItemsData(product);
    }

    @Override
    public int getItemCount() {
        return myOrderList.size();
    }

    public void updateData(ArrayList<Product> myOrderList) {
        this.myOrderList = myOrderList;
        notifyDataSetChanged();
    }
}
