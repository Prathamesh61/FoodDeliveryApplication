package com.prathamesh.fooddeliveryapp.ModelClasses;

public class Subcategory {
    private int categoryImage;
    private String categoryName;
    private static String categoryId;

    public int getCategoryImage() {
        return categoryImage;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public static String getCategoryId() {
        return categoryId;
    }

    public Subcategory(int categoryImage, String categoryName, String categoryId) {
        this.categoryImage = categoryImage;
        this.categoryName = categoryName;
        this.categoryId = categoryId;
    }
}
