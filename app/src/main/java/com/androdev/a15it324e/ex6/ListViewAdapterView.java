package com.androdev.a15it324e.ex6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.androdev.a15it324e.R;

public class ListViewAdapterView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_adapter_view);

        ListView listView = (ListView) findViewById(R.id.listView);
        String[] data = new String[] {"Lamborghini", "Audi", "Koenigsegg", "Ferrari", "Tesla", "Tata", "Land Rover", "Buggati", "Bentley"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(arrayAdapter);
    }
}
