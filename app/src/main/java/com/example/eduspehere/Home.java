package com.example.eduspehere;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        ImageButton aboutbtn = findViewById(R.id.imageButton2);
        aboutbtn.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, Aboutus.class);
            startActivity(intent);
        });

        ImageButton conbtn = findViewById(R.id.imageButton4);
        conbtn.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, Contactus.class);
            startActivity(intent);
        });

        ImageButton donabtn = findViewById(R.id.imageButton3);
        donabtn.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, Donation.class);
            startActivity(intent);
        });

        ImageButton regbtn = findViewById(R.id.imageButton8);
        regbtn.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, RegisterNow.class);
            startActivity(intent);
        });

        ImageButton accbtn = findViewById(R.id.imageButton6);
        accbtn.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, MyAcc.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}