package com.N5_team.Calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class hoyeongActivity_button extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn9,btn_minus,btn_plus,btn_multiple,btn_slush,btn_result;
    EditText ed1,ed2;
    ImageView imagebutton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoyeong_button);

        ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);
        imagebutton1 = (ImageView)findViewById(R.id.imagebutton1);

        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Opne source 5팀 홧팅",Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void onMinusButtonClicked(View view) {
        String tmpEt1 = ed1.getText().toString();

        int int_ed1 = Integer.parseInt(tmpEt1);
        int result = int_ed1 - int_ed1;
        String str_result = Integer.toString(result);
        ed2.setText(str_result);
    }

    public void onPlusButtonClicked(View view) {
        String tmpEt1 = ed1.getText().toString();

        int int_ed1 = Integer.parseInt(tmpEt1);
        int result = int_ed1 + int_ed1;
        String str_result = Integer.toString(result);
        ed2.setText(str_result);
    }

    public void onMultipleButtonClicked(View view) {
        String tmpEt1 = ed1.getText().toString();

        int int_ed1 = Integer.parseInt(tmpEt1);
        int result = int_ed1 * int_ed1;
        String str_result = Integer.toString(result);
        ed2.setText(str_result);
    }

    public void onSlushButtonClicked(View view) {
        String tmpEt1 = ed1.getText().toString();

        int int_ed1 = Integer.parseInt(tmpEt1);
        int result = int_ed1 / int_ed1;
        String str_result = Integer.toString(result);
        ed2.setText(str_result);
    }


}
