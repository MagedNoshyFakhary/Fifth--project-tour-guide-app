package com.maged.tourguideapp.Adaptors;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.maged.tourguideapp.CaFrags.CaCulturalFragment;
import com.maged.tourguideapp.CaFrags.CaRestaurantsFragment;
import com.maged.tourguideapp.CaFrags.CaParksFragment;
import com.maged.tourguideapp.CaFrags.CaShoppingFragment;
/*adapter for ca tab fragments*/
public class CaPagerAdapter extends FragmentPagerAdapter {
    //int to know Number of tabs
    private int tabNumber;
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * @param fm
     * @param behavior
     * @param tabNumber
     */
    public CaPagerAdapter(@NonNull FragmentManager fm, int behavior, int tabNumber) {
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
                return new CaCulturalFragment();
            case 1:
                return  new CaShoppingFragment();
            case 2:
                return  new CaParksFragment();
            case 3:
                return  new CaRestaurantsFragment();
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