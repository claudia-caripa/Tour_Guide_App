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

        info.add(new Information("Wild Rover Tours", "33 Bachelor's Walk", "wwwwildrovertours.com"));
        info.add(new Information("Howth Guided Tours", "8 Finlater Pub", "www.howthguidedtours.com"));
        info.add(new Information("Public Art Walking Tours", "St. Stephen's Green", "www.publicartwalkingtours.ie"));
        info.add(new Information("Viking Splash Tours", "St Stephen's Green North", "www.VikingSplash.com"));
        info.add(new Information("The Kids Ghost Tour - DoDublin", "O'Connell Street", "www.dodublin.ie"));

        //Modify the code to create an ArrayAdapter so we can recycle the TextViews and save Memory
        //Remember modify the word_list XML to create a single ListView
        InformationAdapter adapter = new InformationAdapter(getActivity(), info, R.color.category_tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
