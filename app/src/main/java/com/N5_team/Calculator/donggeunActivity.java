package com.N5_team.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.N5_team.Calculator.databinding.ActivityDonggeunBinding;

public class donggeunActivity extends AppCompatActivity {

    boolean isFirstInput = true;
    boolean isOperatorClick = false;
    ActivityDonggeunBinding activityDonggeunBinding;
    double resultNumber = 0;
    double inputNumber = 0;
    String operator = "=";
    String lastOperator = "+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        activityDonggeunBinding = ActivityDonggeunBinding.inflate(getLayoutInflater());
        setContentView(activityDonggeunBinding.getRoot());
    }
    public void numButtonClick(View view) {

        if (isFirstInput) {
            activityDonggeunBinding.resultTextView.setText(view.getTag().toString());
            isFirstInput = false;
            if(operator.equals("=")){
                activityDonggeunBinding.mathTextVew.setText(null);
                isOperatorClick = false;
            }
        } else {
            if (activityDonggeunBinding.resultTextView.getText().toString().equals("0")) {
                Toast.makeText(this, "0으로 시작되는 숫자는 없습니다.", Toast.LENGTH_SHORT).show();
                isFirstInput = true;
            } else {
                activityDonggeunBinding.resultTextView.append(view.getTag().toString());
            }

        }
    }

    public void allClearButtonClick(View view){
        activityDonggeunBinding.resultTextView.setText("0");
        activityDonggeunBinding.mathTextVew.setText("");
        resultNumber = 0;
        operator = "=";
        isFirstInput = true;
        isOperatorClick = false;
    }

    public void pointButtonClick(View view){

        if(isFirstInput){
            activityDonggeunBinding.resultTextView.append("0" + view.getTag().toString());
            isFirstInput = false;
        }else {
            if(activityDonggeunBinding.resultTextView.getText().toString().contains(".")){
                Toast.makeText(this, "이미 소숫점이 존재합니다", Toast.LENGTH_SHORT).show();
            }else {
                activityDonggeunBinding.resultTextView.append(view.getTag().toString());
            }

        }

    }

    public void OpratorClick(View view){
        isOperatorClick = true;
        lastOperator = view.getTag().toString();
        if(isFirstInput){
            if(operator.equals("=")){
                operator = view.getTag().toString();
                resultNumber = Double.parseDouble(activityDonggeunBinding.resultTextView.getText().toString());
                activityDonggeunBinding.mathTextVew.setText(resultNumber + " " + operator + " ");
            }else{
                operator = view.getTag().toString();
                String getMathText = activityDonggeunBinding.mathTextVew.getText().toString();
                String subString = getMathText.substring(0, getMathText.length() - 2);
                activityDonggeunBinding.mathTextVew.setText(subString);
                activityDonggeunBinding.mathTextVew.append(operator + " ");
            }
        }else{
            inputNumber = Double.parseDouble(activityDonggeunBinding.resultTextView.getText().toString());

            resultNumber = calculator(resultNumber, inputNumber, operator);

            activityDonggeunBinding.resultTextView.setText(String.valueOf(resultNumber));
            isFirstInput = true;
            operator = view.getTag().toString();
            activityDonggeunBinding.mathTextVew.append(inputNumber + " " + operator + " ");
        }
    }

    public void equalsButtonClick(View view){
        if(isFirstInput){
            if(isOperatorClick) {
                activityDonggeunBinding.mathTextVew.setText(resultNumber + " " + lastOperator + " " + inputNumber + " =");
                resultNumber = calculator(resultNumber, inputNumber, lastOperator);
                activityDonggeunBinding.resultTextView.setText(String.valueOf(resultNumber));
            }
        }else {
            inputNumber = Double.parseDouble(activityDonggeunBinding.resultTextView.getText().toString());

            resultNumber = calculator(resultNumber, inputNumber, operator);
            activityDonggeunBinding.resultTextView.setText(String.valueOf(resultNumber));
            isFirstInput = true;
            operator = view.getTag().toString();
            activityDonggeunBinding.mathTextVew.append(inputNumber + " " + operator + " ");
        }
    }
    public void backspaceButtonClick(View view){
        if(!isFirstInput){
            String getResulttext = activityDonggeunBinding.resultTextView.getText().toString();
            if(getResulttext.length() > 1){
                String subString = getResulttext.substring(0, getResulttext.length() -1);
                activityDonggeunBinding.resultTextView.setText(subString);
            }else{
                activityDonggeunBinding.resultTextView.setText("0");
                isFirstInput = true;
            }
        }

    }
    public void PercentButtonClick(View view){

    }

    private double calculator(double resultNumber, double inputNumber, String operator)  {
        switch (operator){
            case "=":
                resultNumber = inputNumber;
                break;
            case "+":
                resultNumber = resultNumber + inputNumber;
                break;
            case "-":
                resultNumber = resultNumber - inputNumber;
                break;
            case "×":
                resultNumber = resultNumber * inputNumber;
                break;
            case "÷":
                resultNumber = resultNumber / inputNumber;
                break;
            default:
                Log.e("calculator",resultNumber + " " + inputNumber + " "  + operator);
                break;
        }
        return resultNumber;
    }
}