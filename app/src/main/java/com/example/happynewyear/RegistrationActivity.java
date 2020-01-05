package com.example.happynewyear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    public Button btnClr;
    public Button btnEnt;
    public Button btnBack;
    public EditText edtFnm;
    public EditText edtLnm;
    private static DataService service = DataService.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        //******************************** Plain Text ********************************
        //todo First Name
        edtFnm = (EditText) findViewById(R.id.edtFnm);

        //todo Last Name
        edtLnm = (EditText) findViewById(R.id.edtLnm);
        //******************************** Button ********************************
        //todo Clear Button
        btnClr = (Button) findViewById(R.id.btnClr);
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtFnm.setText("");
                edtLnm.setText("");
            }
        });

        //todo Enter Button
        btnEnt = (Button) findViewById(R.id.btnEnt);
        btnEnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo Import Data Store Class to collect name
                service.setFirstname(edtFnm.getText().toString());
                service.setLastname(edtLnm.getText().toString());
                finish();
            }
        });

        //todo Back Button
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
