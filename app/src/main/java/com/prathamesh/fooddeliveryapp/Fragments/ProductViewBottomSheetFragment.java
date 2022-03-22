package com.prathamesh.fooddeliveryapp.Fragments;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.prathamesh.fooddeliveryapp.Cart;
import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.R;

public class ProductViewBottomSheetFragment extends BottomSheetDialogFragment {
    private ImageView add,remove,prodImage;
    private TextView prodQuantity,prodPrice,prodName,prodDesc;
    private Button btnAddToCart;
    public ProductViewBottomSheetFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        setData();
        return view;
    }

    private void initView(View view) {
        add = view.findViewById(R.id.ivAddItem);
        remove = view.findViewById(R.id.ivRemoveItem);
        prodQuantity = view.findViewById(R.id.tvItemCount);
        prodPrice = view.findViewById(R.id.tvProductPriceProductView);
        btnAddToCart = view.findViewById(R.id.btnAddItemToCart);

        prodName=view.findViewById(R.id.tvProductNameProductView);
        prodDesc=view.findViewById(R.id.tvProductDescProductView);
        prodImage=view.findViewById(R.id.ivProductImageProductView);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count =0;
                if (count>=0) {
                    prodQuantity.setText(count++);
                    double incrementedPrice = count++ * Product.getProductPrice() ;
                    prodPrice.setText(Double.toString(incrementedPrice));
                }else{
                    Toast.makeText(getContext(),"Please add some quantity",Toast.LENGTH_SHORT);
                }
            }
        });
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count=0;
                if (count>1){
                    prodQuantity.setText(count--);
                    double decrementedPrice = Product.getProductPrice() / count--;
                    prodPrice.setText(Double.toString(decrementedPrice));
                }
            }
        });
        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int image = Product.getImageView();
                prodImage.setImageResource(image);
                String name = Product.getProductName();
                prodName.setText(name);
                String desc = Product.getProductDescription();
                prodName.setText(desc);
                double price = Product.getProductPrice();
                prodPrice.setText((int) price);
                Product product = new Product(image,name,desc,price);
                Cart.cartList.add(product);

            }
        });
    }
    public void setData(){
        int image = Product.getImageView();
        prodImage.setImageResource(image);
        String name = Product.getProductName();
        prodName.setText(name);
        String desc = Product.getProductDescription();
        prodName.setText(desc);
        double price = Product.getProductPrice();
        prodPrice.setText((int) price);
    }


}