package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CafeFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> location = new ArrayList<Location>();
        location.add(new Location(R.string.cafen1, R.string.cafe1d, R.string.cafe1s, R.drawable.leselect));
        location.add(new Location(R.string.cafe2n, R.string.cafe2d, R.string.cafe2s, R.drawable.lesdeuxmagots));
        location.add(new Location(R.string.cafe3n, R.string.cafe3d, R.string.cafe3s, R.drawable.cafedeflore));

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