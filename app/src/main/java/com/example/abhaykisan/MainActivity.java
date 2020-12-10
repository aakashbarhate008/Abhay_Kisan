package com.example.abhaykisan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCropRecommender;

    Button btnDiseasesIdentification;
    Button btnWeedDetection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDiseasesIdentification =  findViewById(R.id.btnDiseasesIdentification);
        btnCropRecommender = findViewById(R.id.btnCropRecommender);
        btnWeedDetection = findViewById(R.id.btnWeedDetection);

        btnDiseasesIdentification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,TakeSnap.class);
                startActivity(i);

            }
        });

        btnCropRecommender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,CropRecommendation.class);
                startActivity(i);

            }
        });

        btnWeedDetection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,TakeSnap.class);
                startActivity(i);

            }
        });

    }
}
