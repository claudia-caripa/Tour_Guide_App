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
public class EatAndDrinkFragment extends Fragment {

    public EatAndDrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.information_list, container, false);
        //Create a list of String
        final ArrayList<Information> info = new ArrayList<Information>();

        info.add(new Information(getResources().getString(R.string.butlers_name), getResources().getString(R.string.butlers_address), getResources().getString(R.string.butlers_web), R.drawable.ic_local_cafe));
        info.add(new Information(getResources().getString(R.string.teddys_name), getResources().getString(R.string.teddys_address), getResources().getString(R.string.teddys_web), R.drawable.ic_local_cafe));
        info.add(new Information(getResources().getString(R.string.chapter_one_name), getResources().getString(R.string.chapter_one_address), getResources().getString(R.string.chapter_one_web), R.drawable.ic_local_dining));
        info.add(new Information(getResources().getString(R.string.oliveto_name), getResources().getString(R.string.oliveto_address), getResources().getString(R.string.oliveto_web), R.drawable.ic_local_dining));
        info.add(new Information(getResources().getString(R.string.fitz_name), getResources().getString(R.string.fitz_address), getResources().getString(R.string.fitz_web), R.drawable.ic_local_bar));
        info.add(new Information(getResources().getString(R.string.oneill_name), getResources().getString(R.string.oneill_address), getResources().getString(R.string.oneill_web), R.drawable.ic_local_bar));

        //Modify the code to create an ArrayAdapter so we can recycle the TextViews and save Memory
        //Remember modify the word_list XML to create a single ListView
        InformationAdapter adapter = new InformationAdapter(getActivity(), info, R.color.category_eat_and_drink);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
