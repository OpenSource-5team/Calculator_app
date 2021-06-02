package com.N5_team.Calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class hojinActivity extends AppCompatActivity {
    TextView Bmiresult;
    EditText Height;
    EditText Weight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_hojin);
        Bmiresult = (TextView)findViewById(R.id.bmiresult1);
        Height = (EditText)findViewById(R.id.height1);
        Weight = (EditText)findViewById(R.id.weight1);
        Button button1=(Button) findViewById(R.id.button1);
        Button button2=(Button) findViewById(R.id.button2);
        button2.setVisibility(View.INVISIBLE); // 화면에 안보이게 한다.
        Intent intent = new Intent(hojinActivity.this, BmiResultActivty.class);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "결과가 눌러졌습니다.", Toast.LENGTH_LONG).show();
                String strNum = Height.getText().toString();
                double height = Integer.parseInt(strNum);
                strNum = Weight.getText().toString();
                double weight = Integer.parseInt(strNum);
                double result = weight / height / height * 10000;
                strNum = String.format("%.2f", result);
                Bmiresult.setText(strNum);
                button2.setVisibility(View.VISIBLE); // 화면에 보이게 한다.
                intent.putExtra("bmi", result);
            }
        });


        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "상세보기가 눌러졌습니다.", Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        } );
    }
}