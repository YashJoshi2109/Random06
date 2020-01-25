package com.example.pkp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ADVERTISE extends AppCompatActivity {
    ListView simpleList1;
    String countryList[] = {"","","","",""};
    int flags[] = {R.drawable.pay12, R.drawable.cap, R.drawable.shahanchor, R.drawable.dmce, R.drawable.logo};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertise);

        //Adding back button on toolbar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        simpleList1 = (ListView) findViewById(R.id.list1);
//        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.activity_adlistview, R.id.ad, flags);
        CustomAdapter1 customAdapter = new CustomAdapter1(getApplicationContext(), countryList, flags);
        simpleList1.setAdapter(customAdapter);
        simpleList1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    try {
                        Intent viewIntent =
                                new Intent("android.intent.action.VIEW",
                                        Uri.parse("https://pay1.in/"));
                        startActivity(viewIntent);
                    }catch(Exception e) {
                        Toast.makeText(getApplicationContext(), "Unable to Connect Try Again...",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                }
                if(position == 1){
                    try {
                        Intent viewIntent =
                                new Intent("android.intent.action.VIEW",
                                        Uri.parse("https://www.capgemini.com/in-en/"));
                        startActivity(viewIntent);
                    }catch(Exception e) {
                        Toast.makeText(getApplicationContext(), "Unable to Connect Try Again...",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                }
                if(position == 2){
                    try {
                        Intent viewIntent =
                                new Intent("android.intent.action.VIEW",
                                        Uri.parse("http://www.sakp.ac.in/"));
                        startActivity(viewIntent);
                    }catch(Exception e) {
                        Toast.makeText(getApplicationContext(), "Unable to Connect Try Again...",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                }
                if(position == 3){
                    try {
                        Intent viewIntent =
                                new Intent("android.intent.action.VIEW",
                                        Uri.parse("https://www.dmce.ac.in/"));
                        startActivity(viewIntent);
                    }catch(Exception e) {
                        Toast.makeText(getApplicationContext(), "Unable to Connect Try Again...",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                }
                if(position == 4){
                    try {
                        Intent viewIntent =
                                new Intent("android.intent.action.VIEW",
                                        Uri.parse("https://msbte.org.in/"));
                        startActivity(viewIntent);
                    }catch(Exception e) {
                        Toast.makeText(getApplicationContext(), "Unable to Connect Try Again...",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    //Function called to go back
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
