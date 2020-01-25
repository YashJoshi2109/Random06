package com.example.pkp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //    Button blogin;
    public static final String mypreference = "mypref";
    public static final String Coin = "ckey";
    Button b1, b2;
    EditText ed1, ed2;
    TextView tx1;
    int counter = 3;
    SharedPreferences sharedpreferences;
    public static final String Name = "nameKey";
    public static final String Pass = "passKey";
    private Object view;
    SharedPreferences mPreference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        b2 = (Button) findViewById(R.id.button2);
        tx1 = (TextView) findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        mPreference = getSharedPreferences(mypreference,Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Name)) {
            ed1.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(Pass)) {
            ed2.setText(sharedpreferences.getString(Pass, ""));

        }

        if (sharedpreferences.contains(Name)) {

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (ed1.getText().toString().equals("admin") &&
                            ed2.getText().toString().equals("admin")) {
                        startActivity(new Intent(MainActivity.this, HOME.class));
                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
                        tx1.setVisibility(View.VISIBLE);
                        tx1.setBackgroundColor(Color.RED);
                        counter--;
                        tx1.setText(Integer.toString(counter));

                        if (counter == 0) {
                            b1.setEnabled(false);
                        }
                    }
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

    }
    public void Save (View view){

        String n = ed1.getText().toString();
        String e = ed2.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(Name, n);
        editor.putString(Pass, e);
        editor.commit();

        int i = 0;
        SharedPreferences.Editor editor1 = mPreference.edit();
        editor1.putInt(Coin, i);
        editor1.commit();
    }
    public void Get(View view) {

        //ed1=(TextView)findViewById(R.id.editText);
        //ed2=(TextView)findViewById(R.id.editText2);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Name)) {
            ed1.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(Pass)) {
            ed2.setText(sharedpreferences.getString(Pass, ""));

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
}