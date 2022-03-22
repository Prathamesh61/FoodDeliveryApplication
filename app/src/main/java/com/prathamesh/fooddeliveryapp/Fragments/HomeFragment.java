package com.prathamesh.fooddeliveryapp.Fragments;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.prathamesh.fooddeliveryapp.Adapters.SearchAdapter;
import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.Interfaces.ProductViewListener;
import com.prathamesh.fooddeliveryapp.R;
import com.prathamesh.fooddeliveryapp.SliderAdapter;
import com.prathamesh.fooddeliveryapp.SliderData;
import com.prathamesh.fooddeliveryapp.SubCategory;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements ProductViewListener {
    protected SliderView sliderView;
    protected EditText searchInput;
    protected CardView cardView;
    protected ArrayList<Product> searchList = SubCategory.getProductList();
    protected SearchAdapter adapter ;
    protected RecyclerView recyclerViewSearch;
    protected ImageView ivPizza,ivNoodles,ivChicken,ivBiryani,ivPaneer,ivBurger,ivIcecream,ivPasta,ivHomepage,ivFirstSquare,ivSecondSquare,ivThirdSquare,ivFourthSquare,ivHomepage2;


    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this Fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        //setRecyclerView();
        slideView();
        return view;
    }


    public void setRecyclerView() {
        adapter= new SearchAdapter(searchList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerViewSearch.setLayoutManager(linearLayoutManager);
        recyclerViewSearch.setAdapter(adapter);
    }

    private void initView(View view) {
        ivPizza=view.findViewById(R.id.ivPizza);
        ivBiryani=view.findViewById(R.id.ivBiryani);
        ivBurger=view.findViewById(R.id.ivBurger);
        ivIcecream=view.findViewById(R.id.ivIcecream);
        ivChicken=view.findViewById(R.id.ivChicken);
        ivFirstSquare=view.findViewById(R.id.FirstSquareImage);
        ivSecondSquare=view.findViewById(R.id.SecondSquareImage);
        ivThirdSquare=view.findViewById(R.id.ThirdSquareImage);
        ivFourthSquare=view.findViewById(R.id.FourthSquareimage);
        ivHomepage=view.findViewById(R.id.ivHomepageImage);
        ivHomepage2=view.findViewById(R.id.homepageImage2);
        ivNoodles=view.findViewById(R.id.ivNoodles);
        ivPasta=view.findViewById(R.id.ivPasta);
        ivPaneer=view.findViewById(R.id.ivPaneer);
        sliderView =view.findViewById(R.id.imageSlider);
        searchInput=view.findViewById(R.id.searchEd);
        cardView=view.findViewById(R.id.searchLayout);
        searchInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                searchInput.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        filter(s.toString());
                    }
                });
            }
        });
    }
    public void filter(String text){
        for (Product item : searchList){
         if (item.getId().toString().toLowerCase().contains(text.toLowerCase())){
             searchList.add(item);
         }
        }
        adapter.filterList(searchList);
    }
    private void slideView() {

        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();
        sliderDataArrayList.add(new SliderData(R.drawable.slider_image_1));
        sliderDataArrayList.add(new SliderData(R.drawable.slider_image_1));
        sliderDataArrayList.add(new SliderData(R.drawable.slider_image_1));
        sliderDataArrayList.add(new SliderData(R.drawable.slider_image_1));
        sliderDataArrayList.add(new SliderData(R.drawable.slider_image_1));

        SliderAdapter adapter = new SliderAdapter(getContext(), sliderDataArrayList);
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        sliderView.setSliderAdapter(adapter);
        sliderView.setScrollTimeInSec(2);

        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();


    }

    @Override
    public void onProductClick(Product product, int position) {

    }
}