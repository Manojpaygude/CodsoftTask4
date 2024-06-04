package com.example.myquiz;

import static com.example.myquiz.R.id.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private String selectedtopicname="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    final LinearLayout java = findViewById(R.id.java);
    final LinearLayout python =findViewById(R.id.python);
    final LinearLayout javascript = findViewById(R.id.javascript);
    final LinearLayout php = findViewById(R.id.php);
        final Button button = findViewById(R.id.button);


        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedtopicname="java";
                java.setBackgroundResource(R.drawable.effect);
                python.setBackgroundResource(R.drawable.background_effect);
                javascript.setBackgroundResource(R.drawable.background_effect);
                php.setBackgroundResource(R.drawable.background_effect);
            }
        });
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedtopicname="python";
                python.setBackgroundResource(R.drawable.effect);
                java.setBackgroundResource(R.drawable.background_effect);
                javascript.setBackgroundResource(R.drawable.background_effect);
                php.setBackgroundResource(R.drawable.background_effect);

            }
        });
        javascript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedtopicname="javascript";
                javascript.setBackgroundResource(R.drawable.effect);
                python.setBackgroundResource(R.drawable.background_effect);
                java.setBackgroundResource(R.drawable.background_effect);
                php.setBackgroundResource(R.drawable.background_effect);

            }
        });
        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedtopicname="php";
                php.setBackgroundResource(R.drawable.effect);
                python.setBackgroundResource(R.drawable.background_effect);
                javascript.setBackgroundResource(R.drawable.background_effect);
                java.setBackgroundResource(R.drawable.background_effect);

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedtopicname.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please select a Topic", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("selectedTopic",selectedtopicname);
                    startActivity(intent);

                }
            }
        });
    }
}
