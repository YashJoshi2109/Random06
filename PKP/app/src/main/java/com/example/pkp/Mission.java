package com.example.pkp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.pkp.MainActivity.Coin;
import static com.example.pkp.MainActivity.mypreference;

public class Mission extends AppCompatActivity {
    ListView simpleList;
    SharedPreferences mPreference;
    String countryList[] = {"Download KhaataBook App", "Downlaod Pay1 App", "Recharge through Pay1 App", "Pay bill through Pay1 App", "Money Transfer through Pay1 App"};
    int flags[] = {R.drawable.khatabook, R.drawable.pay1, R.drawable.pay1, R.drawable.pay1, R.drawable.pay1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);
        mPreference = getSharedPreferences(Coin,Context.MODE_PRIVATE);
        //Adding back button on toolbar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        simpleList = (ListView) findViewById(R.id.list);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);


        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                        try {
                        Intent viewIntent =
                                new Intent("android.intent.action.VIEW",
                                        Uri.parse("https://play.google.com/store/apps/details?id=com.vaibhavkalpe.android.khatabook"));


                        startActivity(viewIntent);
                    }catch(Exception e) {
                            Toast.makeText(getApplicationContext(), "Unable to Connect Try Again...",
                                    Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    int c = 100;
                    mPreference = getSharedPreferences(mypreference,
                            Context.MODE_PRIVATE);
                    int i = 0;
                    if (mPreference.contains(Coin)) {
                        i = mPreference.getInt(Coin, 0);
                    }
                    c = c + i;
                    SharedPreferences.Editor editor1 = mPreference.edit();
                    editor1.putInt(Coin, c);
                    editor1.commit();
                    Toast.makeText(getApplicationContext(),""+mPreference.getInt(Coin, 0),Toast.LENGTH_LONG).show();
                }
                if (position == 1) {
                    try {
                        Intent viewIntent =
                                new Intent("android.intent.action.VIEW",
                                        Uri.parse("https://play.google.com/store/apps/details?id=com.mindsarray.pay1"));
                        startActivity(viewIntent);
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Unable to Connect Try Again...",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                    int c = 200;
                    mPreference = getSharedPreferences(mypreference,
                            Context.MODE_PRIVATE);
                    int i = 0;
                    if (mPreference.contains(Coin)) {
                        i = mPreference.getInt(Coin, 0);
                    }
                    c = c + i;
                    SharedPreferences.Editor editor1 = mPreference.edit();
                    editor1.putInt(Coin, c);
                    editor1.commit();
                    Toast.makeText(getApplicationContext(),""+mPreference.getInt(Coin, 0),Toast.LENGTH_LONG).show();
                }
                if (position == 2) {
                    try {
                        Intent viewIntent =
                                new Intent("android.intent.action.VIEW",
                                        Uri.parse("https://play.google.com/store/apps/details?id=com.mindsarray.pay1"));
                        startActivity(viewIntent);
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Unable to Connect Try Again...",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                    int c = 150;
                    mPreference = getSharedPreferences(mypreference,
                            Context.MODE_PRIVATE);
                    int i = 0;
                    if (mPreference.contains(Coin)) {
                        i = mPreference.getInt(Coin, 0);
                    }
                    c = c + i;
                    SharedPreferences.Editor editor1 = mPreference.edit();
                    editor1.putInt(Coin, c);
                    editor1.commit();
                    Toast.makeText(getApplicationContext(),""+mPreference.getInt(Coin, 0),Toast.LENGTH_LONG).show();
                }
                if (position == 3) {
                    try {

                        Intent viewIntent =
                                new Intent("android.intent.action.VIEW",
                                        Uri.parse("https://play.google.com/store/apps/details?id=com.mindsarray.pay1"));
                        startActivity(viewIntent);
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Unable to Connect Try Again...",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                    int c = 200;
                    mPreference = getSharedPreferences(mypreference,
                            Context.MODE_PRIVATE);
                    int i = 0;
                    if (mPreference.contains(Coin)) {
                        i = mPreference.getInt(Coin, 0);
                    }
                    c = c + i;
                    SharedPreferences.Editor editor1 = mPreference.edit();
                    editor1.putInt(Coin, c);
                    editor1.commit();
                    Toast.makeText(getApplicationContext(),""+mPreference.getInt(Coin, 0),Toast.LENGTH_LONG).show();
                }
                if (position == 4) {
                    try {
                        Intent viewIntent =
                                new Intent("android.intent.action.VIEW",
                                        Uri.parse("https://play.google.com/store/apps/details?id=com.mindsarray.pay1"));
                        startActivity(viewIntent);
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Unable to Connect Try Again...",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                    int c = 150;
                    mPreference = getSharedPreferences(mypreference,
                            Context.MODE_PRIVATE);
                    int i = 0;
                    if (mPreference.contains(Coin)) {
                        i = mPreference.getInt(Coin, 0);
                    }
                    c = c + i;
                    SharedPreferences.Editor editor1 = mPreference.edit();
                    editor1.putInt(Coin, c);
                    editor1.commit();
                    Toast.makeText(getApplicationContext(),""+mPreference.getInt(Coin, 0),Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
