package com.ckt.mikel.chicktionary;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView imageViewDetailedImage;
    private TextView textViewDetailedName;
    private TextView textViewEmail;
    private TextView textViewPhone;
    private TextView textViewDetailedMark;
    private ProgressBar progressBar;
    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        imageViewDetailedImage = (ImageView) findViewById(R.id.imageViewDetailedPerson);

        textViewDetailedName = (TextView) findViewById(R.id.textViewDetailedName);
        textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        textViewPhone = (TextView) findViewById(R.id.textViewPhone);
        textViewDetailedMark = (TextView) findViewById(R.id.textViewDetailedMark);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        person = (Person) getIntent().getSerializableExtra("persona");

        if (person != null) {
            textViewDetailedName.setText(person.getName());
            textViewEmail.setText(person.getEmail());
            textViewPhone.setText(String.valueOf(person.getPhone()));
            textViewDetailedMark.setText(String.valueOf(person.getRating()));
            progressBar.setProgress(Math.round(person.getRating()));
            imageViewDetailedImage.setImageResource(person.getPicture());
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
