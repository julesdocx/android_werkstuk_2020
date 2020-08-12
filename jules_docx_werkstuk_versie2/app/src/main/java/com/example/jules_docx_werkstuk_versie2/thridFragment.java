package com.example.jules_docx_werkstuk_versie2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class thridFragment extends Fragment {

    public thridFragment() {
        // Required empty public constructor
    }

    public static MyAppDataBase myAppDataBase;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_thrid, container, false);
    }
}
