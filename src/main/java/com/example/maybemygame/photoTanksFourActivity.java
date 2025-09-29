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

public class photoTanksFourActivity extends AppCompatActivity {

    Button leclerc_btn, maus_btn, panther_btn, stug_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_photo_tanks_four);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        leclerc_btn = findViewById(R.id.leclerc_btn);
        maus_btn = findViewById(R.id.maus_btn);
        panther_btn = findViewById(R.id.panther_btn);
        stug_btn = findViewById(R.id.stug_btn);


        leclerc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(photoTanksFourActivity.this, photoTanksFiveActivity.class);
                startActivity(intent);
                ScoreManager.increaseScore(15);
            }
        });

        maus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        panther_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Failed();
                ScoreManager.minusScore(5);
            }
        });

        stug_btn.setOnClickListener(new View.OnClickListener() {
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