package com.witellsoluations.resturants.resturants.waiter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.witellsoluations.resturants.resturants.user.tabs.Tab1;
import com.witellsoluations.resturants.resturants.user.tabs.Tab2;
import com.witellsoluations.resturants.resturants.user.tabs.Tab3;
import com.witellsoluations.resturants.resturants.waiter.tabs.OrderTab;

/**
 * Created by aruna on 2/18/18.
 */

public class WaiterPagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public WaiterPagerAdapter(FragmentManager fragmentManager, int numberOfTabs) {
        super(fragmentManager);

        this.mNoOfTabs = numberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                OrderTab tab1 = new OrderTab();
                return tab1;
            case 1 :
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
