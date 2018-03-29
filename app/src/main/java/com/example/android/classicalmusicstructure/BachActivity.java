package com.example.android.classicalmusicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Organ Sonata No. 3 in D Minor - BWV527", "Leipizig 1720",
                "Organ trio"));
        songs.add(new Songs("Toccata and Fugue in D Minor - BWV 565", "Between 1740 - 1750",
                "Organ"));
        songs.add(new Songs("Italian Concerto in F Major - BWV 971", "1735",
                "Harpsichord Solo"));
        songs.add(new Songs("Violin Sonata No. 1 in G Minor BWV 1001", "1720",
                "Violin Solo"));
        songs.add(new Songs("Concerto for Violin and Orchestra No.1 in A Minor BWV 1041","Leipzig",
                "Violin and Orchestra"));
        songs.add(new Songs("Suite for Cello No.3 in C Major - BWV 1009", "Between 1717 - 1723",
                "Cello"));
        songs.add(new Songs("Orchestral Suite No. 3 - BWV 1068", "1730",
                "Orchestra"));

        SongsAdapter adapter = new SongsAdapter(this, songs, R.color.songColor);

        ListView listView = (ListView) findViewById(R.id.song_list);

        listView.setAdapter(adapter);
    }
}