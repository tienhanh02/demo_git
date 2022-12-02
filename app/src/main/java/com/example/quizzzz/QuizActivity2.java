package com.example.quizzzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity2 extends AppCompatActivity {
    Button khoButton;
    Button trungbinhButton;
    Button deButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        khoButton = findViewById(R.id.khoButton);
        khoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(QuizActivity2.this, QuizActivity3.class);
                startActivity(intents);

            }
        });
        trungbinhButton = findViewById(R.id.trungbinhButton);
        trungbinhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(QuizActivity2.this, QuizActivity3.class);
                startActivity(intents);

            }
        });

        deButton = findViewById(R.id.deButton);
        deButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(QuizActivity2.this, QuizActivity3.class);
                startActivity(intents);

            }
        });
    }
}