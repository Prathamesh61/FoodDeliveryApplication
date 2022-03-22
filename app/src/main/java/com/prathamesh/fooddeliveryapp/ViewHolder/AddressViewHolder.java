package com.prathamesh.fooddeliveryapp.ViewHolder;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.Interfaces.AddressClickListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.AddressModel;
import com.prathamesh.fooddeliveryapp.R;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView userMobileNo,userAddress,isHome,isDefault,btnEdit;
    private RadioButton radioButton;
    private CardView cardview;
    private AddressClickListener addressClickListener;


    public AddressViewHolder(@NonNull View itemView,AddressClickListener addressClickListener) {
        super(itemView);
        this.addressClickListener = addressClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        radioButton=itemView.findViewById(R.id.radioButton);
        userAddress=itemView.findViewById(R.id.tvAddress);
        userMobileNo=itemView.findViewById(R.id.tvMobileAdd);
        isHome=itemView.findViewById(R.id.tvHomeAdd);
        isDefault=itemView.findViewById(R.id.defaultAddress);
        btnEdit=itemView.findViewById(R.id.btnConitnue);
        cardview=itemView.findViewById(R.id.cardView4);
    }
    public void setAddressViewData(AddressModel address){
        radioButton.setText(address.getUserName());
        userMobileNo.setText(address.getUserMobileNumber()+" ");
        userAddress.setText(address.getUserHouse()+address.getUserLocality()+address.getUserPinCode());
        isHome.setActivated(address.isHome());
        isDefault.setActivated(address.isDefault());
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addressClickListener.onAddressClickListener(getAdapterPosition(),address);
            }
        });

    }
}
