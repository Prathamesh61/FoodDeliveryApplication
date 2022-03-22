package com.prathamesh.fooddeliveryapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prathamesh.fooddeliveryapp.Interfaces.AddressClickListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.AddressModel;
import com.prathamesh.fooddeliveryapp.R;
import com.prathamesh.fooddeliveryapp.ViewHolder.AddressViewHolder;

import java.util.ArrayList;

public class AddressAdapter extends RecyclerView.Adapter<AddressViewHolder> {
    private ArrayList<AddressModel> addressList;
    private AddressClickListener addressClickListener;


    public AddressAdapter(ArrayList<AddressModel> addressList,AddressClickListener addressClickListener) {
        this.addressClickListener =addressClickListener;
        this.addressList= addressList;
    }

    @NonNull
    @Override
    public AddressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_address, parent, false);
        return new AddressViewHolder(view,addressClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AddressViewHolder holder, int position) {
        AddressModel addressModel = addressList.get(position);
        holder.setAddressViewData(addressModel);
    }

    @Override
    public int getItemCount() {
        return addressList.size();
    }
}
