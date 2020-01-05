package com.example.happynewyear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btnTpLft;
    public Button btnTpRgt;
    public Button btnBtLft;
    public Button btnBtRgt;
    public Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //******************************** Button ********************************
        //todo Registration Button
        btnTpLft = (Button) findViewById(R.id.btnTpLft);
        btnTpLft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrationIntent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(registrationIntent);
            }
        });

        //todo Select Goddess Button
        btnTpRgt = (Button) findViewById(R.id.btnTpRgt);
        btnTpRgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goddessIntent = new Intent(MainActivity.this, WishActivity.class);
                startActivity(goddessIntent);
            }
        });

        //todo See Result Button
        btnBtLft = (Button) findViewById(R.id.btnBtLft);
        btnBtLft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(resultIntent);
            }
        });

        //todo Clear Button
        btnBtRgt = (Button) findViewById(R.id.btnBtRgt);
        btnBtRgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}
