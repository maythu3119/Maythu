package com.lightidea.nth;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

import static android.view.View.*;

public class FacebookLoginActivity extends AppCompatActivity {
    public Button btnlogin;
    public EditText txtemail;
    public EditText txtpassword;
    public Button btncreate;
    DatePickerDialog date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_login);
        txtemail = (EditText) findViewById(R.id.emailtxt);
        txtpassword = (EditText) findViewById(R.id.passwordtxt);
        btncreate = (Button) findViewById(R.id.Createbtn);
        btnlogin = (Button) findViewById(R.id.Loginbtn);
        btncreate.setOnClickListener(new View.OnClickListener(){

                                        @Override
                                        public void onClick(View v) {
                                            Intent intent=new Intent(FacebookLoginActivity.this,SignUpActivity.class);
                                            startActivity(intent);
                                        }
                                    });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtpassword.getText().toString().equals("456789")) {
                    if (txtemail.getText().toString().equals("maythu@gmail.com")) {

                        Intent i = new Intent(FacebookLoginActivity.this, SuccessActivity.class);
                        i.putExtra("mail", txtemail.getText().toString());
                        startActivity(i);
                    } else
                        Toast.makeText(FacebookLoginActivity.this, "wrong Email", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(FacebookLoginActivity.this, "invalid password", Toast.LENGTH_SHORT).show();
            }



        });
        Calendar C=Calendar.getInstance();
        final int myear=C.get(Calendar.YEAR);
        int mmonth=C.get(Calendar.MONTH);
        int mday=C.get(Calendar.DAY_OF_MONTH);

        date=new DatePickerDialog( this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                btnlogin.setText(dayOfMonth+"/"+(month+1)+"/"+year);
            }
        },myear,mmonth,mday);
        date.show();
    }
}