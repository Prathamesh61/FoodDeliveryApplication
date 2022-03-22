package com.prathamesh.fooddeliveryapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.Interfaces.CartViewListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.R;
import com.prathamesh.fooddeliveryapp.ViewHolder.CartViewHolder;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartViewHolder> {
    private ArrayList<Product> itemList;
    private CartViewListener cartViewListener;

    public CartAdapter(ArrayList<Product> itemList, CartViewListener cartViewListener) {
        this.itemList = itemList;
        this.cartViewListener = cartViewListener;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_cart_items, parent, false);
        return new CartViewHolder(view, cartViewListener);

    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        Product product = itemList.get(position);
        holder.setCartItemsData(product);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
