package com.ckt.mikel.chicktionary;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mikel on 06/10/2016.
 */
public class CustomizedListAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<Person> people;

    public CustomizedListAdapter(Activity activity, ArrayList<Person> people) {
        super();
        this.activity = activity;
        this.people = people;
    }

    public int getCount() {
        return people.size();
    }

    public Object getItem(int position) {
        return people.get(position);
    }

    /**
     * returns id for the custom_list_item(position)
     */
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        int icons[] = { android.R.drawable.ic_dialog_info,
                android.R.drawable.ic_dialog_info,
                android.R.drawable.ic_dialog_alert,
                android.R.drawable.ic_dialog_email};

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item, null);
        }

        Person person = people.get(position);

        //ImageView imageViewIcon = (ImageView) view.findViewById(R.id.imageViewPerson);
        //imageViewIcon.setImageResource();

        TextView textViewName = (TextView) view.findViewById(R.id.textViewName);
        textViewName.setText(person.getName());

        TextView textViewMark = (TextView) view.findViewById(R.id.textViewMark);
        textViewMark.setText(String.valueOf(person.getRating()));

        return view;
    }
}