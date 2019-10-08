package com.nazmul.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //button object declare
    Button btnClickMe,btnGoogle,btnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link to xml
        btnClickMe=findViewById(R.id.btn_click);
        btnGoogle=findViewById(R.id.btn_google);
        btnFacebook=findViewById(R.id.btn_fb);




        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,DetailsActivity.class);
                startActivity(i);

                Toast.makeText(MainActivity.this, "Click Me", Toast.LENGTH_SHORT).show();


            }
        });


        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(i);

                Toast.makeText(MainActivity.this, "Google", Toast.LENGTH_LONG).show();


            }
        });
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com"));
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);
                startActivity(i);
            }
        });
    }
}
