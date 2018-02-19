package com.witellsoluations.resturants.resturants.user.tabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.witellsoluations.resturants.resturants.R;

/**
 * Created by aruna on 12/30/17.
 */

public class ProductsAdapter extends BaseAdapter{

    private Context context;

    public ProductsAdapter(Context context) {
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

            view = LayoutInflater.from(context).inflate(R.layout.product_view, viewGroup, false);
            // if it's not recycled, initialize some attributes

            holder.tv_product_name = (TextView)view.findViewById(R.id.tv_product_name);
            holder.iv_food = (ImageView) view.findViewById(R.id.iv_food);
            holder.tv_description = (TextView) view.findViewById(R.id.tv_description);
            holder.tv_s_price = (TextView)view.findViewById(R.id.tv_s_price);
            holder.tv_m_price = (TextView)view.findViewById(R.id.tv_m_price);
            holder.tv_l_price = (TextView)view.findViewById(R.id.tv_l_price);





            holder.tv_product_name.setText("Pitza");
            holder.iv_food.setImageResource(mThumbIds[0]);
            holder.tv_description.setText("Onian and Chese");
            holder.tv_s_price.setText("S:300");
            holder.tv_m_price.setText("M:600");
            holder.tv_l_price.setText("L:900");
            /*imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);*/
        } else {
           // imageView = (ImageView) view;
        }

       // imageView.setImageResource(mThumbIds[i]);
        return view;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.pizza,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };

    private class ViewHolder {
        TextView tv_product_name;
        ImageView iv_food;
        TextView tv_description;
        TextView tv_s_price;
        TextView tv_m_price;
        TextView tv_l_price;

        public ViewHolder(View view) {

        }
    }
}
