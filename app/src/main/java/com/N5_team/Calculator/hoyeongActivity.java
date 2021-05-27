package com.N5_team.Calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hoyeongActivity extends AppCompatActivity {

    Button btn_1,btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoyeong);

        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                hoyeongfragmenta activity_hoyeong1 = new hoyeongfragmenta();
                transaction.replace(R.id.frame,activity_hoyeong1);
                transaction.commit();

            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                hoyeongfragmentb activity_hoyeong2 = new hoyeongfragmentb();
                transaction.replace(R.id.frame,activity_hoyeong2);
                transaction.commit();

            }
        });
    }
}