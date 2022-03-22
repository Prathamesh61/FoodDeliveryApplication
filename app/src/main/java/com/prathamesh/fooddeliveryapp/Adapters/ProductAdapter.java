package com.prathamesh.fooddeliveryapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.Interfaces.ProductViewListener;
import com.prathamesh.fooddeliveryapp.R;
import com.prathamesh.fooddeliveryapp.ViewHolder.ProductViewHolder;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private ArrayList<Product> productList;
    private ProductViewListener productViewListener;
    public ProductAdapter(ArrayList<Product> productList, ProductViewListener productViewListener) {
        this.productList = productList;
        this.productViewListener = productViewListener;
    }
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_subcategory, parent, false);
        return new ProductViewHolder(view,productViewListener);
    }
    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product=productList.get(position);
        holder.setProductData(product);
    }
    @Override
    public int getItemCount() {
        return productList.size();
    }
}
