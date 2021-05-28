package com.N5_team.Calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class hoyeongActivity extends AppCompatActivity {


    Button clear_button,result_button;
    EditText edit1,edit2,edit3;
    ImageView imagebutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        int int_edit1 = Integer.parseInt(tmpEt1);
        int int_edit2 = Integer.parseInt(tmpEt2);

        int result = int_edit1 - (int_edit1 / int_edit2) ;
        String str_result = Integer.toString(result);
        edit3.setText(str_result);
    }
}
