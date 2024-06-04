package com.example.myquiz;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private TextView question_num,question;
    private AppCompatButton option1,option2,option3,option4,nextbtn;
    private List<QuestionsList> questionsLists ;
    private int currentQuestionposition = 0;
    private String selectedOptionByUser ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        question=findViewById(R.id.question);
        question_num=findViewById(R.id.question_num);
        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);
        nextbtn=findViewById(R.id.next);
        final ImageView backbtn =findViewById(R.id.backbtn);
        final TextView selectedTopicName=findViewById(R.id.topicname);
        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");
        selectedTopicName.setText(getSelectedTopicName);

        questionsLists = QuestionBank.getQuestions(getSelectedTopicName);
        question_num.setText((currentQuestionposition+1)+"/"+questionsLists.size());
        question.setText(questionsLists.get(0).getQuestion());
        option1.setText(questionsLists.get(0).getOption1());
        option2.setText(questionsLists.get(0).getOption2());
        option3.setText(questionsLists.get(0).getOption3());
        option4.setText(questionsLists.get(0).getOption4());

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.orange_color);
                    option1.setTextColor(Color.WHITE);
                    revalAnswer();
                    questionsLists.get(currentQuestionposition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.orange_color);
                    option2.setTextColor(Color.WHITE);
                    revalAnswer();
                    questionsLists.get(currentQuestionposition).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.orange_color);
                    option3.setTextColor(Color.WHITE);
                    revalAnswer();
                    questionsLists.get(currentQuestionposition).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.orange_color);
                    option4.setTextColor(Color.WHITE);
                    revalAnswer();
                    questionsLists.get(currentQuestionposition).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(MainActivity2.this, "Please Select an Option", Toast.LENGTH_SHORT).show();
                }
                else{
                    changeNextQuestion();

                }
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
                finish();
            }
        });
    }

    private void changeNextQuestion(){
        currentQuestionposition++;
        if ((currentQuestionposition+1)==questionsLists.size()){
            nextbtn.setText("Submit Quiz");
        }
        if (currentQuestionposition<questionsLists.size()){
            selectedOptionByUser="";
            option1.setTextColor(Color.parseColor("#1f6888"));
            option2.setTextColor(Color.parseColor("#1f6888"));
            option3.setTextColor(Color.parseColor("#1f6888"));
            option4.setTextColor(Color.parseColor("#1f6888"));
            option1.setBackgroundResource(R.drawable.background_effect);
            option2.setBackgroundResource(R.drawable.background_effect);
            option3.setBackgroundResource(R.drawable.background_effect);
            option4.setBackgroundResource(R.drawable.background_effect);
            question_num.setText((currentQuestionposition+1)+"/"+questionsLists.size());
            question.setText(questionsLists.get(currentQuestionposition).getQuestion());
            option1.setText(questionsLists.get(currentQuestionposition).getOption1());
            option2.setText(questionsLists.get(currentQuestionposition).getOption2());
            option3.setText(questionsLists.get(currentQuestionposition).getOption3());
            option4.setText(questionsLists.get(currentQuestionposition).getOption4());

        }
        else{
            Intent intent =new Intent(MainActivity2.this,QuizResult.class);
            intent.putExtra("correct",getCorrectAnswers());
            intent.putExtra("Incorrect",getInCorrectAnswers());
            startActivity(intent);
            finish();
        }
    }

    private int getCorrectAnswers(){
        int CorrectAnswers =0 ;
        for (int i=0; i<questionsLists.size();i++){
            final String getUserSelectedAnswer =questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getAnswer)){
                CorrectAnswers++;
            }
        }
        return  CorrectAnswers;
    }

    private int getInCorrectAnswers(){
        int CorrectAnswers =0 ;
        for (int i=0; i<questionsLists.size();i++){
            final String getUserSelectedAnswer =questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (!getUserSelectedAnswer.equals(getAnswer)){
                CorrectAnswers++;
            }
        }
        return  CorrectAnswers;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(MainActivity2.this,MainActivity.class));
        finish();
    }

    private void revalAnswer(){
        final String getAnswer = questionsLists.get(currentQuestionposition).getAnswer();
        if (option1.getText().toString().equals(getAnswer)){
            option1.setBackgroundResource(R.drawable.background_shape);
            option1.setTextColor(Color.WHITE);
        } else if (option2.getText().toString().equals(getAnswer)) {
            option2.setBackgroundResource(R.drawable.background_shape);
            option2.setTextColor(Color.WHITE);
        } else if (option3.getText().toString().equals(getAnswer)) {
            option3.setBackgroundResource(R.drawable.background_shape);
            option3.setTextColor(Color.WHITE);
        } else if (option4.getText().toString().equals(getAnswer)) {
            option4.setBackgroundResource(R.drawable.background_shape);
            option4.setTextColor(Color.WHITE);
        }
    }

}
