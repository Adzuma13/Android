package com.example.firstproject;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_task);

    }


    @Override
    public void onClick(View v) {
        int num1, num2, res;
        String strNum1, strNum2;
        TextView resText;
        EditText text1;
        EditText text2;

        switch (v.getId()) {
            case R.id.btnPlus:
                text1 = findViewById(R.id.Num1);
                text2 = findViewById(R.id.Num2);
                resText = findViewById(R.id.Result);
                strNum1 = text1.getText().toString();
                strNum2 = text2.getText().toString();

                if (!strNum1.equals("") && !strNum2.equals("")) {
                    num1 = Integer.valueOf(strNum1);
                    num2 = Integer.valueOf(strNum2);
                    res = num1 + num2;
                    resText.setText(Integer.toString(res));
                } else {
                    Toast.makeText(this, "Введите числа", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnMinus:
                text1 = findViewById(R.id.Num1);
                text2 = findViewById(R.id.Num2);
                resText = findViewById(R.id.Result);

                strNum1 = text1.getText().toString();
                strNum2 = text2.getText().toString();

                if (!strNum1.equals("") && !strNum2.equals("")) {
                    num1 = Integer.valueOf(strNum1);
                    num2 = Integer.valueOf(strNum2);
                    res = num1 - num2;
                    resText.setText(Integer.toString(res));
                } else {
                    Toast.makeText(this, "Введите числа", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnClear:
                text1 = findViewById(R.id.Num1);
                text1.setText(null);
                text2 = findViewById(R.id.Num2);
                text2.setText(null);
                resText = findViewById(R.id.Result);
                resText.setText(null);
                break;

        }
    }
}
