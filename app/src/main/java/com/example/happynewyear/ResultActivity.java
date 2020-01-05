package com.example.happynewyear;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    public TextView txtName;
    public TextView txtWish;
    public Button btnOK;
    private static DataService service = DataService.getInstance();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //******************************** Text View ********************************
        txtName = (TextView) findViewById(R.id.txtName);
        txtWish = (TextView) findViewById(R.id.txtWish) ;

        txtName.setText(service.getFirstname() + " " + service.getLastname());
        txtWish.setText(service.getWish());

        //******************************** Button ********************************
        btnOK = (Button) findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
