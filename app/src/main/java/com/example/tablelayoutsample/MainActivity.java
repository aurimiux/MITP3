package com.example.tablelayoutsample;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {


     TextView calculatorScreen;
     TextView resultScreen;

    String workings = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTextViews();

    }

    private void initTextViews() {
        this.calculatorScreen = findViewById(R.id.calculatorScreen);
        this.resultScreen = findViewById(R.id.resultScreen);
    }

    private void setWorkings(String givenValue){

        workings = workings + givenValue;
        calculatorScreen.setText(workings);
    }

    public void equalOnClick (View view) {
        Double result = null;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        try {
            result = (double) engine.eval(workings);
        } catch (ScriptException e) {
            Toast.makeText(this,"Invalid Input", Toast.LENGTH_SHORT).show();
        }
        if(result != null)
            workings = String.valueOf(result);
            resultScreen.setText(String.valueOf(result.doubleValue()));

            calculatorScreen.setText(String.valueOf(result.doubleValue()));
    }


boolean leftBracket = true;

    public void bracketsOnClick(View view){
    if(leftBracket)
    {
        setWorkings("(");
        leftBracket = false;
    }
    else{
        setWorkings(")");
        leftBracket = true;
    }
    }

    public void backspaceOnClick (View view){
        workings = calculatorScreen.getText().toString();
        workings = workings.substring(0, workings.length() - 1);
        calculatorScreen.setText(workings);
    }

    public void cleanAllClick (View view){
        calculatorScreen.setText("");
        workings = "";
        resultScreen.setText("");
        leftBracket = true;
    }

    public String addChar(String str, String ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }


    public void putMinusPlus (View view){
        String minusPlus = calculatorScreen.getText().toString();

        if(minusPlus.startsWith("-")){
          String newStr = calculatorScreen.getText().toString().replaceFirst("-","");
          workings = newStr;
            calculatorScreen.setText(workings);
            resultScreen.setText(workings);

        }
        else{
            String newStr = calculatorScreen.getText().toString().replaceFirst("","-");
            workings = newStr;
            calculatorScreen.setText(workings);
            resultScreen.setText(workings);

        }

    }

    public void rootOnClick (View view){
        String val = calculatorScreen.getText().toString();
        double r = Math.sqrt(Double.parseDouble(val));
        workings = String.valueOf(r);
        calculatorScreen.setText(workings);
        resultScreen.setText(workings);
    }

    public void sevenOnClick (View view){
        setWorkings("7");
    }

    public void eightOnClick (View view){
        setWorkings("8");
    }

    public void nineOnClick (View view){
        setWorkings("9");
    }

    public void divisionOnClick (View view){
        setWorkings("/");
    }


    public void fourOnClick (View view){
        setWorkings("4");
    }

    public void fiveOnClick (View view){
        setWorkings("5");
    }

    public void sixOnClick (View view){
        setWorkings("6");
    }

    public void multiOnClick (View view){
        setWorkings("*");
    }


    public void threeOnClick (View view){
        setWorkings("3");
    }

    public void twoOnClick (View view){
        setWorkings("2");
    }

    public void oneOnClick (View view){
        setWorkings("1");
    }

    public void minusOnClick (View view){
        setWorkings("-");
    }

    public void plusOnClick (View view){
        setWorkings("+");
    }

    public void zeroOnClick (View view){
        setWorkings("0");
    }

    public void decimalOnClick(View view) {
        setWorkings(".");
    }
}