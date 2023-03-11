package com.example.projet1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv_to,tv_form,resultat;
EditText edit;
Button btnusd,btneuro,btncan,btnaus,btntry,btngbp;
String amount;
double MAD;
int res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ClickListeners();
    }
    public void init(){
        tv_to=findViewById(R.id.tv_to);
        tv_form=findViewById(R.id.tv_form);
        resultat=findViewById(R.id.resultat);
        edit=findViewById(R.id.edit);
        btnaus=findViewById(R.id.btnaus);
        btncan=findViewById(R.id.btncan);
        btneuro=findViewById(R.id.btneuro);
        btngbp=findViewById(R.id.btngbp);
        btntry=findViewById(R.id.btntry);
        btnusd=findViewById(R.id.btnusd);
    }
    public void ClickListeners(){
        btnusd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edit.getText().toString();
                MAD=0.09507;
                double res= Double.parseDouble(amount)*(MAD);;
                resultat.setText(String.valueOf(res));
                tv_to.setText("USD");
                tv_form.setText("MAD");

            }
        });
        btneuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edit.getText().toString();
                MAD=0.09026;
                double res= Double.parseDouble(amount)*(MAD);;
                resultat.setText(String.valueOf(res));
                tv_to.setText("EURO");
                tv_form.setText("MAD");


            }
        });
        btnaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edit.getText().toString();
                MAD=0.1446;
                double res= Double.parseDouble(amount)*(MAD);
                resultat.setText(String.valueOf(res));
                tv_to.setText("AUD");
                tv_form.setText("MAD");
            }
        });
        btngbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edit.getText().toString();
                MAD=0.08048;
                double res= Double.parseDouble(amount)*(MAD);
                resultat.setText(String.valueOf(res));
                tv_to.setText("GBP");
                tv_form.setText("MAD");
            }
        });
        btncan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edit.getText().toString();
                MAD=0.1309;
                double res= Double.parseDouble(amount)*(MAD);
                resultat.setText(String.valueOf(res));
                tv_to.setText("CAD");
                tv_form.setText("MAD");
            }
        });
        btntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edit.getText().toString();
                MAD=1813802.06;
                double res= Double.parseDouble(amount)*(MAD);
                resultat.setText(String.valueOf(res));
                tv_to.setText("TRL");
                tv_form.setText("MAD");
            }
        });
    }
}