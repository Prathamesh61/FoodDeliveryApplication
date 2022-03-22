package com.prathamesh.fooddeliveryapp.ModelClasses;

import java.util.Collection;

public class Product {
    private static int productImage;
    private static String productName;
    private static String productDescription;
    private static double productPrice;
    private double productRating;
    private boolean isVeg;
    private String id;
    private static int quantity;


    public static int getQuantity() {
        return quantity;
    }

    public static int getImageView() {
        return productImage;
    }

    public static String getProductName() {
        return productName;
    }

    public static String getProductDescription() {
        return productDescription;
    }

    public Product(int productImage, String productName, String productDescription,double productPrice) {
        this.productImage = productImage;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public static double getProductPrice() {
        return productPrice;
    }

    public double getProductRating() {
        return productRating;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public String getId() {
        return id;
    }

    public Product(int productImage, String productName, String productDescription, double productPrice, double productRating, String id, boolean isVeg) {
        this.productImage = productImage;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.isVeg = isVeg;
        this.id = id;
    }


}
