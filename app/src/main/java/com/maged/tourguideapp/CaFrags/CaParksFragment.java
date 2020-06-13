package com.maged.tourguideapp.CaFrags;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.maged.tourguideapp.LocationModel.Location;
import com.maged.tourguideapp.Adaptors.LocationAdapter;
import com.maged.tourguideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CaParksFragment extends Fragment {


    public CaParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.ca_park_name_1), getString(R.string.ca_park_description_1), getString(R.string.ca_park_web_1), getString(R.string.ca_park_address_1), getString(R.string.ca_park_phone_1), getString(R.string.ca_park_opening_hours_1), R.drawable.img_yosemite_national_park));
        locations.add(new Location(getString(R.string.ca_park_name_2), getString(R.string.ca_park_description_2), getString(R.string.ca_park_web_2), getString(R.string.ca_park_address_2), getString(R.string.ca_park_phone_2), getString(R.string.ca_park_opening_hours_2), R.drawable.img_san_diego_zoo_safari_park));
        locations.add(new Location(getString(R.string.ca_park_name_3), getString(R.string.ca_park_description_3), getString(R.string.ca_park_web_3), getString(R.string.ca_park_address_3), getString(R.string.ca_park_phone_3), getString(R.string.ca_park_opening_hours_3), R.drawable.img_balboa_park));
        locations.add(new Location(getString(R.string.ca_park_name_4), getString(R.string.ca_park_description_4), getString(R.string.ca_park_web_4), getString(R.string.ca_park_address_4),getString(R.string.ca_park_phone_4), getString(R.string.ca_park_opening_hours_4), R.drawable.img_japanese_tea_garden));
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
