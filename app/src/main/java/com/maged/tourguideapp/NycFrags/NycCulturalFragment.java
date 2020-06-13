package com.maged.tourguideapp.NycFrags;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.maged.tourguideapp.LocationModel.Location;
import com.maged.tourguideapp.Adaptors.LocationAdapter;
import com.maged.tourguideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NycCulturalFragment extends Fragment {

    public NycCulturalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.nyc_place_name_1), getString(R.string.nyc_place_description_1), R.drawable.img_statue_of_liberty));
        locations.add(new Location(getString(R.string.nyc_place_name_2), getString(R.string.nyc_place_description_2), R.drawable.img_metropolitan_museum_of_art));
        locations.add(new Location(getString(R.string.nyc_place_name_3), getString(R.string.nyc_place_description_3), R.drawable.img_memorial));
        locations.add(new Location(getString(R.string.nyc_place_name_4), getString(R.string.nyc_place_description_4), R.drawable.img_the_museum_of_modern_art));
        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
