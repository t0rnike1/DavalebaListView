package com.saxisdzvali.toko.listview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.saxisdzvali.toko.listview.R;
import com.saxisdzvali.toko.listview.model.MwerlebiCharacter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ToKo on 12/7/2016.
 */

public class CustomMwerlebiAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<MwerlebiCharacter> listData;
    private LayoutInflater inflater;

    public CustomMwerlebiAdapter(Context context, ArrayList<MwerlebiCharacter> data) {
        this.context = context;
        this.listData = data;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return this.listData.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView;
        ViewHolder viewHolder;

        if(convertView == null) {
            itemView = View.inflate(context, R.layout.listview_item, null);
            viewHolder = new ViewHolder();

            ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
            TextView nameView = (TextView) itemView.findViewById(R.id.name);

            viewHolder.imageView = imageView;
            viewHolder.nameView = nameView;

            itemView.setTag(viewHolder);
        } else {
            itemView = convertView;
            viewHolder = (ViewHolder) itemView.getTag();
        }

        MwerlebiCharacter sulxanSaba = (MwerlebiCharacter) getItem(position);

        viewHolder.nameView.setText(sulxanSaba.getName());

        Picasso.with(context)
                .load(sulxanSaba.getImage ())
                .resize(200, 200)
                .into(viewHolder.imageView);




        return itemView;

    }

    private class ViewHolder {
        ImageView imageView;
        TextView nameView;
    }
}
