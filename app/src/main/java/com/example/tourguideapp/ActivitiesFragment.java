package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ActivitiesFragment extends Fragment {

    public ActivitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.information_list, container, false);
        //Create a list of String
        final ArrayList<Information> info = new ArrayList<Information>();

        info.add(new Information(getResources().getString(R.string.kayaking_name), getResources().getString(R.string.kayaking_address), getResources().getString(R.string.kayaking_web), R.drawable.ic_rowing));
        info.add(new Information(getResources().getString(R.string.kayaking_city_name), getResources().getString(R.string.kayaking_city_address), getResources().getString(R.string.kayaking_city_web), R.drawable.ic_rowing));
        info.add(new Information(getResources().getString(R.string.cycling_center_name), getResources().getString(R.string.cycling_center_address), getResources().getString(R.string.cycling_center_web), R.drawable.ic_directions_bike));
        info.add(new Information(getResources().getString(R.string.black_linn_name), getResources().getString(R.string.black_linn_address),  getResources().getString(R.string.black_linn_web), R.drawable.ic_directions_walk));
        info.add(new Information(getResources().getString(R.string.grand_canal_name), getResources().getString(R.string.grand_canal_address), getResources().getString(R.string.grand_canal_web), R.drawable.ic_directions_walk));

        //Modify the code to create an ArrayAdapter so we can recycle the TextViews and save Memory
        //Remember modify the word_list XML to create a single ListView
        InformationAdapter adapter = new InformationAdapter(getActivity(), info, R.color.category_activities);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
