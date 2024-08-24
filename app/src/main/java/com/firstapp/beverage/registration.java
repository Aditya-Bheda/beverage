package com.firstapp.beverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText password;
    private EditText cpassword;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        name=(EditText) findViewById(R.id.etusername1);
        email=(EditText) findViewById(R.id.etemail);
        password=(EditText) findViewById(R.id.etpassword);
        cpassword=(EditText) findViewById(R.id.etcpassword);
        signup=(Button) findViewById(R.id.btnsignup1);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("")) {
                    Toast.makeText(registration.this, "username is empty", Toast.LENGTH_SHORT).show();
                } else if (email.getText().toString().equals("")) {
                    Toast.makeText(registration.this, "email is empty", Toast.LENGTH_SHORT).show();
                } else if (password.getText().toString().equals("")) {
                    Toast.makeText(registration.this, "password is empty", Toast.LENGTH_SHORT).show();
                } else if (cpassword.getText().toString().equals("")) {
                    Toast.makeText(registration.this, "confirm password is empty", Toast.LENGTH_SHORT).show();
                } else {

                    String un = name.getText().toString();
                    String pw = password.getText().toString();

                    Intent i1 = new Intent(registration.this, MainActivity.class);
                    i1.putExtra("username", un);
                    i1.putExtra("password", pw);
                    startActivity(i1);
                }
            }
            });
        }
    }

