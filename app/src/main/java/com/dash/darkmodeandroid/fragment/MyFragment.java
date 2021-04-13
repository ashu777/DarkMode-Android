package com.dash.darkmodeandroid.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import com.dash.darkmodeandroid.R;

import static android.content.Context.MODE_PRIVATE;


public class MyFragment extends Fragment {
    Switch switch_button1;
    SharedPreferences.Editor editor;

    public MyFragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);

        switch_button1 = view.findViewById(R.id.switch_button1);


        switch_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (switch_button1.isChecked()) {
                    ((AppCompatActivity)getActivity()).getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                } else {
                    ((AppCompatActivity)getActivity()).getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                }
            }
        });
        return view;
    }



}