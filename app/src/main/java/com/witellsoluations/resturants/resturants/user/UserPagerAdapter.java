package com.witellsoluations.resturants.resturants.user;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.witellsoluations.resturants.resturants.user.tabs.Tab1;
import com.witellsoluations.resturants.resturants.user.tabs.Tab2;
import com.witellsoluations.resturants.resturants.user.tabs.Tab3;

/**
 * Created by aruna on 2/18/18.
 */

public class UserPagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public UserPagerAdapter(FragmentManager fragmentManager, int numberOfTabs) {
        super(fragmentManager);

        this.mNoOfTabs = numberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1 :
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2 :
                Tab3 tab3 = new Tab3();
                return tab3;
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
