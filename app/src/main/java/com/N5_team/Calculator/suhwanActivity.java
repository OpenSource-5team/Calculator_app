package com.N5_team.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class suhwanActivity extends AppCompatActivity {
    private EditText SalaryEditText, SalaryEditText2, SalaryEditText3;
    private Button calculateSal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhwan);

        SalaryEditText = (EditText)findViewById(R.id.SalaryEditText);
        SalaryEditText2 = (EditText)findViewById(R.id.SalaryEditText2);
        SalaryEditText3 = (EditText)findViewById(R.id.SalaryEditText3);

        calculateSal = (Button) findViewById(R.id.button001);
        calculateSal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), suhwanActivity2.class);

                long AllSalary = Long.parseLong(SalaryEditText.getText().toString());
                int family = Integer.parseInt(SalaryEditText2.getText().toString());
                int kid = Integer.parseInt(SalaryEditText3.getText().toString());

                Bundle bundle = new Bundle();
                bundle.putLong("AllSalary",AllSalary);
                bundle.putInt("family",family);
                bundle.putInt("kid",kid);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

}
