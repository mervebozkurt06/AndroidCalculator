package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.FloatArrayEvaluator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnOne,btnTwo,btnThree,btnFour,btnFive,
    btnSix,btnSeven,btnEight,btnNine,btnZero,btnCikar,
    btnTopla,btnBol,btnCarp,btnClear,btnDot,btnEquals;

    EditText etSonuc;
    float sayi1,sayi2;
    boolean toplama,cikarma,carpma,bolme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSonuc=findViewById(R.id.etSonuc);
        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);
        btnZero=findViewById(R.id.btnZero);
        btnDot=findViewById(R.id.btnDot);
        btnClear=findViewById(R.id.btnClear);
        btnEquals=findViewById(R.id.btnEquals);
        btnTopla=findViewById(R.id.btnTopla);
        btnCikar=findViewById(R.id.btnCikar);
        btnCarp=findViewById(R.id.btnCarp);
        btnBol=findViewById(R.id.btnBol);


        btnClear.setOnClickListener(new View.OnClickListener() { //butona tıklandığında ne olacak?
            @Override
            public void onClick(View v) {
                etSonuc.setText(" ");
                sayi1=0;
                sayi2=0;
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSonuc.setText(etSonuc.getText()+"0");
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSonuc.setText(etSonuc.getText()+"1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSonuc.setText(etSonuc.getText()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSonuc.setText(etSonuc.getText()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSonuc.setText(etSonuc.getText()+"4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSonuc.setText(etSonuc.getText()+"5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSonuc.setText(etSonuc.getText()+"6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSonuc.setText(etSonuc.getText()+"7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSonuc.setText(etSonuc.getText()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSonuc.setText(etSonuc.getText()+"9");
            }
        });

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etSonuc.getText().length()!=0){
                     sayi1=Float.parseFloat(etSonuc.getText()+"");
                     toplama=true;
                     etSonuc.setText(null);
                }
            }
        });
        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etSonuc.getText().length()!=0){
                    sayi1= Float.parseFloat((etSonuc.getText()+""));
                    cikarma=true;
                    etSonuc.setText(null);
                }
            }
        });
        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etSonuc.getText().length()!=0){
                    sayi1=Float.parseFloat((etSonuc.getText()+""));
                    carpma=true;
                    etSonuc.setText(null);
                }
            }
        });
        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etSonuc.getText().length()!=0){
                    sayi1=Float.parseFloat((etSonuc.getText()+""));
                    bolme=true;
                    etSonuc.setText(null);
                }
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            private void onClick() {
                onClick();
            }
            @Override
            public void onClick(View v) {
                if(toplama || cikarma || carpma ||bolme == true ){
                    sayi2=Float.parseFloat(etSonuc.getText()+"");
                }
                if(toplama==true){
                    etSonuc.setText(sayi1+sayi2+"");
                    toplama=false;
                }
                if(cikarma==true){
                    etSonuc.setText(sayi1-sayi2+"");
                    cikarma=false;
                }
                if(carpma==true){
                    etSonuc.setText(sayi1*sayi2+"");
                    carpma=false;
                }
                if(bolme==true){
                    etSonuc.setText(sayi1/sayi2+"");
                    bolme=false;
                }
            }
        });











    }
}
