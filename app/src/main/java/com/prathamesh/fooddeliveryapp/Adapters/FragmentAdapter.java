package com.prathamesh.fooddeliveryapp.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.prathamesh.fooddeliveryapp.Fragments.SignIn;
import com.prathamesh.fooddeliveryapp.Fragments.SignUp;

public class FragmentAdapter extends FragmentStatePagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new SignUp();
            case 1 : return new SignIn();
        }
        return new SignUp();
    }
    @Override
    public int getCount() {
        return 10;
    }
   /* public CharSequence getPageTitle(int position) {
        String title =null;
        if (position==0){
            title="Sign In";
        }
        if (position==1){
            title="Sign Up";
        }
        return title;
        */

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
