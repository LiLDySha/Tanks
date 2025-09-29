package com.example.maybemygame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class photoTanksOneActivity extends AppCompatActivity {

    Button tiger_btn, su75_btn, m18_btn, t3485_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_photo_tanks_one);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tiger_btn = findViewById(R.id.tiger_btn);
        su75_btn = findViewById(R.id.su75_btn);
        m18_btn = findViewById(R.id.m18_btn);
        t3485_btn = findViewById(R.id.t3485_btn);

        tiger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        m18_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        su75_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        t3485_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(photoTanksOneActivity.this, photoTanksTwoActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(15);
            }
        });
    }
    public void Failed (){
        Toast.makeText(this, "Неверно! Попробуйте еще раз ", Toast.LENGTH_SHORT).show();
    }

}