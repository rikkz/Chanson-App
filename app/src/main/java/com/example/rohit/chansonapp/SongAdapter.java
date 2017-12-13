package com.example.rohit.chansonapp;

import android.app.Activity;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rohit on 13-12-2017.
 */

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context , ArrayList<Song> songs) {
        super(context,0,songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if( listItemView == null ) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Song song = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageHere);
        imageView.setImageResource(song.getImageAddress());

        TextView songName = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        songName.setText(song.getSongName());

        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        artistName.setText(song.getArtistName());


        return listItemView;
    }
}
