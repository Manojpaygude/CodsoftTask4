package com.example.myquiz;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizResult extends AppCompatActivity {
    private TextView  textViewScore;
    private Button buttonFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        // Initialize views

        textViewScore = findViewById(R.id.textViewScore);
        buttonFinish = findViewById(R.id.buttonFinish);


        // Get data from intent
        Intent intent = getIntent();
        int correctAnswers = intent.getIntExtra("correct", 0);
        int incorrectAnswers = intent.getIntExtra("incorrect", 0);
        int totalQuestions = correctAnswers + incorrectAnswers;
        double score = (double) correctAnswers / 10 * 100;

        // Set data to views

        textViewScore.setText("Score: " + score + "%");

        // Button click listener to finish the activity
        buttonFinish.setOnClickListener(view -> finish());


    }
}
