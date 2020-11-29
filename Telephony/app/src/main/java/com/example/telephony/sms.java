package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class sms extends AppCompatActivity {

    EditText editPhone, editMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        editPhone = findViewById(R.id.edityourNumber);
        editMessage = findViewById(R.id.edit_Message);

        Bundle sms = getIntent().getExtras();
        String SMS = sms.getString("sms");
        editPhone.setText(String.valueOf(SMS));

    }
    public void Send(View view) {
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

        if (permissionCheck== PackageManager.PERMISSION_GRANTED) {
            sendMessage();
        }
        else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 0);
        }
    }
    private void sendMessage() {
        String phone, message;

        phone = editPhone.getText().toString().trim();
        message = editMessage.getText().toString().trim();

        if(TextUtils.isEmpty(phone) || TextUtils.isEmpty(message)) {
            Toast.makeText(this, "ENTER FEILDS", Toast.LENGTH_LONG).show();
        }
        else {
            SmsManager smsManager = SmsManager.getDefault();

            smsManager.sendTextMessage(phone, null, message, null, null);

            Toast.makeText(this, "MESSAGE SENT", Toast.LENGTH_LONG).show();
        }
    }
}