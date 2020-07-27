package com.lightidea.nth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    public Button btnsignup;
    public Button btnfirst;
    String May;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        May=getIntent().getStringExtra("May");
        Toast.makeText(this,May,Toast.LENGTH_SHORT).show();
        btnsignup=(Button)findViewById(R.id.signupbtn);
        btnfirst=(Button)findViewById(R.id.firstbtn);
        btnsignup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUpActivity.this, FacebookLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}