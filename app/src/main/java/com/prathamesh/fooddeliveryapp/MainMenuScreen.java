package com.prathamesh.fooddeliveryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.prathamesh.fooddeliveryapp.Fragments.CategoryFragment;
import com.prathamesh.fooddeliveryapp.Fragments.HomeFragment;
import com.prathamesh.fooddeliveryapp.Fragments.MyOrdersFragment;
import com.prathamesh.fooddeliveryapp.Fragments.ProfileFragment;

public class MainMenuScreen extends AppCompatActivity {
    protected ImageView logo , favourites ,cart ;
    protected BottomNavigationView bottomNavigationView;
    protected RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_screen);
        initView();

    }
    private void initView() {
        logo=findViewById(R.id.logo);
        favourites=findViewById(R.id.ivViewFavourites);
        cart=findViewById(R.id.ivViewCart);
        bottomNavigationView=findViewById(R.id.bottom_Navigation);
        relativeLayout=findViewById(R.id.MainScreenContainer);
        getSupportFragmentManager().beginTransaction().replace(R.id.MainScreenContainer,new HomeFragment()).commit();
        bottomNavigationView.setSelectedItemId(R.id.nav_Home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment =null;
                switch (item.getItemId()){
                    case R.id.nav_Categories:
                        fragment =new CategoryFragment();
                        break;
                    case R.id.nav_Orders:
                        fragment =new MyOrdersFragment();
                        break;
                    case R.id.nav_profile:
                        fragment =new ProfileFragment();
                        break;
                    case R.id.nav_Home:
                    default:
                        fragment =new HomeFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.MainScreenContainer,fragment).commit();
                return true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.nav_Home);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenuScreen.this,Cart.class);
                startActivity(intent);
            }
        });
        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenuScreen.this,Cart.class);
                startActivity(intent);
            }
        });
    }

}