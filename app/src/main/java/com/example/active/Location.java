package com.example.active;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Location extends AppCompatActivity {
    ListView listView;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        listView = findViewById(R.id.lists);
        array = new ArrayList<>();

        array.add("Kabale");
        array.add("Kisoro");
        array.add("Isingiro");
        array.add("Rukungiri");
        array.add("Ntungamu");
        array.add("Mbarara");
        array.add("Rubirizi");
        array.add("Kasese");
        array.add("FortPortal");


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(getApplicationContext(), " " + array.get(position), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
