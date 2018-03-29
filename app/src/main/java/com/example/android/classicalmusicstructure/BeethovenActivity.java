package com.example.android.classicalmusicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BeethovenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Symphony No. 6 in F Major also known as Pastoral Symphony", "Between 1802 - 1808",
                "Orchestra"));
        songs.add(new Songs("Piano Concerto No. 3 in C Minor", "1800",
                "Piano Soloist and Orchestra"));
        songs.add(new Songs("Choral Fantasy", "1808", "Piano, Volcal Soloist, Chorus, Orchestra"));
        songs.add(new Songs("Trio for Piano, Flute and Bassoon", "1888",
                "Piano, Flute, Bassoons"));
        songs.add(new Songs("Piano Sonata No. 14 in C♯ Minor also known as Moonlight Sonata", "1801",
                "Piano Solo"));
        songs.add(new Songs("Piano Sonata No. 17 in D Minor also known as The Tempest", "Between 1801- 1802",
                "Piano Solo"));
        songs.add(new Songs("Bagatelle No. 25 in A Minor also known as Für Elise",
                "published 1867 after composer's death","Piano Solo"));

        SongsAdapter adapter = new SongsAdapter(this, songs, R.color.songColor);

        ListView listView = (ListView) findViewById(R.id.song_list);

        listView.setAdapter(adapter);
    }
}
