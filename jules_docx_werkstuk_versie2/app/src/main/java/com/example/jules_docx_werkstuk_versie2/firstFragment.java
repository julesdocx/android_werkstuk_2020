package com.example.jules_docx_werkstuk_versie2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
    String imgUrls[] = {"https://firebasestorage.googleapis.com/v0/b/jules-docx-androidstudio.appspot.com/o/102630150_558610248183627_8227748301609830273_n.jpg?alt=media&token=7f92cb7e-1fd0-4207-b37b-cc1f88695e98",
                        "https://firebasestorage.googleapis.com/v0/b/jules-docx-androidstudio.appspot.com/o/106011458_263253914936711_756682807127883080_n.png?alt=media&token=5dd2483a-245f-4c5e-8e0f-97fea09fef0f",
                        "https://firebasestorage.googleapis.com/v0/b/jules-docx-androidstudio.appspot.com/o/56764472_579673252530597_7096499730749849600_n.png?alt=media&token=587aef03-83fe-4ef1-ac51-7d3728768d5d"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_first, container, false);
        //imageView = (ImageView) view.findViewById(R.id.testImage);
        // Inflate the layout for this fragment

        listView = view.findViewById(R.id.artworkList);
        MyAdapter adapter = new MyAdapter(this.getContext(), titles, artists, imgUrls);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
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


            Picasso.get().load(imgUrl[position]).into(images);
            Title.setText(this.title[position]);
            Artist.setText(this.artist[position]);

            return row;
        }
    }
}
