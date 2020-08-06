package com.example.jules_docx_werkstuk_versie2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class firstFragment extends Fragment {

    public firstFragment() {
        // Required empty public constructor
    }

    ImageView imageView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_first, container, false);
        imageView = (ImageView) view.findViewById(R.id.testImage);
        Picasso.get().load("https://i1.sndcdn.com/artworks-000557708352-yhl2hm-t500x500.jpg").into(imageView);
        // Inflate the layout for this fragment
        return view;

    }

}
