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
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.information_list, container, false);
        //Create a list of String
        final ArrayList<Information> info = new ArrayList<Information>();

        info.add(new Information("National Museum Of Ireland", "Merrion Street", "www.museum.ie"));
        info.add(new Information("Museum of Literature Ireland", "85/86 St. Stephens Green", "www.moli.ie"));
        info.add(new Information("National Maritime Museum Of Ireland", "Dun Laoghaire", "www.mariner.ie"));
        info.add(new Information("Geological Museum", "Trinity College", "www.tcd.ie"));
        info.add(new Information("Fitzsimons Temple Bar", "21-22 Wellington Quay", "www.fitzsimonshotel.com"));
        info.add(new Information("The National Leprechaun Museum", "1 Jervis Street", "www.leprechaunmuseum.ie"));

        //Modify the code to create an ArrayAdapter so we can recycle the TextViews and save Memory
        //Remember modify the word_list XML to create a single ListView
        InformationAdapter adapter = new InformationAdapter(getActivity(), info, R.color.category_museums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
