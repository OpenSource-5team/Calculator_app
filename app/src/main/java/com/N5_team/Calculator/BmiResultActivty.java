package com.N5_team.Calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class BmiResultActivty extends AppCompatActivity {
    TextView textView2;
    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_bmi_result_activty);
        textView2 = (TextView) findViewById(R.id.bmiresult);
        textView3 = (TextView) findViewById(R.id.bmiresult2);


        Intent secondIntent = getIntent();
        secondIntent.getDoubleExtra("bmi", 0);
        double to = secondIntent.getDoubleExtra("bmi", 0);


        String asd = String.format("%.2f", to);
        textView2.setText(asd);


        if (to < 18.5) {
            textView3.setText("저체중");
        } else if (18.5 <= to && to < 23) {
            textView3.setText("  정상");
        } else if (23 <= to && to < 25) {
            textView3.setText("과체중");
        } else if (25 < to) {
            textView3.setText("  비만");
        }

        Button btn1 = (Button) findViewById(R.id.home2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "뒤로가기가 눌러졌습니다.", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(BmiResultActivty.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button btn2 = (Button) findViewById(R.id.bmi_web);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "더 알아보기가 눌러졌습니다.", Toast.LENGTH_LONG).show();
                Uri uri = Uri.parse("https://www.foodsafetykorea.go.kr/portal/healthyfoodlife/bmiCalcurator.do?menu_no=3071&menu_grp=MENU_NEW03");
                Intent intent  = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
    }
}