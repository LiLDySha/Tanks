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

public class photoTanksFiveActivity extends AppCompatActivity {

    Button is1_btn, is2_btn, type59_btn, c2c1_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_photo_tanks_five);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        type59_btn = findViewById(R.id.type59_btn);
        is2_btn = findViewById(R.id.is2_btn);
        c2c1_btn = findViewById(R.id.c2c1_btn);
        is1_btn = findViewById(R.id.is1_btn);

        type59_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(photoTanksFiveActivity.this, photoTanksLastWindow.class);
                startActivity(intent);
                ScoreManager.increaseScore(15);
            }
        });

        is2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        c2c1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        is1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });
    }

    public void Failed (){
        Toast.makeText(this, "Неверно! Попробуйте еще раз ", Toast.LENGTH_SHORT).show();
    }
}