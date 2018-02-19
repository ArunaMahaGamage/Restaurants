package com.witellsoluations.resturants.resturants.chef;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.witellsoluations.resturants.resturants.R;
import com.witellsoluations.resturants.resturants.user.tabs.ProductsAdapter;

public class Chef extends AppCompatActivity {

    TextView tv_title;
    RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef);

        initUI();
    }

    void initUI() {
        tv_title = (TextView) findViewById(R.id.tv_title);
        gridview = (GridView) findViewById(R.id.gridview);

        setGridview();
    }

    void setGridview() {
        gridview.setAdapter(new ChefAdapter(getApplicationContext()));

        gridview.setNumColumns(1);
        gridview.setColumnWidth(1);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Position " + position,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
