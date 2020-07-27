package com.lightidea.nth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnHelloWorld;
    private TextView txtHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHelloWorld=(Button)findViewById(R.id.HelloWorldbtn);
        txtHelloWorld=(TextView)findViewById(R.id.HelloWorldtxt);

        Toast.makeText(this, "may", Toast.LENGTH_LONG).show();

        btnHelloWorld.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
              //  txtHelloWorld.setText("May Thu");
                Intent i=new Intent(MainActivity.this,LogInAct.class);
                startActivity(i);
            }
        });

    }

}