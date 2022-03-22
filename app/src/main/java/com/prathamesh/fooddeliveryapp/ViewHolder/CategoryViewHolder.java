package com.prathamesh.fooddeliveryapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.Interfaces.CategoryViewListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.Subcategory;
import com.prathamesh.fooddeliveryapp.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder {
    private ImageView categoryImage;
    private TextView categoryName;
    private LinearLayout linearLayout;
    private CategoryViewListener categoryViewListener;
    public CategoryViewHolder(@NonNull View itemView, CategoryViewListener categoryViewListener) {
        super(itemView);
        this.categoryViewListener = categoryViewListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        categoryImage=itemView.findViewById(R.id.ivCategoryRVImage);
        categoryName=itemView.findViewById(R.id.tvSubCategoryHeading);
        linearLayout=itemView.findViewById(R.id.linearlayoutCategory);
    }
    public void setCategoryViewData(Subcategory subcategory){
        categoryImage.setImageResource(subcategory.getCategoryImage());
        categoryName.setText(subcategory.getCategoryName());
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                categoryViewListener.onCategoryClick(subcategory,getAdapterPosition());
            }
        });

    }
}
