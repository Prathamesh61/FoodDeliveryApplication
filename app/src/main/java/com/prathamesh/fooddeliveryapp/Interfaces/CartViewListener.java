package com.prathamesh.fooddeliveryapp.Interfaces;

import com.prathamesh.fooddeliveryapp.ModelClasses.Product;

public interface CartViewListener {
    void onCartItemClick(Product product, int adapterPosition);
}
