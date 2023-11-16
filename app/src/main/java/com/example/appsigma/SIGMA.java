package com.example.appsigma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SIGMA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigma);

        getSupportActionBar().hide();

        TextView textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Código para navegar para outra tela
                Intent intent = new Intent(SIGMA.this, MATERIAL.class);
                startActivity(intent);
            }
        });
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Código para navegar para outra tela
                Intent intent = new Intent(SIGMA.this, materia_python.class);
                startActivity(intent);
            }
        });
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Código para navegar para outra tela
                Intent intent = new Intent(SIGMA.this, material_linux.class);
                startActivity(intent);
            }
        });


    }
}
