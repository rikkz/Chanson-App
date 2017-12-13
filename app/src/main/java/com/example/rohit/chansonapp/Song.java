package com.example.rohit.chansonapp;

import android.graphics.drawable.Drawable;

/**
 * Created by Rohit on 13-12-2017.
 */

public class Song {

    private String mSongName;
    private String mArtistName;
    private int mImageAdress;

    public Song( String SongName , String ArtistName , int ImageAdress ) {
        mSongName = SongName;
        mArtistName = ArtistName;
        mImageAdress = ImageAdress;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getImageAddress() {
        return mImageAdress;
    }

}
