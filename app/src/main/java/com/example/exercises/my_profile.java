package com.example.exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class my_profile extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton signout;
    ImageButton panah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);
        signout=findViewById(R.id.signout);
        panah=findViewById(R.id.panah);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), my_profile.class));
            }
        });

        panah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), my_profile.class));
            }
        });

    }
}
