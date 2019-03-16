package com.example.firstproject;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @SuppressLint("WrongViewCast")
    @Override
    public void onClick(View v) {
        int num1, num2, res;
        TextView resText;
        EditText text1;
        EditText text2;

        switch (v.getId()) {
            case R.id.btn1:
                text1 = (EditText) findViewById(R.id.Num1);
                text2 = (EditText) findViewById(R.id.Num2);
                resText = (TextView) findViewById(R.id.Result);

                num1 = Integer.valueOf(text1.getText().toString());
                num2 = Integer.valueOf(text2.getText().toString());
                res = num1 + num2;
                resText.setText(Integer.toString(res));
                break;
            case R.id.btn2:
                text1 = (EditText) findViewById(R.id.Num1);
                text2 = (EditText) findViewById(R.id.Num2);
                resText = (TextView) findViewById(R.id.Result);

                num1 = Integer.valueOf(text1.getText().toString());
                num2 = Integer.valueOf(text2.getText().toString());
                res = num1 - num2;
                resText.setText(Integer.toString(res));
                break;
            case R.id.btn3:
                text1 = (EditText) findViewById(R.id.Num1);
                text1.setText(null);
                text2 = (EditText) findViewById(R.id.Num2);
                text2.setText(null);
                resText = (TextView) findViewById(R.id.Result);
                resText.setText(null);
                break;

        }
    }
}
