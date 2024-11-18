package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private androidx.constraintlayout.widget.ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.main);
        layout.setOnClickListener(v -> {
            layout.setBackgroundColor(ChangeColors());
        });

        Log.i("OnCreate", "App created");
    }

    private int ChangeColors() {
        switch (new Random().nextInt(6)) {
            case 0:
                return ContextCompat.getColor(this, R.color.black);
            case 1:
                return ContextCompat.getColor(this, R.color.white);
            case 2:
                return ContextCompat.getColor(this, R.color.blue);
            case 3:
                return ContextCompat.getColor(this, R.color.red);
            case 4:
                return ContextCompat.getColor(this, R.color.pink);
            case 5:
                return ContextCompat.getColor(this, R.color.yellow);
        }
        return ContextCompat.getColor(this, R.color.white);
    }
}