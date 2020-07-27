package com.lightidea.nth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {
    String May;
    TextView texsuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        texsuccess= (TextView)findViewById(R.id.successtex);
        May=getIntent().getStringExtra("mail");
        Toast.makeText(this,May.toString(),Toast.LENGTH_LONG).show();
        texsuccess.setText(May);

    }
}