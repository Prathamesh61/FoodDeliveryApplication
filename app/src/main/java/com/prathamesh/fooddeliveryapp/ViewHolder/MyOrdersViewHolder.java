package com.prathamesh.fooddeliveryapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.Interfaces.ProductViewListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.R;

public class MyOrdersViewHolder extends RecyclerView.ViewHolder {
    private ImageView prodImage;
    private TextView prodRating,prodName,prodDesc,prodPrice,prodQuantity;
    private ProductViewListener productViewListener;
    private RelativeLayout relativeLayout;
    public MyOrdersViewHolder(@NonNull View itemView,ProductViewListener productViewListener) {
        super(itemView);
        this.productViewListener=productViewListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        prodImage=itemView.findViewById(R.id.ivMyOrdersImageProduct);
        prodName=itemView.findViewById(R.id.tvMyOrdersProductName);
        prodDesc=itemView.findViewById(R.id.tvMyOrdersProductDescription);
        prodPrice=itemView.findViewById(R.id.tvMyOrdersProductPrice);
        prodQuantity=itemView.findViewById(R.id.tvMyOrdersQuantity);
        prodRating=itemView.findViewById(R.id.tvMOProductRating);
        relativeLayout=itemView.findViewById(R.id.MOrelativeLayout);
    }
    public void setItemsData(Product product){
        prodImage.setImageResource(product.getImageView());
        prodName.setText(product.getProductName());
        prodDesc.setText(product.getProductDescription());
        prodPrice.setText(product.getProductPrice()+" ");
        prodRating.setText(product.getProductRating()+" ");
        prodRating.setText(product.getProductRating()+" ");
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productViewListener.onProductClick(product,getAdapterPosition());
            }
        });
    }
}
