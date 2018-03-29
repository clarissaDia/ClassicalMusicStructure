package com.example.android.classicalmusicstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This class extends the Songs class to display the list of songs for each composer.
 */

public class SongsAdapter extends ArrayAdapter <Songs> {

    private int mColorResourceId;

    public SongsAdapter (Context context, ArrayList <Songs> songs, int ColorResourceId){
        super(context, 0,songs);
        mColorResourceId = ColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_activity, parent, false);
        }

        Songs currentSong = getItem(position);

        TextView songTextView = listItemView.findViewById(R.id.song_title);
        songTextView.setText(currentSong.getSongTitle());

        TextView yearTextView  = listItemView.findViewById(R.id.song_year);
        yearTextView.setText(currentSong.getSongYear());

        TextView instrumentTextView = listItemView.findViewById(R.id.instrument);
        instrumentTextView.setText(currentSong.getSongInstrument());

        View songContainer = listItemView.findViewById(R.id.song_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        songContainer.setBackgroundColor(color);

        return listItemView;
    }
}