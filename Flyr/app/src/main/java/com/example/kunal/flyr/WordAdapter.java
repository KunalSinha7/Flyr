package com.example.kunal.flyr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Flyr> {

    public WordAdapter(Context context, ArrayList<Flyr> flyrs) {
        super(context, 0, flyrs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Flyr currentFlyr = getItem(position);

        TextView eventname = (TextView) listItemView.findViewById(R.id.event_name);
        eventname.setText(currentFlyr.getEventName());
        TextView datetime = (TextView) listItemView.findViewById(R.id.date_time);
        datetime.setText(currentFlyr.getDate() + " @ " + currentFlyr.getTime());
        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentFlyr.getLocation());

        return listItemView;
    }



}
