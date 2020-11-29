package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        Button btnLogin = (Button) findViewById(R.id.btnlogin);
        Button btnRegester = (Button) findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etName.getText().toString();
                String password = etPassword.getText().toString();

                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                String userDetails = preferences.getString(user + password + "data", "Email or Password is incorrect");

                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("display",userDetails);
                editor.commit();

                Intent displayScreen = new Intent(MainActivity.this, DisplayScreen.class);
                startActivity(displayScreen);
            }
        });

        btnRegester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent registerScreen = new Intent(MainActivity.this, Register.class);
              startActivity(registerScreen);
            }
        });


    }
}
