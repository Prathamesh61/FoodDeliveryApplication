package com.prathamesh.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.prathamesh.fooddeliveryapp.Adapters.AddressAdapter;
import com.prathamesh.fooddeliveryapp.Interfaces.AddressClickListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.AddressModel;

import java.util.ArrayList;

public class Address extends AppCompatActivity implements AddressClickListener {
    private ArrayList<AddressModel> addressList;
    private TextView btnAddNew ,edit;
    private RecyclerView recyclerView;
    private RelativeLayout relativeLayout;
    private Button btnSave;
    private EditText eName,eMobileNo,ePinCode,eHouse,eRoad;
    private RadioButton mainAddress;
    private RadioGroup rbIsHome;
    private Switch defaultSwitch;
    public AddressAdapter addressAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        recyclerView=findViewById(R.id.addressRecyclerView);
        btnAddNew=findViewById(R.id.tvAddNewAddress);
        edit=findViewById(R.id.tvEdit);
        mainAddress=findViewById(R.id.radioButton);
        BuildListAddress();
        setRecyclerView();
        relativeLayout=findViewById(R.id.addressRelative);
        btnSave=findViewById(R.id.btnConitnue);
        eName= findViewById(R.id.etName);
        eMobileNo=findViewById(R.id.etMobileNumber);
        ePinCode=findViewById(R.id.etPincode);
        eHouse=findViewById(R.id.etHouseNumber);
        eRoad=findViewById(R.id.etLocality);
        rbIsHome=findViewById(R.id.rbIsHome);
        defaultSwitch=findViewById(R.id.switchDefaultAddress);

    }
    private void BuildListAddress() {

        AddressModel first = new AddressModel(true,"Prathamesh Rawool","9665186841",401209,"101-B,Vanita Society","Shankeshwar nagar,Nallasopara(East)",true);
        addressList.add(first);
    }

    private void setRecyclerView() {
        addressAdapter = new AddressAdapter(addressList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(addressAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void onAddressClickListener(int adapterPosition, AddressModel addressModel) {
        AddressModel add;
        if (addressModel.isDefault()){
            add = new AddressModel(false,
                    addressModel.getUserName(),
                    addressModel.getUserMobileNumber(),
                    addressModel.getUserPinCode(),
                    addressModel.getUserHouse(),
                    addressModel.getUserLocality(),
                    false);
        }else{
            add = new AddressModel(true,
                    addressModel.getUserName(),
                    addressModel.getUserMobileNumber(),
                    addressModel.getUserPinCode(),
                    addressModel.getUserHouse(),
                    addressModel.getUserLocality(),
                    false);
        }
        addressList.set(adapterPosition, add);
        addressAdapter.notifyDataSetChanged();
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setVisibility(View.VISIBLE);
                eName.setText(add.getUserName());
                eMobileNo.setText(add.getUserMobileNumber());
                ePinCode.setText(add.getUserPinCode());
                eHouse.setText(add.getUserHouse());
                eRoad.setText(add.getUserLocality());
                rbIsHome.setActivated(add.isHome());
                btnSave.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        relativeLayout.setVisibility(View.GONE);
                        AddressModel new_add=new AddressModel(false,eName.getText().toString(),eMobileNo.getText().toString(),Integer.parseInt(ePinCode.getText().toString()),eHouse.getText().toString(),eRoad.getText().toString(), add.isHome());
                        addressList.set(adapterPosition,new_add);
                        addressAdapter.notifyDataSetChanged();
                    }
                });
            }
        });
    }
}