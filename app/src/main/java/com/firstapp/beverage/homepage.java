package com.firstapp.beverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class homepage extends AppCompatActivity {
    private TextView tvwelcome1;
    private TextView tvusername1;
    private ImageView imageview1;
    private ImageView imageview2;
    private ImageView imageview3;
    private ImageView imageview4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        tvwelcome1=(TextView) findViewById(R.id.tvwelcome);
        tvusername1=(TextView) findViewById(R.id.tvusername);
        imageview1=(ImageView) findViewById(R.id.iv01);
        imageview2=(ImageView) findViewById(R.id.iv02);
        imageview3=(ImageView) findViewById(R.id.iv03);
        imageview4=(ImageView) findViewById(R.id.iv04);



        Intent i1=getIntent();
        String un1=i1.getStringExtra("username");
        tvusername1.setText(un1);
        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(homepage.this, softdrink.class);
                startActivity(i1);
            }

        });

        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(homepage.this,HotDrink.class);
                startActivity(i1);
            }
        });

        imageview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(homepage.this,alcoholic.class);
                startActivity(i1);
            }
        });

        imageview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(homepage.this, nonalcoholic.class);
                startActivity(i1);
            }
        });


         }
    }
