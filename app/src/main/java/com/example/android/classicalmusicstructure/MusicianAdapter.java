package com.example.android.classicalmusicstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This class extends the Musician custom class. To display the list of musicians in the main screen.
 */
public class MusicianAdapter extends ArrayAdapter <Musician> {

    private int mColorResourceId;

    public MusicianAdapter(Context context, ArrayList<Musician> musicians, int ColorResourceId){
        super(context, 0,musicians);
        mColorResourceId = ColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.musician_activity, parent, false);
        }

        Musician currentName = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentName.getMusicianName());

        ImageView imageView = listItemView.findViewById(R.id.musician);
        imageView.setImageResource(currentName.getImageResourceId());

        View container = listItemView.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        container.setBackgroundColor(color);

        return listItemView;
    }
}