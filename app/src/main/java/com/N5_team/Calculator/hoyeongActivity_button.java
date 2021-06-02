package com.N5_team.Calculator;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class hoyeongActivity_button extends AppCompatActivity {


    private Button btn_back,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn_minus,btn_plus,btn_multiple,btn_slush,btn_result,btn_clear;
    private TextView ed1;
    private EditText ed2;
    private ImageView imagebutton1;
    private int a;
    private int where=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_hoyeong_button);

        btn_back = (Button)findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        imagebutton1 = (ImageView)findViewById(R.id.imagebutton1);

        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opne source 5팀 홧팅", Toast.LENGTH_SHORT).show();
            }
        });


        ed1 = (TextView)findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        btn_plus = (Button)findViewById(R.id.btn_plus);
        btn_minus = (Button)findViewById(R.id.btn_minus);
        btn_multiple = (Button)findViewById(R.id.btn_multiple);
        btn_result = (Button)findViewById(R.id.btn_result);
        btn_slush = (Button)findViewById(R.id.btn_slush);
        btn_clear = (Button)findViewById(R.id.btn_clear);


        OnClickListener cl = new OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==btn1){
                    ed1.setText(ed1.getText().toString()+1);
                }
                else if (v==btn2){
                    ed1.setText(ed1.getText().toString()+2);
                }
                else if (v==btn3){
                    ed1.setText(ed1.getText().toString()+3);
                }
                else if (v==btn4){
                    ed1.setText(ed1.getText().toString()+4);
                }
                else if (v==btn5){
                    ed1.setText(ed1.getText().toString()+5);
                }
                else if (v==btn6){
                    ed1.setText(ed1.getText().toString()+6);
                }
                else if (v==btn7){
                    ed1.setText(ed1.getText().toString()+7);
                }
                else if (v==btn8){
                    ed1.setText(ed1.getText().toString()+8);
                }
                else if (v==btn9){
                    ed1.setText(ed1.getText().toString()+9);
                }
                else if (v==btn0){
                    ed1.setText(ed1.getText().toString()+0);
                }
                else if (v==btn_plus){
                    a = Integer.valueOf(ed1.getText().toString().trim());
                    ed1.setText("");
                    where=1;
                }
                else if (v==btn_minus){
                    a = Integer.valueOf(ed1.getText().toString().trim());
                    ed1.setText("");
                    where = 2;
                }
                else if (v==btn_multiple){
                    a = Integer.valueOf(ed1.getText().toString().trim());
                    ed1.setText("");
                    where = 3;
                }
                else if (v==btn_slush){
                    a = a / Integer.valueOf(ed1.getText().toString().trim());
                    ed1.setText("");
                    where = 4;
                }


                //결과
                else if (v == btn_result) {
                    if (where == 1) {
                        a = a + Integer.valueOf(ed1.getText().toString().trim());
                        ed2.setText(Integer.toString(a));
                    }

                    else if (where == 2) {
                        a = a - Integer.valueOf(ed1.getText().toString().trim());
                        ed2.setText(Integer.toString(a));
                    }

                    else if (where == 3) {
                        a = a * Integer.valueOf(ed1.getText().toString().trim());
                        ed2.setText(Integer.toString(a));
                    }

                    else if (where == 4) {
                        a = a / Integer.valueOf(ed1.getText().toString().trim());
                        ed2.setText(Integer.toString(a));
                    }
                }

                else if (v==btn_clear){
                    ed1.setText("");
                    ed2.setText("");
                }

            }
        };

        btn0.setOnClickListener(cl);
        btn1.setOnClickListener(cl);
        btn2.setOnClickListener(cl);
        btn3.setOnClickListener(cl);
        btn4.setOnClickListener(cl);
        btn5.setOnClickListener(cl);
        btn6.setOnClickListener(cl);
        btn7.setOnClickListener(cl);
        btn8.setOnClickListener(cl);
        btn9.setOnClickListener(cl);

        btn_clear.setOnClickListener(cl);
        btn_plus.setOnClickListener(cl);
        btn_slush.setOnClickListener(cl);
        btn_multiple.setOnClickListener(cl);
        btn_result.setOnClickListener(cl);
        btn_minus.setOnClickListener(cl);




    }



}




