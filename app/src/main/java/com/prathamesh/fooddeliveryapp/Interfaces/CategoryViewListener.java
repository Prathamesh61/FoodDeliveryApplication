package com.prathamesh.fooddeliveryapp.Interfaces;

import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.ModelClasses.Subcategory;

public interface CategoryViewListener {

    void onCategoryClick(Subcategory subcategory, int position);

}
