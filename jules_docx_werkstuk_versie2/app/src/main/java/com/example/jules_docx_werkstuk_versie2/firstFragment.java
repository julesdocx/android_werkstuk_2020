package com.example.jules_docx_werkstuk_versie2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
    ListView listView;
    String titles[] = {"Celebrity Rehab", "Dance of the Young", "Personel Horizon"};
    String artists[] = {"Katie Vick", "Otro", "Iku"};
    String imgUrls[] = {};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_first, container, false);
        imageView = (ImageView) view.findViewById(R.id.testImage);
        Picasso.get().load("https://i1.sndcdn.com/artworks-000557708352-yhl2hm-t500x500.jpg").into(imageView);
        // Inflate the layout for this fragment

        listView = view.findViewById(R.id.artworkList);

        return view;

    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String title[];
        String artist[];
        String imgUrl[];

        MyAdapter (Context c, String nTitle[], String nArtist[], String nImgUrl[]) {
            super(c,R.layout.row_artwork, R.id.textViewTitle, nTitle );
            this.context = c;
            this.title = nTitle;
            this.artist = nArtist;
            this.imgUrl = nImgUrl;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater =  (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row_artwork, parent, false);
            ImageView images = row.findViewById(R.id.rowImage);
            TextView Title = row.findViewById(R.id.textViewTitle);
            TextView Artist = row.findViewById(R.id.textViewArtist);

            Title.setText(this.title[position]);
            Artist.setText(this.artist[position]);
            
            return row;
        }
    }
}
