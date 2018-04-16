package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> location = new ArrayList<Location>();
        location.add(new Location (R.string.h1n, R.string.h1d, R.string.h1s, R.drawable.effiel_tower));
        location.add(new Location (R.string.h2n, R.string.h2d, R.string.h2s,R.drawable.cruise));
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
