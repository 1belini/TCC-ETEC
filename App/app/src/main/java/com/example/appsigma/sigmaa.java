package com.example.appsigma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sigmaa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigmaa);

        getSupportActionBar().hide();

        TextView textView = findViewById(R.id.textView);


        String texto = getIntent().getStringExtra("texto");
        textView.setText(texto);




    }
}