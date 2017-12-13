package com.example.rohit.chansonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity2 extends AppCompatActivity {


    ArrayList<Song> songs = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        songs.add( new Song("Ghoomar Song","Shreya Ghoshal, Swaroop Khan",R.drawable.image1));
        songs.add( new Song("Ban Ja Rani","Guru Randhawa",R.drawable.image2));
        songs.add( new Song("Pallo Latke","Jyotica Tangri,Yasser,Fazilpuria",R.drawable.image3));
        songs.add( new Song("Chalti Hai Kya 9 Se 12","Anu Malik",R.drawable.image4));
        songs.add( new Song("Ek Dil Ek Jaan","Shivam Pathak",R.drawable.image5));
        songs.add( new Song("Mehbooba","Neha Kakkar, Yasser Desai and Mohammed Rafi",R.drawable.image6));
        songs.add( new Song("Hawa Hawai 2.0","Kavita Krishnamurthy, Shashaa ",R.drawable.image7));
        songs.add( new Song("Dil Diyan Gallan","Atif Aslam",R.drawable.image8));
        songs.add( new Song("Oonchi Hai Building 2.0","Anu Malik",R.drawable.image9));
        songs.add( new Song("Main Kaun Hoon","Amit Trivedi, Kausar Munir, Meghna",R.drawable.image10));

        SongAdapter adapter = new SongAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.songList);
        listView.setAdapter( adapter );

        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SongActivity2.this , SongDetail.class);
                intent.putExtra("Song_Name" , songs.get(position).getSongName());
                intent.putExtra("Artist_Name" , songs.get(position).getArtistName());
                intent.putExtra("Image_Number" , songs.get(position).getImageAddress());
                startActivity( intent );
            }
        });

    }
}
