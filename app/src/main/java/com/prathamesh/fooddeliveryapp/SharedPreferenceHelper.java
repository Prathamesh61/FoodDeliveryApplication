package com.prathamesh.fooddeliveryapp;

import android.content.Context;
import android.content.SharedPreferences;

import com.prathamesh.fooddeliveryapp.Fragments.CategoryFragment;

public class SharedPreferenceHelper {

    public static final String KEY = "orderDB";

    public static SharedPreferences getSharedPreference(Context context) {
        return context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
    }

    public static void writeStringPreference(Context context, String key, String value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getStringPreference(Context context, String key) {
        return getSharedPreference(context).getString(key, null);
    }

    public static void writeIntegerPreference(Context context, String key, int value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getIntegerPreference(Context context, String key) {
        return getSharedPreference(context).getInt(key, 0);
    }
}
