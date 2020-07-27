package com.lightidea.nth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btnzero,btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,btnc,btndel,btnadd,btnminus,btnmulti,btndiv,btnequal,btnpercent,btndot;
    TextView txtresult;
    TextView txtinput;
    private double val1=Double.NaN;
    private double val2;
    private String ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnzero=(Button)findViewById(R.id.zerobtn);
        btnone=(Button)findViewById(R.id.onebtn);
        btntwo=(Button)findViewById(R.id.twobtn);
        btnthree=(Button)findViewById(R.id.threebtn);
        btnfour=(Button)findViewById(R.id.fourbtn);
        btnfive=(Button)findViewById(R.id.fivebtn);
        btnsix=(Button)findViewById(R.id.sixbtn);
        btnseven=(Button)findViewById(R.id.sevenbtn);
        btneight=(Button)findViewById(R.id.eightbtn);
        btnnine=(Button)findViewById(R.id.ninebtn);
        btndot=(Button)findViewById(R.id.dotbtn);
        btnadd=(Button)findViewById(R.id.addbtn);
        btnminus=(Button)findViewById(R.id.minusbtn);
        btnmulti=(Button)findViewById(R.id.multibtn);
        btndiv=(Button)findViewById(R.id.divbtn);
        btnequal=(Button)findViewById(R.id.equalbtn);
        btnpercent=(Button)findViewById(R.id.percentbtn);
        txtinput=(TextView)findViewById(R.id.inputtxt);
        txtresult=(TextView)findViewById(R.id.resulttxt);

        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"0");
            }
        });
        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"1");
            }
        });
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"2");
            }
        });
        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"3");
            }
        });
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"4");
            }
        });
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"5");
            }
        });
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"6");
            }
        });
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"7");
            }
        });
        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"8");
            }
        });
        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"9");
            }
        });


        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"=");
            }
        });
        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+"%");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "+";
                if(!Double.isNaN(val1)){
                    val2 = Double.parseDouble(txtinput.getText().toString());
                    val1 = val1 + val2;
                } else {
                    val1 = Double.parseDouble(txtinput.getText().toString());
                }
                txtresult.setText(val1 + " + ");
                txtinput.setText(null);
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "-";
                if(!Double.isNaN(val1)){
                    val2 = Double.parseDouble(txtinput.getText().toString());
                    val1 = val1 - val2;
                } else {
                    val1 = Double.parseDouble(txtinput.getText().toString());
                }
                txtresult.setText(val1 + " - ");
                txtinput.setText(null);
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "*";
                if(!Double.isNaN(val1)){
                    val2 = Double.parseDouble(txtinput.getText().toString());
                    val1 = val1 * val2;
                } else {
                    val1 = Double.parseDouble(txtinput.getText().toString());
                }
                txtresult.setText(val1 + " * ");
                txtinput.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "/";
                if(!Double.isNaN(val1)){
                    val2 = Double.parseDouble(txtinput.getText().toString());
                    val1 = val1/val2;
                } else {
                    val1 = Double.parseDouble(txtinput.getText().toString());
                }
                txtresult.setText(val1 + " / ");
                txtinput.setText(null);
            }
        });
        txtresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION != null && ACTION.equals("+")){
                    double result = val1 + Double.parseDouble(txtinput.getText().toString());
                    txtresult.setText(null);
                    txtinput.setText(String.valueOf(result));
                } else if(ACTION != null && ACTION.equals("-")){
                    double result = val1 - Double.parseDouble(txtinput.getText().toString());
                    txtresult.setText(null);
                    txtinput.setText(String.valueOf(result));
                } else if(ACTION != null && ACTION.equals("*")){
                    double result = val1 * Double.parseDouble(txtinput.getText().toString());
                    txtresult.setText(null);
                    txtinput.setText(String.valueOf(result));
                } else if(ACTION != null && ACTION.equals("/")){
                    double result = val1 / Double.parseDouble(txtinput.getText().toString());
                    txtresult.setText(null);
                    txtinput.setText(String.valueOf(result));
                }
                ACTION = null;
                val1 = Double.NaN;
                txtinput.setText(txtinput.getText().length());
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinput.setText(txtinput.getText() + ".");
                txtinput.setText(txtinput.getText().length());
            }
        });

}
}