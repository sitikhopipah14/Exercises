package com.example.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class exercises_activity extends AppCompatActivity {
    ImageButton avatar;
    ImageButton jogging;
    ImageButton yoga;
    ImageButton skipping;
    ImageButton backExercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        avatar = findViewById(R.id.avatar);
        jogging = findViewById(R.id.jogging);
        yoga = findViewById(R.id.yoga);
        skipping = findViewById(R.id.skipping);
        backExercises = findViewById(R.id.backExercises);

        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), exercises_activity.class));
            }
        });

        jogging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), exercises_activity.class));
            }
        });

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), exercises_activity.class));
            }
        });

        skipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), exercises_activity.class));
            }
        });

        backExercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), exercises_activity.class));
            }
        });

    }
}
