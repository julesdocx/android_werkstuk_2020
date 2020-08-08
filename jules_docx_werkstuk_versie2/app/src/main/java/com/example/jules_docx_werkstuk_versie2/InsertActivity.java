package com.example.jules_docx_werkstuk_versie2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class InsertActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title;
    TextView artist;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        imageView = findViewById(R.id.rowImage);
        title = findViewById(R.id.textViewTitle);
        artist = findViewById(R.id.textViewArtist);

        if (position == 0) {
            Intent intent = getIntent();
            String img = intent.getStringExtra("image");
            String nTitle = intent.getStringExtra("title");
            String nArtist = intent.getStringExtra("artist");
            Picasso.get().load(img).into(imageView);
            title.setText(nTitle);
            artist.setText(nArtist);
            actionBar.setTitle(nTitle);
        }

        if (position == 1) {
            Intent intent = getIntent();
            String img = intent.getStringExtra("image");
            String nTitle = intent.getStringExtra("title");
            String nArtist = intent.getStringExtra("artist");
            Picasso.get().load(img).into(imageView);
            title.setText(nTitle);
            artist.setText(nArtist);
            actionBar.setTitle(nTitle);
        }

        if (position == 2) {
            Intent intent = getIntent();
            String img = intent.getStringExtra("image");
            String nTitle = intent.getStringExtra("title");
            String nArtist = intent.getStringExtra("artist");
            Picasso.get().load(img).into(imageView);
            title.setText(nTitle);
            artist.setText(nArtist);
            actionBar.setTitle(nTitle);
        }
    }
}