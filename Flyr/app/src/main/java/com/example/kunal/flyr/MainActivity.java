package com.example.kunal.flyr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayList<Flyr> events = new ArrayList<Flyr>();
        //Make method to fill arraylist with events from file
        events.add(new Flyr("Party", "2-2-2016", "10:30pm", "1275 First St. West Lafayette, Indiana"));
        events.add(new Flyr("Second Party", "2-3-2016", "10:30pm", "Lawson Computer Science"));

        WordAdapter adapter = new WordAdapter(this, events);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }


    //Navigation Intent
    public void showOnMap(String location) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + location);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    //Navigation Button Click Handler
    public void ButtonClickHandler(View v) {
        LinearLayout vwParentRow = (LinearLayout)v.getParent();
        LinearLayout textLayout = (LinearLayout)vwParentRow.getChildAt(0);
        TextView location = (TextView) textLayout.getChildAt(2);
        String strLocation = location.getText().toString();
        ImageButton btnChild = (ImageButton)vwParentRow.getChildAt(1);
        showOnMap(strLocation);
    }

}
