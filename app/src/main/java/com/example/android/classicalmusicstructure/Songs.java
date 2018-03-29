package com.example.android.classicalmusicstructure;
/**
 * This custom class is created to populate the list of songs for each composer.
 */
public class Songs {
    private String mSongTitle;
    private String mSongYear;
    private String mSongInstrument;

    public Songs (String songTitle, String songYear, String songInstrument){
        mSongTitle = songTitle;
        mSongYear = songYear;
        mSongInstrument = songInstrument;
    }

    public String getSongTitle (){
        return mSongTitle;
    }

    public String getSongYear (){
        return mSongYear;
    }

    public String getSongInstrument (){
        return mSongInstrument;
    }
}
