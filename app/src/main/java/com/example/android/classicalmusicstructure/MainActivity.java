package com.example.android.classicalmusicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musician_list);

       final ArrayList<Musician> musicians = new ArrayList<>();

        musicians.add(new Musician(getString(R.string.mozart), R.drawable.mozart));
        musicians.add(new Musician(getString(R.string.bach), R.drawable.bach));
        musicians.add(new Musician(getString(R.string.stravinsky), R.drawable.stravinsky));
        musicians.add(new Musician(getString(R.string.beethoven), R.drawable.beethoven));

        MusicianAdapter adapter = new MusicianAdapter(this, musicians, R.color.musicianColor);
        ListView listView = (ListView) findViewById(R.id.Musician_List);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l){
                if (pos ==0){
                Intent mozartIntent = new Intent(MainActivity.this, MozartActivity.class);
                startActivity(mozartIntent);
            }
            else if (pos == 1){
                    Intent bachIntent = new Intent(MainActivity.this, BachActivity.class);
                    startActivity(bachIntent);
                }
                else if (pos == 2){
                Intent stravinskyIntent = new Intent(MainActivity.this, StravinskyActivity.class);
                startActivity(stravinskyIntent);
                }
                else if (pos == 3){
                    Intent beethovenIntent = new Intent(MainActivity.this, BeethovenActivity.class);
                    startActivity(beethovenIntent);
                }
            }
        });
    }
}
