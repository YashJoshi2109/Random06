package com.example.pkp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.pkp.MainActivity.Coin;
import static com.example.pkp.MainActivity.mypreference;


public class HOME extends AppCompatActivity {
TableLayout usern;
TableRow camera, mission, trade, vedio, refer, desc, la;
ImageView iv;
    SharedPreferences sharedpreferences;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        iv = (ImageView)findViewById(R.id.re);
        textView = (TextView)findViewById(R.id.earn);
        usern = (TableLayout)findViewById(R.id.user);
        camera = (TableRow)findViewById(R.id.camera);
        mission = (TableRow)findViewById(R.id.mission);
        trade  = (TableRow)findViewById(R.id.olx);
        vedio = (TableRow)findViewById(R.id.vedio);
        refer = (TableRow)findViewById(R.id.refer);
        desc = (TableRow)findViewById(R.id.description);
        la = (TableRow)findViewById(R.id.Lang);

        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Coin)) {
            textView.setText("You earned " + sharedpreferences.getInt(Coin,0));
        }

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sharedpreferences.contains(Coin)) {
                    textView.setText("You earned " + sharedpreferences.getInt(Coin,0));
                }
            }
        });

        usern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HOME.this,profile.class));
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HOME.this, Camera.class));
            }
        });
        mission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("You earned " + sharedpreferences.getInt(Coin,0));
                startActivity(new Intent(HOME.this, Mission.class));
            }
        });
        trade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HOME.this,Trade.class));
            }
        });
        vedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HOME.this,ADVERTISE.class));

            }
        });
        refer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mPreference = getSharedPreferences(mypreference,Context.MODE_PRIVATE);
                textView.setText("You earned " + sharedpreferences.getInt(Coin,0));
                Toast.makeText(getApplicationContext(),""+mPreference.getInt(Coin, 0),Toast.LENGTH_LONG).show();
            }
        });
        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HOME.this,description.class));

            }
        });
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HOME.this,lang.class));
            }
        });
    }
}
