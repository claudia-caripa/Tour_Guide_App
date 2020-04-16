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

        info.add(new Information("Butlers Chocolate Café", "24 Wicklow Street", "www.butlerschocolates.com", R.drawable.ic_local_cafe));
        info.add(new Information("Teddy’s Promenade Cafe", "1-2 Windsor Terrace,", "www.promenadecafe.ie", R.drawable.ic_local_cafe));
        info.add(new Information("Chapter One Restaurant", "18-19 Parnell Square", "www.chapteronerestaurant.com", R.drawable.ic_local_dining));
        info.add(new Information("Oliveto at Haddington House", "9 - 12 Haddington Terrace", "www.haddingtonhouse.ie", R.drawable.ic_local_dining));
        info.add(new Information("Fitzsimons Temple Bar", "21-22 Wellington Quay", "www.fitzsimonshotel.com", R.drawable.ic_local_bar));
        info.add(new Information("O'Neill's", "2 Suffolk Street", "www.oneillsbar.com", R.drawable.ic_local_bar));

        //Modify the code to create an ArrayAdapter so we can recycle the TextViews and save Memory
        //Remember modify the word_list XML to create a single ListView
        InformationAdapter adapter = new InformationAdapter(getActivity(), info, R.color.category_eat_and_drink);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
