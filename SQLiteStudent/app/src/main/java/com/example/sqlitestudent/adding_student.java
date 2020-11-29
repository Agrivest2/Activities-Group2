package com.example.sqlitestudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class adding_student extends AppCompatActivity {

    OpenHelper openHelper;
    String st_ID;
    String st_Name;
    String st_Address;
    SQLiteDatabase sqLiteDatabase;

    EditText editID;
    EditText editName;
    EditText editAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_student);
        openHelper = new OpenHelper(this);
        sqLiteDatabase = openHelper.getWritableDatabase();



        editID = findViewById(R.id.editid);
        editName = findViewById(R.id.editnames);
        editAddress = findViewById(R.id.editaddress);
    }
    public void clickAdd(View view) {
        st_ID=editID.getText().toString();
        st_Name=editName.getText().toString();
        st_Address=editAddress.getText().toString();

        if(TextUtils.isEmpty(st_ID) || TextUtils.isEmpty(st_Name) || TextUtils.isEmpty(st_Address)) {
            Toast.makeText(this, "Check Empty Fields", Toast.LENGTH_SHORT).show();
        }
        else {
            ContentValues contentValues = new ContentValues();
            contentValues.put(DatabaseInfo._ID, (byte[]) null);
            contentValues.put(DatabaseInfo.IDNO, st_ID);
            contentValues.put(DatabaseInfo.StudentName, st_Name);
            contentValues.put(DatabaseInfo.StudentAddress, st_Address);
             long rowId = sqLiteDatabase.insert(DatabaseInfo.TABLE_NAME, null, contentValues);

             if (rowId != -1) {
                 Toast.makeText(this, "Added",Toast.LENGTH_SHORT).show();
                 startActivity(new Intent(this, MainActivity.class));
             }
             else {
                 Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
             }
        }
    }
}