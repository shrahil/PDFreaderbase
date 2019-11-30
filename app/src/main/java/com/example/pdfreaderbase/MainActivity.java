package com.example.pdfreaderbase;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the spinner from the xml.
        Spinner classDropdown = findViewById(R.id.spinner1);
        //create a list of items for the spinner.
        String[] classes = new String[]{"Playgroup", "Nursery", "Jr. KG", "Sr. KG"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> classAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, classes);
        //set the spinners adapter to the previously created one.
        classDropdown.setAdapter(classAdapter);
        //get the spinner from the xml.
        Spinner fortnightDropdown = findViewById(R.id.spinner2);
        //create a list of items for the spinner.
        String[] fortnights = new String[]{"F1-F2", "F3-F4", "F5-F6", "F7-F8"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> fortnightAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, fortnights);
        //set the spinners adapter to the previously created one.
        fortnightDropdown.setAdapter(fortnightAdapter);
        TextView clikArea1 = (TextView) findViewById(R.id.clickArea1);
        // Set a click listener on that View
        clikArea1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent viewPdfIntent = new Intent(MainActivity.this, View_Pdf_Activity.class);
                startActivity(viewPdfIntent);
            }
        });
        }
}


