package com.prathamesh.fooddeliveryapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.prathamesh.fooddeliveryapp.Adapters.CategoryAdapter;
import com.prathamesh.fooddeliveryapp.Interfaces.CategoryViewListener;
import com.prathamesh.fooddeliveryapp.Interfaces.FragmentCommunicationListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.Subcategory;

import java.util.ArrayList;


public class SubCategoryFragment extends Fragment implements CategoryViewListener {
    protected TextView catName,subCatName;
    protected ImageView catImage;
    protected RecyclerView recyclerViewSubCategoryFragment;
    private final ArrayList<Subcategory> categoryList = new ArrayList<>();


    public SubCategoryFragment() {
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
        View view = inflater.inflate(R.layout.fragment_sub_category, container, false);
        recyclerViewSubCategoryFragment = view.findViewById(R.id.subCatRecyclerView);
        catImage = container.findViewById(R.id.ivCategoryRVImage);
        subCatName = container.findViewById(R.id.tvSubCategoryHeading);
        catName = container.findViewById(R.id.categoryName);
        BuildListSubCategory();
        //setNameCategory();
        setRecyclerViewSubCategory();
        return view;
    }

    private void setRecyclerViewSubCategory() {
        CategoryAdapter adapter = new CategoryAdapter(categoryList,this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerViewSubCategoryFragment.setAdapter(adapter);
        recyclerViewSubCategoryFragment.setLayoutManager(gridLayoutManager);
    }

    protected void BuildListSubCategory() {
        String data = SharedPreferenceHelper.getStringPreference(getContext(), "Categories");
        if (data.equals("Home Style")) {
            //catName.getText(data);
            Subcategory indianStarter = new Subcategory(R.drawable.noodles_image, "Indian Starter", "Home1");
            categoryList.add(indianStarter);

            Subcategory sabji = new Subcategory(R.drawable.noodles_image, "Indian Sabji", "Home2");
            categoryList.add(sabji);

            Subcategory roti = new Subcategory(R.drawable.noodles_image, "Indian Roti", "Home3");
            categoryList.add(roti);

            Subcategory rice = new Subcategory(R.drawable.noodles_image, "Basmati Special", "Home4");
            categoryList.add(rice);
        } else if (data.equals("Chinese")){
           //catName.setText(("Chinese"));

            Subcategory chineseStarter = new Subcategory(R.drawable.noodles_image, "Chinese Starter", "Chinese1");
            categoryList.add(chineseStarter);

            Subcategory chineseRice = new Subcategory(R.drawable.noodles_image, "Chinese Rice", "Chinese2");
            categoryList.add(chineseRice);

            Subcategory chineseNoodles = new Subcategory(R.drawable.noodles_image, "Chinese Noodles", "Chinese3");
            categoryList.add(chineseNoodles);

        } else if (data.equals("Biryani")) {
           // catName.setText("Biryani");

            Subcategory vegKhazana = new Subcategory(R.drawable.noodles_image, "Veg Khazana", "Biryani1");
            categoryList.add(vegKhazana);

            Subcategory nonVegBiryani = new Subcategory(R.drawable.noodles_image, "Non-veg Biryani", "Biryani2");
            categoryList.add(nonVegBiryani);

        } else if (data.equals("Sea Food")){
           // catName.setText("Sea Food");

            Subcategory seaFoodStarter = new Subcategory(R.drawable.noodles_image, "Sea Food Starter", "Sea1");
            categoryList.add(seaFoodStarter);

            Subcategory seaFoodMainCourse = new Subcategory(R.drawable.noodles_image, "Main Course", "Sea2");
            categoryList.add(seaFoodMainCourse);

        } else if (data.equals("Pizza")) {
           // catName.setText("Pizza");
            Subcategory vegPizza = new Subcategory(R.drawable.noodles_image, "Veg Pizza", "Pizza1");
            categoryList.add(vegPizza);

            Subcategory nonVegPizza = new Subcategory(R.drawable.noodles_image, "Non-Veg Pizza", "Pizza2");
            categoryList.add(nonVegPizza);

            Subcategory pizzaMania = new Subcategory(R.drawable.noodles_image, "Pizza Mania", "Pizza3");
            categoryList.add(pizzaMania);

            Subcategory beverages = new Subcategory(R.drawable.noodles_image, "Beverages", "Pizza4");
            categoryList.add(beverages);

        } else if (data.equals("Soup")){
            //catName.setText("Soup");
            Subcategory vegSoup = new Subcategory(R.drawable.noodles_image, "Veg Soup", "Soup1");
            categoryList.add(vegSoup);

            Subcategory nonVegSoup = new Subcategory(R.drawable.noodles_image, "Non-Veg Soup", "Soup2");
            categoryList.add(nonVegSoup);

        } else if (data.equals("Street Food")) {
          // catName.setText("Street Food");

            Subcategory maharashtrian = new Subcategory(R.drawable.noodles_image, "Mahrashtrian", "Street1");
            categoryList.add(maharashtrian);

            Subcategory chaatSpl = new Subcategory(R.drawable.noodles_image, "Chaat Special", "Street2");
            categoryList.add(chaatSpl);

            Subcategory southIndian = new Subcategory(R.drawable.noodles_image, "South Indian", "Street3");
            categoryList.add(southIndian);

            Subcategory specialStreetFood = new Subcategory(R.drawable.noodles_image, "Special", "Street4");
            categoryList.add(specialStreetFood);
        } else if (data.equals("Sweet Food")){
         //  catName.setText("Sweet Food");
            Subcategory northIndian = new Subcategory(R.drawable.noodles_image, "North Indian Sweets", "Sweet1");
            categoryList.add(northIndian);
            Subcategory southIndian = new Subcategory(R.drawable.noodles_image, "South Indian Sweets", "Sweet2");
            categoryList.add(southIndian);
            Subcategory westIndian = new Subcategory(R.drawable.noodles_image, "West Indian Sweets", "Sweet3");
            categoryList.add(westIndian);
            Subcategory eastIndian = new Subcategory(R.drawable.noodles_image, "East Indian Sweets", "Sweet4");
            categoryList.add(eastIndian);

        }else if (data.equals("Fast Food")) {
          // catName.setText("Fast Food");

            Subcategory burger = new Subcategory(R.drawable.noodles_image, "Burger", "Fast1");
            categoryList.add(burger);
            Subcategory sandwich = new Subcategory(R.drawable.noodles_image, "Sandwich", "Fast2");
            categoryList.add(sandwich);
            Subcategory milkshake = new Subcategory(R.drawable.noodles_image, "Milkshakes", "Fast3");
            categoryList.add(milkshake);
            Subcategory other = new Subcategory(R.drawable.noodles_image, "Other", "Fast4");
            categoryList.add(other);
        }else if (data.equals("Cake")) {
          // catName.setText("Cake");


            Subcategory chocolate = new Subcategory(R.drawable.noodles_image, "Chocolate", "IceCream1");
            categoryList.add(chocolate);
            Subcategory strawberry = new Subcategory(R.drawable.noodles_image, "Strawberry", "IceCream2");
            categoryList.add(strawberry);
            Subcategory mixFruit = new Subcategory(R.drawable.noodles_image, "Mix Fruit", "IceCream3");
            categoryList.add(mixFruit);
            Subcategory kulfi = new Subcategory(R.drawable.noodles_image, "Kulfi", "IceCream4");
            categoryList.add(kulfi);
        }
    }

    @Override
    public void onCategoryClick(Subcategory subcategory, int position) {
        subCatName.setText(subcategory.getCategoryName());
        catImage.setImageResource(subcategory.getCategoryImage());
        String str = subcategory.getCategoryName();
        SharedPreferenceHelper.writeIntegerPreference(getContext(), "prodImg", subcategory.getCategoryImage());
        SharedPreferenceHelper.writeStringPreference(getContext(), "prodName", subcategory.getCategoryName());
        Toast.makeText(getContext(), str + "   " + position, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getContext(), SubCategory.class);
        startActivity(intent);
    }
    public void setNameCategory(){
        String str = SharedPreferenceHelper.getStringPreference(getContext(), "Categories");
        if (str.equals("Home Style")){
            catName.setText(str);
        }else if (str.equals("Soup")) {
            catName.setText(str);
        }else if (str.equals("Chinese")) {
            catName.setText(str);
        }else if (str.equals("Biryani")) {
            catName.setText(str);
        }else if (str.equals("Sea Food")) {
            catName.setText(str);
        }else if (str.equals("Fast Food")) {
            catName.setText(str);
        }else if (str.equals("Street Food")) {
            catName.setText(str);
        }else if (str.equals("Sweet Food")) {
            catName.setText(str);
        }else if (str.equals("Ice Cream")) {
            catName.setText(str);
        }else if (str.equals("cake")) {
            catName.setText(str);
        }
    }
}
