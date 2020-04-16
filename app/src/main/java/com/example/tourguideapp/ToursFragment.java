package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToursFragment extends Fragment {

    public ToursFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.information_list, container, false);
        //Create a list of String
        final ArrayList<Information> info = new ArrayList<Information>();

        info.add(new Information(getResources().getString(R.string.wild_rover_name), getResources().getString(R.string.wild_rover_address), getResources().getString(R.string.wild_rover_web)));
        info.add(new Information(getResources().getString(R.string.howth_name), getResources().getString(R.string.howth_address), getResources().getString(R.string.howth_web)));
        info.add(new Information(getResources().getString(R.string.art_name), getResources().getString(R.string.art_address), getResources().getString(R.string.art_web)));
        info.add(new Information(getResources().getString(R.string.viking_name), getResources().getString(R.string.viking_address), getResources().getString(R.string.viking_web)));
        info.add(new Information(getResources().getString(R.string.kids_ghost_name), getResources().getString(R.string.kids_ghost_address), getResources().getString(R.string.kids_ghost_web)));

        //Modify the code to create an ArrayAdapter so we can recycle the TextViews and save Memory
        //Remember modify the word_list XML to create a single ListView
        InformationAdapter adapter = new InformationAdapter(getActivity(), info, R.color.category_tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
