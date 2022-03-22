package com.prathamesh.fooddeliveryapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.Interfaces.CartViewListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.R;

public class CartViewHolder extends RecyclerView.ViewHolder {
    private ImageView isVeg;
    private TextView prodName;
    private TextView prodDesc;
    private TextView prodPrice;
    private CardView cardView;
    private CartViewListener cartViewListener;

    public CartViewHolder(@NonNull View itemView, CartViewListener cartViewListener) {
        super(itemView);
        this.cartViewListener=cartViewListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        isVeg=itemView.findViewById(R.id.ivFoodTypeIndicator);
        prodName=itemView.findViewById(R.id.tvFoodItemName);
        prodDesc=itemView.findViewById(R.id.tvFoodItemDesc);
        prodPrice=itemView.findViewById(R.id.tvFoodItemPrice);
        cardView=itemView.findViewById(R.id.cardView2);
    }
    public void setCartItemsData(Product product){
        isVeg.setActivated(product.isVeg());
        prodName.setText(product.getProductName());
        prodDesc.setText(product.getProductDescription());
        prodPrice.setText(product.getProductPrice()+"");
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartViewListener.onCartItemClick(product, getAdapterPosition());
            }
        });
    }
}
