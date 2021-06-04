package com.N5_team.Calculator;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class HoyeongActivity extends AppCompatActivity {


    Button clear_button,result_button,change;
    EditText edit1,edit2,edit3;
    ImageView imagebutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_hoyeong);

        clear_button = (Button)findViewById(R.id.clear_button);
        result_button = (Button)findViewById(R.id.result_button);

        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);
        edit3 = (EditText)findViewById(R.id.edit3);




        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
            }
        });

        imagebutton1 = (ImageView) findViewById(R.id.imagebutton1);

        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"오픈소스5팀홧팅",Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void onDivButtonClicked(View view) {
        String tmpEt1 = edit1.getText().toString();
        String tmpEt2 = edit2.getText().toString();

        double double_edit1 = Integer.parseInt(tmpEt1);
        double double_edit2 = Integer.parseInt(tmpEt2);

        double_edit2 = double_edit2 / 100;


        double result = double_edit1 - (double_edit1 * double_edit2) ;
        String str_result = Integer.toString((int) result);
        edit3.setText(str_result);

    }


}
