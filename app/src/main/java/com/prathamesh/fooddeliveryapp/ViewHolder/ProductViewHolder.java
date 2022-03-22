package com.prathamesh.fooddeliveryapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.Interfaces.ProductViewListener;
import com.prathamesh.fooddeliveryapp.R;

public class ProductViewHolder extends RecyclerView.ViewHolder {
    private ImageView productImageView;
    private TextView productName;
    private TextView productDescription;
    private TextView productPrice;
    private TextView productRating;
    private CardView cardView;
    private ProductViewListener productViewListener;

    public ProductViewHolder(@NonNull View itemView, ProductViewListener productViewListener) {
        super(itemView);
        this.productViewListener=productViewListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        productImageView=itemView.findViewById(R.id.ivProductImage);
        productName=itemView.findViewById(R.id.tvProductName);
        productDescription=itemView.findViewById(R.id.tvProductDesc);
        productPrice=itemView.findViewById(R.id.tvProductPrice);
        productRating=itemView.findViewById(R.id.tvProductRating);
        cardView=itemView.findViewById(R.id.cardView1);
    }
    public void setProductData(Product product){
        productImageView.setImageResource(product.getImageView());
        productName.setText(product.getProductName());
        productDescription.setText(product.getProductDescription());
        productPrice.setText(product.getProductPrice()+" ");
        productRating.setText(product.getProductRating()+" ");
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productViewListener.onProductClick(product,getAdapterPosition());
            }
        });
    }
}
