package com.prathamesh.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.prathamesh.fooddeliveryapp.Adapters.CartAdapter;
import com.prathamesh.fooddeliveryapp.Fragments.CategoryFragment;
import com.prathamesh.fooddeliveryapp.Interfaces.CartViewListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.Product;

import java.util.ArrayList;

public class Cart extends AppCompatActivity implements CartViewListener {
    protected ImageView btnBack;
    protected RecyclerView recyclerView;
    public static ArrayList<Product> cartList;
    protected Button addItems;
    protected TextView prodName,prodPrice,totalPriceAfterIncrement,count;
    protected ImageView prodImage,ivRemoveItem,ivAddItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        btnBack=findViewById(R.id.backButtonCart);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        addItems=findViewById(R.id.btnAddMoreItems);
        addItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CategoryFragment fragment = new CategoryFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.MainScreenContainer, fragment);
                transaction.commit();
            }
        });
        recyclerView=findViewById(R.id.cartRecyclerView);
        setRecyclerView();
        prodName=findViewById(R.id.tvFoodItemName);
        prodPrice=findViewById(R.id.tvFoodItemPrice);
        count=findViewById(R.id.tvItemCount);
        totalPriceAfterIncrement=findViewById(R.id.tvTotalAfterIncrement);
        ivRemoveItem=findViewById(R.id.ivRemoveItem);
        ivAddItem=findViewById(R.id.ivAddItem);
        ivRemoveItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              removeButton();
            }
        });
        ivAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addButton();
            }
        });
    }

    private void setRecyclerView() {
        CartAdapter cartAdapter = new CartAdapter(cartList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();
    }
    private void removeButton(){
        int itemCount = Integer.parseInt((count.getText().toString()));
        if (itemCount>=1){
            itemCount = itemCount--;
            count.setText(itemCount);
            double price = Product.getProductPrice();
            String afterIncrement;
            afterIncrement = String.valueOf((price/itemCount));
            totalPriceAfterIncrement.setText(afterIncrement);
        }
    }
    private void addButton(){
        int itemCount = Integer.parseInt((count.getText().toString()));
        if (itemCount>=1){
             itemCount = itemCount++;
             count.setText(itemCount);
             double price= Product.getProductPrice();
             String afterIncrement;
            afterIncrement = String.valueOf((itemCount*price));
            totalPriceAfterIncrement.setText(afterIncrement);
        }
    }

    @Override
    public void onCartItemClick(Product product, int adapterPosition) {

    }
}