package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> location = new ArrayList<Location>();
        location.add(new Location (R.string.R1n, R.string.R1d,R.string.R1s, R.drawable.saidoune));
        location.add(new Location (R.string.R2n, R.string.R2d, R.string.R2s, R.drawable.maisonblanche));
        location.add(new Location (R.string.R3n,R.string.R2d, R.string.R2s,R.drawable.creperieframboise));
        LocationAdapter adapter = new LocationAdapter(getActivity(), location);
        ListView listView = (ListView) rootView.findViewById (R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Location loc = location.get(position);
            }
        });

        return rootView; }

}
