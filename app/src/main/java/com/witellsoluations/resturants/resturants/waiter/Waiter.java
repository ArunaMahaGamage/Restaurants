package com.witellsoluations.resturants.resturants.waiter;

import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import com.witellsoluations.resturants.resturants.R;
import com.witellsoluations.resturants.resturants.user.tabs.Tab1;

import com.witellsoluations.resturants.resturants.user.tabs.Tab3;
import com.witellsoluations.resturants.resturants.waiter.tabs.OrderTab;

public class Waiter extends AppCompatActivity implements Tab1.OnFragmentInteractionListener, OrderTab.OnFragmentInteractionListener, Tab3.OnFragmentInteractionListener{

    TabLayout tabLayout;
    ViewPager viewPager;
    TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiter);

        initUI();
    }

    void initUI() {
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tv_title = (TextView) findViewById(R.id.tv_title);
        /*mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        gridview = (GridView) findViewById(R.id.gridview);*/
//        recyclerView();

        tabLayout();
        title();

    }

    void tabLayout() {
        tabLayout.addTab(tabLayout.newTab().setText("Orders"));
//        tabLayout.addTab(tabLayout.newTab().setText("Re-Order"));
        tabLayout.addTab(tabLayout.newTab().setText("Invoice"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        viewPager();
    }

    void viewPager() {
        viewPager = (ViewPager) findViewById(R.id.pager);
        WaiterPagerAdapter userPagerAdapter = new WaiterPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(userPagerAdapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    void title() {
        tv_title.setText("Food Order System");
        tv_title.setTextSize(20);
        tv_title.setTextColor(Color.BLUE);
        tv_title.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
    }

    void recyclerView() {
        /*mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        String[] myDataset = {"A","B","C","D","E","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);


        gridview.setNumColumns(3);
        gridview.setColumnWidth(1);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Position " + position,
                        Toast.LENGTH_LONG).show();
            }
        });*/
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
