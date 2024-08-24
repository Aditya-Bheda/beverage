package com.firstapp.beverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText aname;
    private EditText apassword;
    private Button alogin;
    private Button asignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aname=(EditText) findViewById(R.id.etusername);
        apassword=(EditText) findViewById(R.id.etpassword);
        alogin=(Button) findViewById(R.id.btnlogin);
        asignup=(Button) findViewById(R.id.btnsignup);

        Intent i1 = getIntent();
        String un=i1.getStringExtra("username");
        String pw=i1.getStringExtra("password");
        
        alogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aname.getText().toString().equals(un)){
                }else {
                    Toast.makeText(MainActivity.this, "invalid username", Toast.LENGTH_SHORT).show();
                }
                if (apassword.getText().toString().equals(pw)){
                }else {
                    Toast.makeText(MainActivity.this, "invalid password", Toast.LENGTH_SHORT).show();
                }if (aname.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "username is empty", Toast.LENGTH_SHORT).show();
                }if (apassword.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "password is empty", Toast.LENGTH_SHORT).show();
                }if (aname.getText().toString().equals(un) && apassword.getText().toString().equals(pw)){
                    Toast.makeText(MainActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                    String un=aname.getText().toString();
                    Intent i1=new Intent(MainActivity.this, homepage.class);
                    i1.putExtra("username",un);
                    startActivity(i1);
                }
            }
        });
        asignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this, registration.class);
                startActivity(i1);
            }
        });

    }
}