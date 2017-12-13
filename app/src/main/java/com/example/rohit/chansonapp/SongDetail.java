package com.example.rohit.chansonapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class SongDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);

        TextView songName = (TextView) findViewById(R.id.songName);
        TextView ArtistName = (TextView) findViewById(R.id.artistName);
        ImageView imageAddress = (ImageView) findViewById(R.id.image);


        songName.setText( getIntent().getStringExtra("Song_Name"));
        ArtistName.setText( getIntent().getStringExtra("Artist_Name"));
        imageAddress.setImageResource( getIntent().getIntExtra("Image_Number",0));


        Button button = (Button) findViewById(R.id.backButton );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SongDetail.this , SongActivity2.class );
                startActivity(intent);
            }
        });

    }
}
