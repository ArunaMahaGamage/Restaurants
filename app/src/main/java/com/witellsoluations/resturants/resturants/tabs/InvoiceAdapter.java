package com.witellsoluations.resturants.resturants.tabs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.witellsoluations.resturants.resturants.R;

/**
 * Created by User on 2/15/2018.
 */

public class InvoiceAdapter extends RecyclerView.Adapter<InvoiceAdapter.ViewHolder> {

    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        public TextView mId;
        public TextView mProduct;
        public TextView mPrice;

        public ViewHolder(View v) {
            super(v);
            mId = v.findViewById(R.id.tv_id);
            mProduct = v.findViewById(R.id.tv_product);
            mPrice = v.findViewById(R.id.tv_price);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public InvoiceAdapter(String[] myDataset) {
        mDataset = myDataset;
    }


    @Override
    public InvoiceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.invoice_view, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(InvoiceAdapter.ViewHolder holder, int position) {

        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        //holder.mId.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
