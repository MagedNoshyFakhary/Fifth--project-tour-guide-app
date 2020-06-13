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
public class NycShoppingFragment extends Fragment {

    public NycShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.nyc_mall_name_1), getString(R.string.nyc_mall_description_1), getString(R.string.nyc_mall_web_1), getString(R.string.nyc_mall_address_1), getString(R.string.nyc_mall_phone_1), getString(R.string.nyc_mall_opening_hours_1), R.drawable.img_columbus_circle));
        locations.add(new Location(getString(R.string.nyc_mall_name_2), getString(R.string.nyc_mall_description_2), getString(R.string.nyc_mall_web_2), getString(R.string.nyc_mall_address_2), getString(R.string.nyc_mall_phone_2), getString(R.string.nyc_mall_opening_hours_2), R.drawable.img_manhattan_mall_nyc));
        locations.add(new Location(getString(R.string.nyc_mall_name_3), getString(R.string.nyc_mall_description_3), getString(R.string.nyc_mall_web_3), getString(R.string.nyc_mall_address_3), getString(R.string.nyc_mall_phone_3), getString(R.string.nyc_mall_opening_hours_3), R.drawable.img_queens_center));
        locations.add(new Location(getString(R.string.nyc_mall_name_4), getString(R.string.nyc_mall_description_4), getString(R.string.nyc_mall_web_4), getString(R.string.nyc_mall_address_4), getString(R.string.nyc_mall_phone_4), getString(R.string.nyc_mall_opening_hours_4), R.drawable.img_staten_island_mall));
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

