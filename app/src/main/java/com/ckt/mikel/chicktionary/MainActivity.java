package com.ckt.mikel.chicktionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
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
        people.add(new Person("Ana", "ana@email.com", 600111222, "testing", 9.5f));
        people.add(new Person("Julia", "julia@email.com", 611222777, "testing 2", 6.5f));
        people.add(new Person("Ramón", "ramon@email.com", 699333222, "testing truck driver", 1.5f));
        people.add(new Person("Elvira", "elvira@email.com", 948579800, "testing elvira", 2f));
        people.add(new Person("Ted Cruz", "ted@email.com", 785999333, "testing ted", 10f));
        people.add(new Person("Sean Murray", "nomanslie@email.com", 741852963, "testing a lie", 0f));
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
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("persona", people.get(position));
                startActivity(intent);
                //Toast.makeText(MainActivity.this, people.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
