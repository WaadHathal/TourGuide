package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Activity context, ArrayList<Location> location) {
        super(context, 0, location);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentLocation.getLname());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.desc);
        descTextView.setText(currentLocation.getLdescription());

        TextView streetTextView = (TextView) listItemView.findViewById(R.id.street);
        streetTextView.setText(currentLocation.getLstreet());

        ImageView resID = (ImageView) listItemView.findViewById(R.id.image);
        resID.setImageResource(currentLocation.getImgid());

        return listItemView;


    }
}