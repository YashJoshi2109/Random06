package com.example.pkp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.pkp.MainActivity.Coin;
import static com.example.pkp.MainActivity.Name;
import static com.example.pkp.MainActivity.mypreference;
import static com.example.pkp.lang.language;

public class Camera extends AppCompatActivity {
    Button btntakephoto, up;
    SharedPreferences mPreference;
    Context context;
    ImageView imgdispphoto;
//    String a="1";
    private static final int CAMERA_REQUEST = 500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        mPreference = getSharedPreferences(mypreference,Context.MODE_PRIVATE);

//        if (mPreference.contains(language)) {
//            a = mPreference.getString(language, "");
//        }
//
//        if(a.equals("1"))
//        {
//            btntakephoto.setText(R.string.ecap);
//            up.setText(R.string.eup);
//        }
//        else if(a.equals("2")){
//            btntakephoto.setText(R.string.hcap);
//            up.setText(R.string.hup);
//        }else if(a.equals("3")){
//            btntakephoto.setText(R.string.mcap);
//            up.setText(R.string.mup);
//        }
        imgdispphoto = (ImageView) this.findViewById(R.id.imgdispphoto);
        btntakephoto = (Button) this.findViewById(R.id.btntakephoto);
        up = (Button)findViewById(R.id.upload);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = 50;
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
                //Toast.makeText(getApplicationContext(),""+mPreference.getInt(Coin, 0),Toast.LENGTH_LONG).show();
                imgdispphoto.setImageResource(R.drawable.ic_launcher_background);
                //finish();
                Toast.makeText(getApplicationContext(),"Successfully Uploaded coin: " + mPreference.getInt(Coin,0),Toast.LENGTH_LONG).show();
            }
        });

        //SharedPreferences mPrefs = getSharedPreferences("mypref",0);
//        Adding back button on toolbar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        btntakephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);

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

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imgdispphoto.setImageBitmap(photo);
        }
    }
}
