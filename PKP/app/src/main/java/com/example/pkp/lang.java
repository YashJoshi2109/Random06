package com.example.pkp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.pkp.MainActivity.Coin;

public class lang extends AppCompatActivity {
Button eng,hin,mar;
    SharedPreferences mPreference;
    String a;
    public static final String mypreference = "my";
    public static final String language = "lang";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang);



        mPreference = getSharedPreferences(language, Context.MODE_PRIVATE);

        if (mPreference.contains(language)) {
            a = mPreference.getString(language, "");
        }

        eng = (Button)findViewById(R.id.english);
        hin = (Button)findViewById(R.id.hindi);
        mar = (Button)findViewById(R.id.marathi);

        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = "1";
                SharedPreferences.Editor editor = mPreference.edit();
                editor.putString(language, b);
                editor.commit();
            }
        });

        hin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = "2";
                SharedPreferences.Editor editor = mPreference.edit();
                editor.putString(language, b);
                editor.commit();

            }
        });

        mar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = "3";
                SharedPreferences.Editor editor = mPreference.edit();
                editor.putString(language, b);
                editor.commit();

            }
        });
    }
}
