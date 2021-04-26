package com.example.tc1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity
{
    ViewGroup tContainer;
    TextView tc1;
    EditText cnum1;
    TextView samt1;
    TextView boutput1;
    TextView soutput1;
    TextView pp1;
    TextView toutput1;
    TextView tipoutput1;
Button button1;
EditText bamt1;
EditText tipper11;
Editable tippercent;
EditText cnumber;
Editable Tax;
double total;
TextView tmtopt1;
double splita;
Double AA;
String A;
double B;
double C;
double D;
String E;
String F;
String G;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tContainer=findViewById(R.id.transitionContainer);
        tc1=findViewById(R.id.tc);
        cnum1=findViewById(R.id.cnum);
        samt1=findViewById(R.id.samt);
        bamt1=findViewById(R.id.bamt);
        tipper11=findViewById(R.id.tipper1);
        soutput1=findViewById(R.id.soutput);
        boutput1=findViewById(R.id.boutput);
        toutput1=findViewById(R.id.toutput);
        tipoutput1=findViewById(R.id.tipoutput);
        tmtopt1=findViewById(R.id.tmtopt);
        pp1=findViewById(R.id.pp);
        button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                bamt1=(EditText)findViewById(R.id.bamt);
                tipper11=(EditText)findViewById(R.id.tipper1);
                cnum1=(EditText)findViewById(R.id.cnum);
                boutput1.setText(bamt1.getText().toString());
                tippercent=tipper11.getText();
                AA=Double.parseDouble(cnumber.toString());
                Tax= bamt1.getText();
                double Ta;
                Ta=Double.parseDouble(Tax.toString());
                A=valueOf(Ta);
                toutput1.setText(A);
                B=Double.parseDouble(bamt1.getText().toString());
                C=Double.parseDouble(tipper11.getText().toString());
                D=B*C/100;
                E=valueOf(D);
                tipoutput1.setText(E);
                total=D+Ta;
                F=valueOf(total);
                tmtopt1.setText(F);
                splita=total/AA;
                G=valueOf(splita);
                soutput1.setText(G);
            }
        });


    }
}