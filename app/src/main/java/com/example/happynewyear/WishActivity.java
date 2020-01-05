package com.example.happynewyear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;

public class WishActivity extends AppCompatActivity {

    public Button btnBls;
    public Button btnBack;
    public Switch swIshtar;
    public Switch swEreshkigal;
    public RadioButton radIshtar;
    public RadioButton radEreshkigal;
    private static DataService service = DataService.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish);

        //******************************** Radio Button ********************************
        radIshtar = (RadioButton) findViewById(R.id.radIshtar);
        radEreshkigal = (RadioButton) findViewById(R.id.radEreshkigal);

        //******************************** Switch ********************************
        //todo Ishtar Image On
        swIshtar = (Switch) findViewById(R.id.swIshtar);
        swIshtar.setChecked(false);
        swIshtar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //******************************** Ishtar ********************************
                ImageView ishtar = (ImageView) findViewById(R.id.imgIshtar);
                if (isChecked) {
                    ishtar.setVisibility(View.VISIBLE);
                } else {
                    ishtar.setVisibility(View.INVISIBLE);
                }
            }
        });

        //todo Ereshkgikal Image On
        swEreshkigal = (Switch) findViewById(R.id.swEreshkigal);
        swEreshkigal.setChecked(false);
        swEreshkigal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //******************************** Ereshkigal ********************************
                ImageView ereshkigal = (ImageView) findViewById(R.id.imgEreshkigal);
                if (isChecked) {
                    ereshkigal.setVisibility(View.VISIBLE);
                } else {
                    ereshkigal.setVisibility(View.INVISIBLE);
                }
            }
        });

        //******************************** Button ********************************
        btnBls = (Button) findViewById(R.id.btnBls);
        btnBls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo Import Data Store Class to collect wish
                if (radIshtar.isChecked()) {
                    service.setWish("Happy New Year !!! Whoa... I know what to do " +
                            "I wish you have success in your love. I can guarantee my wish will be success " +
                            "Because I'm absolutely goddess of love");
                    finish();
                } else if (radEreshkigal.isChecked()) {
                    service.setWish("Happy New Year !!! Hmmm... I'm so surprise you choose me " +
                            "Then I wish you have be success in your career as you wish. I don't know much about career " +
                            "But I hope you enjoy it");
                    finish();
                }
            }
        });

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
