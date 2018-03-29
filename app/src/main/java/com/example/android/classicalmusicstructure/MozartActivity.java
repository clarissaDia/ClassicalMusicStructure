package com.example.android.classicalmusicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MozartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList <Songs> songs = new ArrayList<>();
        songs.add(new Songs("Symphony No. 4 in D Major", "London 1765",
                "Oboes, Horns and Strings"));
        songs.add(new Songs("Symphony No. 7 in D Major", "Vienna 1768",
                "Strings, Oboes, Horns, Trumpets, Timpani, Bassoon Continuo"));
        songs.add(new Songs("Symphony No. 13 in F Major", "Milan 1771",
                "Strings, Oboes, Horns, Bassoon Continuo"));
        songs.add(new Songs("Piano Concerto No. 21 in C Major", "Vienna 1785",
                "Piano Solo and Orchestra" ));
        songs.add(new Songs("Flute Concerto No. 1", "Mannheim 1778",
                "Flute Solo and Orchestra"));
        songs.add(new Songs("Clarinet Concerto in A Major", "Vienna 1791",
                "Clarinet Solo and Orchestra"));
        songs.add(new Songs("Violin Concerto No. 5 in A Major", "Salzburg 1775",
                "Violin Solo and Orchestra"));

        SongsAdapter adapter = new SongsAdapter(this, songs, R.color.songColor);

        ListView listView = (ListView) findViewById(R.id.song_list);

        listView.setAdapter(adapter);
    }
}