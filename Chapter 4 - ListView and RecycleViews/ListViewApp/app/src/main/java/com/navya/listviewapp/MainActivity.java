package com.navya.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[]= {"Hi","My name is","Vivek","I am a","Btech","Student","Yashi","Hi","Bi","Die"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        //Using Built in Adapter
//        ArrayAdapter ad = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(ad);
        //Listener on Built in ArrayAdapter ListView
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "You clicked on : "+ position, Toast.LENGTH_SHORT).show();
//            }
//        });

        //Using our Custom Adapter
        VivekAdapter ad = new VivekAdapter(MainActivity.this , R.layout.my_vivek_layout , arr);
        listView.setAdapter(ad);
//                Here is a further list of layouts that you can use: http://developer.android.com/reference/android/R.layout.html
//        (Updated link thanks @Estel: https://github.com/android/platform_frameworks_base/tree/master/core/res/res/layout )

    }
}