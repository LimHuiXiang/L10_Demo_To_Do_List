package com.example.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> versionList;
    TextView Results;
    TextView Results2;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects)
    {
        super (context, resource, objects);

        parent_context =context;
        layout_id = resource;
        versionList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        ListView  lv = rowView.findViewById(R.id.listViewToDo);
        TextView Results = rowView.findViewById(R.id.tvResults);
        TextView Result2 = rowView.findViewById(R.id.tvResult2);
        // Obtain the Android Version information based on the position
        ToDoItem currentVersion = versionList.get(position);

        // Set values to the TextView to display the corresponding information
        Results.setText(currentVersion.getTitle());
        Result2.setText(currentVersion.toString());
        //Result2.setText(currentVersion.getDatetoString() + "("+ ""+")");


        return rowView;
    }

}
