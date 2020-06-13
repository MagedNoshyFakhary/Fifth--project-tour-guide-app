package com.maged.tourguideapp.Adaptors;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.maged.tourguideapp.NycFrags.NycCulturalFragment;
import com.maged.tourguideapp.NycFrags.NycRestaurantsFragment;
import com.maged.tourguideapp.NycFrags.NycParksFragment;
import com.maged.tourguideapp.NycFrags.NycShoppingFragment;
/*adapter for nyc tab fragments*/
public class NycPagerAdapter extends FragmentPagerAdapter {
    //int to know Number of tabs
    private int tabNumber;
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * @param fm
     * @param behavior
     * @param tabNumber
     */
    public NycPagerAdapter(@NonNull FragmentManager fm, int behavior, int tabNumber) {
        super(fm, behavior);
        this.tabNumber=tabNumber;
    }
    /**
     *This method links the tab to its fragment.
     * @param position
     * @return
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new NycCulturalFragment();
            case 1:
                return  new NycShoppingFragment();
            case 2:
                return  new NycParksFragment();
            case 3:
                return  new NycRestaurantsFragment();
            default:return null;
        }
    }

    /**
     * This method Count the number of tab
     * @return
     */
    @Override
    public int getCount() {
        return tabNumber;
    }
}
