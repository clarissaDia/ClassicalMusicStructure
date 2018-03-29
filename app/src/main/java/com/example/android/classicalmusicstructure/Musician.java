package com.example.android.classicalmusicstructure;
/**
 * This custom class is created to populate the list of composers in the main screen.
 */
public class Musician {
    private String mMusicianName;
    private int mImageResourceId;

    public Musician (String musicianName, int imageResourceId) {

        mMusicianName = musicianName;
        mImageResourceId = imageResourceId;
    }
    public String getMusicianName (){
        return mMusicianName;
    }

    public int getImageResourceId () {
        return mImageResourceId;
    }
}