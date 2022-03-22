package com.prathamesh.fooddeliveryapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.Interfaces.ProductViewListener;
import com.prathamesh.fooddeliveryapp.R;

public class SearchViewHolder extends RecyclerView.ViewHolder{
   private TextView nameOfProduct;
   private ProductViewListener productViewListener;
    public SearchViewHolder(@NonNull View itemView,ProductViewListener productViewListener) {
        super(itemView);
        this.productViewListener = productViewListener;
        nameOfProduct=itemView.findViewById(R.id.listItemName);
    }
    public void setSearchItems(){
        nameOfProduct.setText(Product.getProductName());
        nameOfProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
