package com.example.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class createAcc extends AppCompatActivity {
    static HashMap<String, String> createAcc1 = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acc);
        Button btnCreateAcc = findViewById(R.id.newCreateAcc);
        btnCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText newLogin = findViewById(R.id.newLogin);
                EditText newPas = findViewById(R.id.newPas);
                createAcc1.put(newLogin.getText().toString(), newPas.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(),"Account Create",Toast.LENGTH_LONG);
                Intent intent = new Intent(v.getContext(),Login_in_app.class);
                startActivity(intent);
            }
        });


    }
}
