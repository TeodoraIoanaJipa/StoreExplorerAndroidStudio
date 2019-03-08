package com.example.teodora.usernamepassword;

import android.content.Intent;
import android.content.res.Resources;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ListView mylistView;
    int[] images = {R.drawable.auchan_,R.drawable.carrefour,R.drawable.cora,
            R.drawable.kauflan,R.drawable.lidl,R.drawable.mega_image,
            R.drawable.merca_dona,R.drawable.metro,R.drawable.profi,R.drawable.selgros_};
    String[] stores;
    String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resources res = getResources();
        mylistView = (ListView) findViewById(R.id.listViewStores);
        stores = res.getStringArray(R.array.stores);
        descriptions = res.getStringArray(R.array.timecommand);

        CustomAdapter adapter = new CustomAdapter();
        mylistView.setAdapter(adapter);

        mylistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showList = new Intent(getApplicationContext(),Main3Activity.class);
                showList.putExtra("com.example.teodora.itemIndex",position);
                startActivity(showList);
            }
        });
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return stores[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.my_list_view_resource,null);
            ImageView imagev = (ImageView)convertView.findViewById(R.id.imageViewStore);
            TextView textViewStore = (TextView) convertView.findViewById(R.id.StoreTextView);
            TextView textViewDescription = (TextView) convertView.findViewById(R.id.TextViewDescription);
            imagev.setImageResource(images[position]);
            textViewStore.setText(stores[position]);
            textViewDescription.setText(descriptions[position]);
            return convertView;
        }
    }
}


