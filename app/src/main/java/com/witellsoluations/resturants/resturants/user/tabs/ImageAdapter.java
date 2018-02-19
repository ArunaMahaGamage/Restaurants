package com.witellsoluations.resturants.resturants.user.tabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.witellsoluations.resturants.resturants.R;

/**
 * Created by aruna on 12/30/17.
 */

public class ImageAdapter extends BaseAdapter{

    private Context context;

    public ImageAdapter(Context context) {
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

    //    view = LayoutInflater.from(context).inflate(R.layout., viewGroup, false);
        ImageView imageView;
        if (view == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) view;
        }

        imageView.setImageResource(mThumbIds[i]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.pizza,
            R.drawable.pizza, R.drawable.pizza,
            R.drawable.pizza, R.drawable.pizza,
            R.drawable.pizza, R.drawable.pizza,
            R.drawable.pizza, R.drawable.pizza,
            R.drawable.pizza, R.drawable.pizza,
            R.drawable.pizza, R.drawable.pizza,
            R.drawable.pizza, R.drawable.pizza,
            R.drawable.pizza, R.drawable.pizza,
            R.drawable.pizza, R.drawable.pizza,
            R.drawable.pizza, R.drawable.pizza,
            R.drawable.sample_6, R.drawable.sample_7
    };

    /*private class ViewHolder {
        TextView itemName;
        TextView itemDescription;

        public ViewHolder(View view) {
            itemName = (TextView)view.findViewById(R.id.text_view_item_name);
            itemDescription = (TextView) view.findViewById(R.id.text_view_item_description);
        }
    }*/
}
