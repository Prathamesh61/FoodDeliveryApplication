package com.prathamesh.fooddeliveryapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.prathamesh.fooddeliveryapp.Adapters.MyOrdersAdapter;
import com.prathamesh.fooddeliveryapp.Interfaces.ProductViewListener;
import com.prathamesh.fooddeliveryapp.MainMenuScreen;
import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.R;
import com.prathamesh.fooddeliveryapp.SubCategoryFragment;

import java.util.ArrayList;


public class MyOrdersFragment extends Fragment implements ProductViewListener {
    private RecyclerView recyclerView;
    private TextView message;
    MyOrdersAdapter myOrdersAdapter;
    private static ArrayList<Product> myOrderList = new ArrayList<>();


    public MyOrdersFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_orders, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.rvMyOrderRecyclerView);
        message = view.findViewById(R.id.tvMyOrdersTextViewPrevious);
        if (myOrderList.size() == 0) {
            message.setVisibility(View.VISIBLE);
            message.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HomeFragment homeFragment=new HomeFragment();
                    FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                    transaction.replace(R.id.MainScreenContainer, homeFragment);
                    transaction.commit();
                }
            });
        }else {
            setRecyclerView();
        }
    }

        private void setRecyclerView() {
            myOrdersAdapter = new MyOrdersAdapter(myOrderList, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            recyclerView.setAdapter(myOrdersAdapter);
            recyclerView.setLayoutManager(linearLayoutManager);
            myOrdersAdapter.notifyDataSetChanged();
        }

        @Override
        public void onProductClick (Product product,int position){
            myOrderList.remove(position);
            myOrdersAdapter.updateData(myOrderList);
        }
    }
