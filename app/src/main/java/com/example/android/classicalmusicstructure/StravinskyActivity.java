package com.example.android.classicalmusicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StravinskyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Petrushka (Ballet)", "Paris 1911",
                "Orchestra"));
        songs.add(new Songs("The Rite of Spring (Ballet)", "Paris 1913",
                "Orchestra"));
        songs.add(new Songs("Symphony in E-flat Op 1", "Between 1905 - 1907",
                "Orchestra"));
        songs.add(new Songs("Suite from Pulcinella", "1920", "Orchestra"));
        songs.add(new Songs("Capriccio for Piano and Orchestra", "Between 1926 - 1929",
                "Piano Solo and Orchestra"));
        songs.add(new Songs("Symphonies of Wind Instruments", "1920",
                "Woodwind and Brass"));
        songs.add(new Songs("Serenade in A", "1925", "Piano Solo"));

        SongsAdapter adapter = new SongsAdapter(this, songs, R.color.songColor);

        ListView listView = (ListView) findViewById(R.id.song_list);

        listView.setAdapter(adapter);
    }
}