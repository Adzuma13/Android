package com.example.firstproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class Login_in_app extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        createAcc createAcc = new createAcc();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in_app);

        EditText editLogin = findViewById(R.id.editLogin);
        EditText editPass = findViewById(R.id.editPassword);


        Button btnLogin;
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editLogin.getText().toString().equals("test")) && (editPass.getText().toString().equals("test"))){
                    Intent intent = new Intent(v.getContext(), FAB.class);
                    startActivity(intent);
                    editLogin.setText(null);
                    editPass.setText(null);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),"НЕВЕРНЫЙ ПАРОЛЬ ИЛИ ЛОГИН", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });




        TextView textView = findViewById(R.id.forgetPass);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Forgot_pass.class);
                startActivity(intent);
            }
        });

        FloatingActionButton fab = findViewById(R.id.supportBtn);
        fab.setOnClickListener(v -> {
            Snackbar snack = Snackbar.make(v,"",Snackbar.LENGTH_INDEFINITE);
            View sbView = snack.getView();
            sbView.setBackgroundColor(R.color.colorAquamarine);
            snack.show();
            snack.setAction("Support", v2 -> {
                snack.dismiss();
                Intent intent = new Intent(v2.getContext(), Numbers_supports.class);
                startActivity(intent);
            });
        });
    }
}
