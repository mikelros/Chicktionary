package com.ckt.mikel.chicktionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewPeople;
    private ArrayList<Person> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupData();
        setupCustomList();
    }

    /**
     * sets up an ArrayList of Tasks
     */
    private void setupData () {
        people = new ArrayList<Person>();
        people.add(new Person("Ana", "ana@email.com", 600111222, "test", 9.5f));
        people.add(new Person("Ana", "ana@email.com", 600111222, "test", 9.5f));
        people.add(new Person("Ana", "ana@email.com", 600111222, "test", 9.5f));
        people.add(new Person("Ana", "ana@email.com", 600111222, "test", 9.5f));
        people.add(new Person("Ana", "ana@email.com", 600111222, "test", 9.5f));
        people.add(new Person("Ana", "ana@email.com", 600111222, "test", 9.5f));
    }

    /**
     * sets up the customized list
     */
    private void setupCustomList() {

        CustomizedListAdapter customizedListAdapter = new CustomizedListAdapter(this, people);

        listViewPeople = (ListView) findViewById(R.id.listViewChicks);

        listViewPeople.setAdapter(customizedListAdapter);


        listViewPeople.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "You pressed " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
