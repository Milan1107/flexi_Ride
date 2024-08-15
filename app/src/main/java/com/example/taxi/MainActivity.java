package com.example.taxi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.*;
import android.util.*;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText mobnumber;
    Button getotp_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobnumber = findViewById(R.id.input_mobile_numer);
        getotp_btn = findViewById(R.id.btn_getotp);

        getotp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mobnumber.getText().toString().trim().isEmpty()){
                    if((mobnumber.getText().toString().trim()).length()==10){
                        Intent intent = new Intent(MainActivity.this, otpVerificationScreen.class);
                        intent.putExtra("mobile",mobnumber.getText().toString());
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(MainActivity.this,"Please enter correct number",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"Enter Mobile number",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}