package com.example.tablelayoutsample;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private TextView calculatorScreen;
    private TextView resultScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.calculatorScreen = findViewById(R.id.calculatorScreen);
        this.resultScreen = findViewById(R.id.resultScreen);

    }

    //private void updateText(String strToAdd){
    //calculatorScreen.setText(R.string.zero);


    //}

    public void equalOnClick (View view) {

    }

    public void mC (View view){
    }

    public void mR (View view){
    }

    public void mS (View view){
    }

    public void mPlus (View view){

    }

    public void mMinus (View view){
    }

    public void cleanOneClick (View view){

    }

    public void cleanOnClick (View view){
        calculatorScreen.setText("");
        resultScreen.setText("");
    }

    public void putMinusPlus (View view){
    }

    public void rootOnClick (View view){
    }

    public void sevenOnClick (View view){


    }

    public void eightOnClick (View view){


    }

    public void nineOnClick (View view){


    }

    public void divisionOnClick (View view){
    }


    public void procentOnClick (View view){
    }

    public void fourOnClick (View view){

    }

    public void fiveOnClick (View view){

    }

    public void sixOnClick (View view){

    }

    public void multiOnClick (View view){
    }

    public void oneDividedXOnClick (View view){
    }

    public void threeOnClick (View view){

    }

    public void twoOnClick (View view){

    }

    public void oneOnClick (View view){

    }

    public void minusOnClick (View view){

    }

    public void plusOnClick (View view){
    }

    public void zeroOnClick (View view){
        calculatorScreen.setText(R.string.zero);
    }



}