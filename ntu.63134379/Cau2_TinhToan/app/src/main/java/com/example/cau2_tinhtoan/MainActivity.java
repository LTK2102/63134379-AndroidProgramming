package com.example.cau2_tinhtoan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0;
    Button btbang,btcong,bttru,btnhan,btchia,btdot,btc,btce;
    TextView mainsrceen,secondscreen;
    String TinhToan;
    String pheptoan;
    boolean checkDot=false, checkBang=false;
    double so1, so2, ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondscreen.setText("");
                mainsrceen.setText("");
                TinhToan = "";
                pheptoan = "";
                checkDot = false;
                checkBang = false;
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    TinhToan = mainsrceen.getText().toString();
                    mainsrceen.setText(TinhToan + "0");
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    TinhToan = mainsrceen.getText().toString();
                    mainsrceen.setText(TinhToan + "1");
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    TinhToan = mainsrceen.getText().toString();
                    mainsrceen.setText(TinhToan + "2");
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    TinhToan = mainsrceen.getText().toString();
                    mainsrceen.setText(TinhToan + "3");
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    TinhToan = mainsrceen.getText().toString();
                    mainsrceen.setText(TinhToan + "4");
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    TinhToan = mainsrceen.getText().toString();
                    mainsrceen.setText(TinhToan + "5");
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    TinhToan = mainsrceen.getText().toString();
                    mainsrceen.setText(TinhToan + "6");
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    TinhToan = mainsrceen.getText().toString();
                    mainsrceen.setText(TinhToan + "7");
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    TinhToan = mainsrceen.getText().toString();
                    mainsrceen.setText(TinhToan + "8");
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    TinhToan = mainsrceen.getText().toString();
                    mainsrceen.setText(TinhToan + "9");
                }
            }
        });
        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    if(!checkDot){
                        TinhToan = mainsrceen.getText().toString();
                        mainsrceen.setText(TinhToan + ".");
                        checkDot=true;
                    }
                }
            }
        });

        btcong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        }
    }

    protected void anhxa()
    {
        bt0 = findViewById(R.id.so0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        btdot = findViewById(R.id.btdot);
        btbang = findViewById(R.id.btbang);
        btcong = findViewById(R.id.btcong);
        bttru = findViewById(R.id.bttru);
        btchia = findViewById(R.id.btchia);
        btnhan = findViewById(R.id.btnhan);
        btce = findViewById(R.id.btce);
        btc = findViewById(R.id.btc);
        mainsrceen = findViewById(R.id.man_hinh);
        secondscreen = findViewById(R.id.man_hinh_phu);
    }
}