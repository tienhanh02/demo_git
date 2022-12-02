package com.example.quizzzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity3 extends AppCompatActivity {

    private TextView tvQuestion;
    private Button b1,b2;
    private Button btnNext;

    int totalQuestion;
    int qCounter = 0;

    ColorStateList dfRbColor;
    boolean answered;

    private QuestionAndAnswer currentQuestion;

    private List<QuestionAndAnswer> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        questionList = new ArrayList<>();
        tvQuestion = findViewById(R.id.question);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        btnNext = findViewById(R.id.btnNext);

        dfRbColor = b1.getTextColors();




        addQuestion();

        totalQuestion = questionList.size();
        showNextQuestion();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answered == false){
                    if(b1.isClickable()|| b2.isClickable()){
                        checkAnswer();
                    }else {
                        Toast.makeText(QuizActivity3.this, "please select an option",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    showNextQuestion();
                }
            }
        });



    }

    private void checkAnswer() {
        answered = true;
        b1.setTextColor(Color.RED);
        b2.setTextColor(Color.RED);
        switch (currentQuestion.getCorrestAnsNo()) {
            case 1:
                b1.setTextColor(Color.GREEN);
                break;
            case 2:
                b2.setTextColor(Color.GREEN);
                break;
        }
        if (qCounter < totalQuestion){
            btnNext.setText("NEXT");
        }else {
            btnNext.setText("Finish");
        }
    }

    private void showNextQuestion() {


        b1.setTextColor(dfRbColor);
        b2.setTextColor(dfRbColor);


        if(qCounter < totalQuestion){
            currentQuestion = questionList.get(qCounter);
            tvQuestion.setText(currentQuestion.getQuestion());
            b1.setText(currentQuestion.getOption1());
            b2.setText(currentQuestion.getOption2());

            qCounter++;
            btnNext.setText("SUBMIT");
            answered = false;
        }else{
            finish();
        }


    }

    private void addQuestion() {
        questionList.add(new QuestionAndAnswer("anh Hạnh đẹp zai đúng không", "A", "B", 1));
        questionList.add(new QuestionAndAnswer("boy Đông Anh là boy tốt đúng không", "A", "B", 2));
        questionList.add(new QuestionAndAnswer("UET là U tốt đúng không", "A", "B", 1));
        questionList.add(new QuestionAndAnswer("A is correct", "A", "B", 1));
        questionList.add(new QuestionAndAnswer("b is correct", "A", "B", 2));

    }
}