package com.example.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        //login in app починить TextView

//--------------------------------------------------------------- Login APP
        Button log_in = findViewById(R.id.log_in);
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(v.getContext(), Login_in_app.class);
                startActivity(intent);
            }
        });

//--------------------------------------------------------------- Create Account
        Button createAcc = findViewById(R.id.createAcc);
        createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(v.getContext(), createAcc.class);
                startActivity(intent);
            }
        });

    }

//        FloatingActionButton fab = findViewById(R.id.cirleButton);
//        fab.setOnClickListener(v -> {
//                @SuppressLint("ResourceType") final Snackbar snack = Snackbar.make(v,R.id.forgetPas,Snackbar.LENGTH_INDEFINITE);
//                snack.show();
//                snack.setAction("другая страница", v2 -> {
//                    snack.dismiss();
//                    Intent intent = new Intent(v2.getContext(), Main2Activity.class);
//                    startActivity(intent);
//                });
//        });
//    }

}

