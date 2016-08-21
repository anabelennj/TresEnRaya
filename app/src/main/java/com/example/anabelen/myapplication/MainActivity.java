package com.example.anabelen.myapplication;

import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;
import android.content.Intent;

import java.io.*;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    DataBase db;

    int valor = 1;

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DataBase(this);

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button reiniciar = (Button) findViewById(R.id.Reiniciar);
        Button resultados = (Button) findViewById(R.id.Resultados);

        final TextView text = (TextView) findViewById(R.id.textView);
        final TextView text2 = (TextView) findViewById(R.id.textView2);
        final TextView text3 = (TextView) findViewById(R.id.textView3);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        reiniciar.setOnClickListener(this);
        resultados.setOnClickListener(this);

        text.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);
        text3.setVisibility(View.INVISIBLE);
    }


    @Override
    public void onClick(View v) {

        final Button testButton = (Button) findViewById(R.id.button);
        final Button testButton2 = (Button) findViewById(R.id.button2);
        final Button testButton3 = (Button) findViewById(R.id.button3);
        final Button testButton4 = (Button) findViewById(R.id.button4);
        final Button testButton5 = (Button) findViewById(R.id.button5);
        final Button testButton6 = (Button) findViewById(R.id.button6);
        final Button testButton7 = (Button) findViewById(R.id.button7);
        final Button testButton8 = (Button) findViewById(R.id.button8);
        final Button testButton9 = (Button) findViewById(R.id.button9);

        final TextView text = (TextView) findViewById(R.id.textView);
        final TextView text2 = (TextView) findViewById(R.id.textView2);
        final TextView text3 = (TextView) findViewById(R.id.textView3);

        switch(v.getId()) {
            case R.id.button:
                testButton.setTag(valor);
                testButton.setText("");

                final int status =(Integer) v.getTag();
                if(status % 2 != 0) {
                    testButton.setText("X");
                    testButton.setClickable(false);
                    ++valor;
                } else {
                    testButton.setText("O");
                    testButton.setClickable(false);
                    ++valor;
                }
                break;

            
            case R.id.button2:
                testButton2.setTag(valor);
                testButton2.setText("");

                final int status2 =(Integer) v.getTag();
                if(status2 % 2 != 0) {
                    testButton2.setText("X");
                    testButton2.setClickable(false);
                    ++valor;
                } else {
                    testButton2.setText("O");
                    testButton2.setClickable(false);
                    ++valor;
                }
                break;

            case R.id.button3:
                testButton3.setTag(valor);
                testButton3.setText("");

                final int status3 =(Integer) v.getTag();
                if(status3 % 2 != 0) {
                    testButton3.setText("X");
                    testButton3.setClickable(false);
                    ++valor;
                } else {
                    testButton3.setText("O");
                    testButton3.setClickable(false);
                    ++valor;
                }
                break;

            case R.id.button4:
                testButton4.setTag(valor);
                testButton4.setText("");

                final int status4 =(Integer) v.getTag();
                if(status4 % 2 != 0) {
                    testButton4.setText("X");
                    testButton4.setClickable(false);
                    ++valor;
                } else {
                    testButton4.setText("O");
                    testButton4.setClickable(false);
                    ++valor;
                }
                break;

            case R.id.button5:
                testButton5.setTag(valor);
                testButton5.setText("");

                final int status5 =(Integer) v.getTag();
                if(status5 % 2 != 0) {
                    testButton5.setText("X");
                    testButton5.setClickable(false);
                    ++valor;
                } else {
                    testButton5.setText("O");
                    testButton5.setClickable(false);
                    ++valor;
                }
                break;

            case R.id.button6:
                testButton6.setTag(valor);
                testButton6.setText("");

                final int status6 =(Integer) v.getTag();
                if(status6 % 2 != 0) {
                    testButton6.setText("X");
                    testButton6.setClickable(false);
                    ++valor;
                } else {
                    testButton6.setText("O");
                    testButton6.setClickable(false);
                    ++valor;
                }
                break;

            case R.id.button7:
                testButton7.setTag(valor);
                testButton7.setText("");

                final int status7 =(Integer) v.getTag();
                if(status7 % 2 != 0) {
                    testButton7.setText("X");
                    testButton7.setClickable(false);
                    ++valor;
                } else {
                    testButton7.setText("O");
                    testButton7.setClickable(false);
                    ++valor;
                }
                break;

            case R.id.button8:
                testButton8.setTag(valor);
                testButton8.setText("");

                final int status8 =(Integer) v.getTag();
                if(status8 % 2 != 0) {
                    testButton8.setText("X");
                    testButton8.setClickable(false);
                    ++valor;
                } else {
                    testButton8.setText("O");
                    testButton8.setClickable(false);
                    ++valor;
                }
                break;

            case R.id.button9:
                testButton9.setTag(valor);
                testButton9.setText("");

                final int status9 =(Integer) v.getTag();
                if(status9 % 2 != 0) {
                    testButton9.setText("X");
                    testButton9.setClickable(false);
                    ++valor;
                } else {
                    testButton9.setText("O");
                    testButton9.setClickable(false);
                    ++valor;
                }
                break;

            case R.id.Reiniciar:
                Intent intent = getIntent();
                finish();
                startActivity(intent);    default:
                break;

            case R.id.Resultados:
                Cursor resultado = db.getAllData();
                if(resultado.getCount() == 0) {
                    showMessage("Error","Resultado no disponible");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while(resultado.moveToNext()) {
                    buffer.append("Ganador: "+ resultado.getString(0)+"\n");
                    buffer.append("Pasos: "+ resultado.getString(1)+"\n\n");
                }

                showMessage("Resultados",buffer.toString());

                break;
        }

        String test = "X";
        String test2 = "O";
        String test3 = "";


        if(test.equals(testButton.getText()) && test.equals(testButton2.getText()) && test.equals(testButton3.getText()) ||
                test.equals(testButton.getText()) && test.equals(testButton4.getText()) && test.equals(testButton7.getText()) ||
                test.equals(testButton.getText()) && test.equals(testButton5.getText()) && test.equals(testButton9.getText()) ||

                test.equals(testButton2.getText()) && test.equals(testButton5.getText()) && test.equals(testButton8.getText()) ||

                test.equals(testButton3.getText()) && test.equals(testButton6.getText()) && test.equals(testButton9.getText()) ||
                test.equals(testButton3.getText()) && test.equals(testButton5.getText()) && test.equals(testButton7.getText())
                ) {
            text.setVisibility(View.VISIBLE);

            if(test3.equals(testButton.getText())){
                testButton.setClickable(false);
            }
            if(test3.equals(testButton2.getText())){
                testButton2.setClickable(false);
            }
            if(test3.equals(testButton3.getText())){
                testButton3.setClickable(false);
            }
            if(test3.equals(testButton4.getText())){
                testButton4.setClickable(false);
            }
            if(test3.equals(testButton5.getText())){
                testButton5.setClickable(false);
            }
            if(test3.equals(testButton6.getText())){
                testButton6.setClickable(false);
            }
            if(test3.equals(testButton7.getText())){
                testButton7.setClickable(false);
            }
            if(test3.equals(testButton8.getText())){
                testButton8.setClickable(false);
            }
            if(test3.equals(testButton9.getText())){
                testButton9.setClickable(false);
            }
        }


        if(test2.equals(testButton.getText()) && test2.equals(testButton2.getText()) && test2.equals(testButton3.getText()) ||
                test2.equals(testButton.getText()) && test2.equals(testButton4.getText()) && test2.equals(testButton7.getText()) ||
                test2.equals(testButton.getText()) && test2.equals(testButton5.getText()) && test2.equals(testButton9.getText()) ||

                test2.equals(testButton2.getText()) && test2.equals(testButton5.getText()) && test2.equals(testButton8.getText()) ||

                test2.equals(testButton3.getText()) && test2.equals(testButton6.getText()) && test2.equals(testButton9.getText()) ||
                test2.equals(testButton3.getText()) && test2.equals(testButton5.getText()) && test2.equals(testButton7.getText())
                ) {
            text2.setVisibility(View.VISIBLE);

            if(test3.equals(testButton.getText())){
                testButton.setClickable(false);
            }
            if(test3.equals(testButton2.getText())){
                testButton2.setClickable(false);
            }
            if(test3.equals(testButton3.getText())){
                testButton3.setClickable(false);
            }
            if(test3.equals(testButton4.getText())){
                testButton4.setClickable(false);
            }
            if(test3.equals(testButton5.getText())){
                testButton5.setClickable(false);
            }
            if(test3.equals(testButton6.getText())){
                testButton6.setClickable(false);
            }
            if(test3.equals(testButton7.getText())){
                testButton7.setClickable(false);
            }
            if(test3.equals(testButton8.getText())){
                testButton8.setClickable(false);
            }
            if(test3.equals(testButton9.getText())){
                testButton9.setClickable(false);
            }
        }

        if(text.getVisibility() == View.VISIBLE && text2.getVisibility() == View.INVISIBLE)
            db.insertData("Jugador 1",valor);
        else
            if(text2.getVisibility() == View.VISIBLE && text.getVisibility() == View.INVISIBLE)
                db.insertData("Jugador 2",valor);

        if(valor == 10){
            if (text.getVisibility() == View.INVISIBLE && text2.getVisibility() == View.INVISIBLE) {
                text3.setVisibility(View.VISIBLE);
                db.insertData("Desconocido",0);
            }
        }
    }
}