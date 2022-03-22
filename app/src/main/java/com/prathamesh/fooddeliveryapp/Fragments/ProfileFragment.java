package com.prathamesh.fooddeliveryapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.prathamesh.fooddeliveryapp.Address;
import com.prathamesh.fooddeliveryapp.R;

public class ProfileFragment extends Fragment {
    protected TextView firstName,lastName, favourites, myAddressBook,myOrders , share;
    protected ImageView profilePic;
    public ProfileFragment() {
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
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        initView(view);
        return view;
    }
    private void initView(View view) {
        firstName=view.findViewById(R.id.tvFirstName);
        lastName=view.findViewById(R.id.tvLastName);
        favourites=view.findViewById(R.id.tvFavouritesList);
        myOrders=view.findViewById(R.id.tvMyOrdersList);
        myAddressBook=view.findViewById(R.id.tvMyAddressBookList);
        share=view.findViewById(R.id.tvShare);
        myAddressBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Address.class);
                startActivity(intent);
            }
        });

    }
}