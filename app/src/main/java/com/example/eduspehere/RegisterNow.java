package com.example.eduspehere;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register_now);
        View Homer = findViewById(R.id.imageView18);
        Homer.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterNow.this, Home.class);
            startActivity(intent);
        });
        View Myacco = findViewById(R.id.imageView20);
        Myacco.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterNow.this, MyAcc.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}