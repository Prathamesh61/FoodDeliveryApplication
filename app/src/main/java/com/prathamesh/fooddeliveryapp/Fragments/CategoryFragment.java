package com.prathamesh.fooddeliveryapp.Fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.prathamesh.fooddeliveryapp.Interfaces.FragmentCommunicationListener;
import com.prathamesh.fooddeliveryapp.R;
import com.prathamesh.fooddeliveryapp.SharedPreferenceHelper;
import com.prathamesh.fooddeliveryapp.SubCategoryFragment;


public class CategoryFragment extends Fragment implements View.OnClickListener{
    protected ImageView ivHomeStyle,ivPizza,ivBiryani,ivFastFood,ivChinese,ivStreet,ivIceCream,ivSweet,ivCake,ivSeaFood,ivSoup;
    protected LinearLayout linearLayout;
    protected RecyclerView subCategoryRecyclerView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        // Inflate the layout for this fragment
        initViews(view);
        return view;
    }
    private void initViews(View view) {
        ivHomeStyle=view.findViewById(R.id.homeStyleCat);
        ivHomeStyle.setOnClickListener(this);
        ivHomeStyle.setImageResource(R.drawable.noodles_image);

        ivPizza=view.findViewById(R.id.pizzaCat);
        ivPizza.setOnClickListener(this);
        ivPizza.setImageResource(R.drawable.noodles_image);

        ivBiryani=view.findViewById(R.id.biryaniCat);
        ivBiryani.setOnClickListener(this);
        ivBiryani.setImageResource(R.drawable.noodles_image);

        ivFastFood=view.findViewById(R.id.fastFoodCat);
        ivFastFood.setOnClickListener(this);
        ivFastFood.setImageResource(R.drawable.noodles_image);

        ivChinese=view.findViewById(R.id.chineseCat);
        ivChinese.setOnClickListener(this);
        ivChinese.setImageResource(R.drawable.noodles_image);

        ivStreet=view.findViewById(R.id.streetCat);
        ivStreet.setOnClickListener(this);
        ivStreet.setImageResource(R.drawable.noodles_image);

        ivIceCream=view.findViewById(R.id.iceCreamCat);
        ivIceCream.setOnClickListener(this);
        ivIceCream.setImageResource(R.drawable.noodles_image);

        ivSoup=view.findViewById(R.id.soupCat);
        ivSoup.setOnClickListener(this);
        ivSoup.setImageResource(R.drawable.noodles_image);

        ivSeaFood=view.findViewById(R.id.seaFoodCat);
        ivSeaFood.setOnClickListener(this);
        ivSeaFood.setImageResource(R.drawable.noodles_image);

        ivSweet=view.findViewById(R.id.sweetsCat);
        ivSweet.setOnClickListener(this);
        ivSweet.setImageResource(R.drawable.noodles_image);

        ivCake=view.findViewById(R.id.cakeCat);
        ivCake.setOnClickListener(this);
        ivCake.setImageResource(R.drawable.noodles_image);

        subCategoryRecyclerView=view.findViewById(R.id.rvSubCategoryRecyclerView);
        linearLayout=view.findViewById(R.id.subCatLinearLayout);

    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){
            case R.id.homeStyleCat :
                dataCommunicator("Categories","Home Style");
                    break;
            case R.id.chineseCat:
                dataCommunicator("Categories","Chinese");
                break;
            case R.id.biryaniCat:
                dataCommunicator("Categories","Biryani");
                break;
            case R.id.seaFoodCat:
                dataCommunicator("Categories","Sea Food");
                break;
            case R.id.soupCat:
                dataCommunicator("Categories","Soup");
                break;
            case R.id.fastFoodCat:
                dataCommunicator("Categories","Fast Food");
                break;
            case R.id.streetCat:
                dataCommunicator("Categories","Street Food");
                break;
            case R.id.sweetsCat:
                dataCommunicator("Categories","Sweet Food");
                break;
            case R.id.iceCreamCat:
                dataCommunicator("Categories","Ice Cream");
                break;
            case R.id.pizzaCat:
                dataCommunicator("Categories","Pizza");
                break;
            case R.id.cakeCat :
                dataCommunicator("Categories","Cake");
                break;
            default:
                dataCommunicator("Categories","Home Style");
        }
    }
    public void dataCommunicator(String key,String data) {
        SharedPreferenceHelper.writeStringPreference(getContext(), key, data);
        SubCategoryFragment subCategoryFragment=new SubCategoryFragment();
        FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
        transaction.replace(R.id.subCatLinearLayout, subCategoryFragment);
        transaction.commit();


    }
}
