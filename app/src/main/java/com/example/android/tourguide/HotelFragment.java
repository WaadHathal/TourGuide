package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> location = new ArrayList<Location>();
        location.add(new Location(R.string.honame1, R.string.hodes1, R.string.hos1, R.drawable.relaischristine));
        location.add(new Location(R.string.ho2na, R.string.ho2des, R.string.ho2s,
                R.drawable.saintjamesparis));
        LocationAdapter adapter = new LocationAdapter(getActivity(), location);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Location loc = location.get(position);
            }
        });

        return rootView;
    }

}