package com.witellsoluations.resturants.resturants.waiter.tabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.witellsoluations.resturants.resturants.R;

/**
 * Created by aruna on 12/30/17.
 */

public class WaiterOrderAdapter extends BaseAdapter{

    private Context context;

    public WaiterOrderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder = new ViewHolder(view);

        ImageView imageView;
        if (view == null) {

            view = LayoutInflater.from(context).inflate(R.layout.waiter_order_view, viewGroup, false);
            // if it's not recycled, initialize some attributes

            holder.tv_product_name = (TextView)view.findViewById(R.id.tv_product_name);
            holder.iv_food = (ImageView) view.findViewById(R.id.iv_food);
            holder.tv_description = (TextView) view.findViewById(R.id.tv_description);



            holder.tv_product_name.setText("Pitza");
            holder.iv_food.setImageResource(mThumbIds[i]);
            holder.tv_description.setText("Status : " + "Process");

        } else {
           // imageView = (ImageView) view;
        }

       // imageView.setImageResource(mThumbIds[i]);
        return view;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.pizza,
            R.drawable.tumblr, R.drawable.burger,
            R.drawable.spicy, R.drawable.alb,
            R.drawable.pizza, R.drawable.tumblr,
            R.drawable.burger, R.drawable.spicy,
            R.drawable.alb,

    };

    private class ViewHolder {
        TextView tv_product_name;
        ImageView iv_food;
        TextView tv_description;

        public ViewHolder(View view) {

        }
    }
}
