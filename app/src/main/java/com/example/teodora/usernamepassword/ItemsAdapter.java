package com.example.teodora.usernamepassword;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ItemsAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    int imagini[];
    String[] product;
    String[] prices;

    public ItemsAdapter (Context c, int i[], String p[],String[] price) {
        imagini=i;
        product=p;
        prices=price;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imagini.length;
    }

    @Override
    public Object getItem(int position) {
        return product[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(R.layout.my_list_view_resource,null);
        ImageView img= (ImageView) convertView.findViewById(R.id.imageViewStore);
        TextView tw1= (TextView) convertView.findViewById(R.id.StoreTextView);
        TextView tw2= (TextView) convertView.findViewById(R.id.TextViewDescription);

        img.setImageResource(imagini[position]);
        tw1.setText(product[position]);
        tw2.setText(prices[position]);

        return convertView;
    }


}
