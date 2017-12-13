package com.example.rohit.chansonapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Assigning the Custom Fonts from Assets/Fonts Directory
        TextView textView = (TextView) findViewById( R.id.title );
        Typeface custom_font = Typeface.createFromAsset( getAssets(),"fonts/IndieFlower.ttf");
        textView.setTypeface(custom_font);

        //Making a Toast Message to Let User Know Its been Proceeded towards Music Library

        Toast.makeText( this , "Loading the Music Library" , Toast.LENGTH_LONG).show();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(MainActivity.this, SongActivity2.class);
                startActivity(mainIntent);
            }
        }, 2000);


    }
}
