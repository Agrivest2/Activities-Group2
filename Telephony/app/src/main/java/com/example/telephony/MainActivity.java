package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ImageButton sms1;
    ImageButton sms2;
    ImageButton sms3;
    ImageButton sms4;
    ImageButton sms5;

    ImageButton Call1;
    ImageButton Call2;
    ImageButton Call3;
    ImageButton Call4;
    ImageButton Call5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sms1 = findViewById(R.id.txtmessage1);
        sms2 = findViewById(R.id.txtmessage2);
        sms3 = findViewById(R.id.txtmessage3);
        sms4 = findViewById(R.id.txtmessage4);
        sms5 = findViewById(R.id.txtmessage5);

        Call1 = findViewById(R.id.call1);
        Call2 = findViewById(R.id.call2);
        Call3 = findViewById(R.id.call3);
        Call4 = findViewById(R.id.call4);
        Call5 = findViewById(R.id.call5);


        sms1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09307160542";
                Intent intent = new Intent(getApplicationContext(), sms.class);
                intent.putExtra("sms",Contact);
                startActivity(intent);
            }
        });
        sms2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09122373955";
                Intent intent = new Intent(getApplicationContext(), sms.class);
                intent.putExtra("sms",Contact);
                startActivity(intent);
            }
        });
        sms3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09510587291";
                Intent intent = new Intent(getApplicationContext(), sms.class);
                intent.putExtra("sms",Contact);
                startActivity(intent);
            }
        });
        sms4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09307240591";
                Intent intent = new Intent(getApplicationContext(), sms.class);
                intent.putExtra("sms",Contact);
                startActivity(intent);
            }
        });
        sms5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09084962718";
                Intent intent = new Intent(getApplicationContext(), sms.class);
                intent.putExtra("sms",Contact);
                startActivity(intent);
            }
        });


        Call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09307160542";
                Intent intent = new Intent(getApplicationContext(), call.class);
                intent.putExtra("call",Contact);
                startActivity(intent);
            }
        });
        Call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09122373955";
                Intent intent = new Intent(getApplicationContext(), call.class);
                intent.putExtra("call",Contact);
                startActivity(intent);
            }
        });
        Call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09510587291";
                Intent intent = new Intent(getApplicationContext(), call.class);
                intent.putExtra("call",Contact);
                startActivity(intent);
            }
        });
        Call4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09307240591";
                Intent intent = new Intent(getApplicationContext(), call.class);
                intent.putExtra("call",Contact);
                startActivity(intent);
            }
        });
        Call5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09084962718";
                Intent intent = new Intent(getApplicationContext(), call.class);
                intent.putExtra("call",Contact);
                startActivity(intent);
            }
        });

    }

}