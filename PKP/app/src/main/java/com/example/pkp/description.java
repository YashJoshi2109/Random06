package com.example.pkp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class description extends AppCompatActivity{
//    String[] lang={"English","Hindi"};
//    Spinner spin;
    Button b1,b2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        //Adding back button on toolbar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        b1 = (Button) findViewById(R.id.hin);
        b2 = (Button) findViewById(R.id.eng);
        tv = (TextView)findViewById(R.id.text3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(R.string.desc_hin);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(R.string.desc_eng);
            }
        });

//        spin = (Spinner)findViewById(R.id.simpleSpinner);
//
//        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, lang);
//        spin.setAdapter(aa);
//
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



//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        if(position==0){
//            Toast.makeText(getApplicationContext(),"eng",Toast.LENGTH_LONG).show();
//        }
//    }
//
//    @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {
//
//    }
}
