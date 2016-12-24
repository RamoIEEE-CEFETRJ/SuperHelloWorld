package com.example.felipe.superhelloworld;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

public class QuizMainActivity extends AppCompatActivity {

    private TextView ActQuizTitle;
    private TextView ActQuizSubtitle;
    private ImageView imageButtonAccept;
    private ImageView imageButtonDeny;

    public int question = 1;
    public int acertos=0;
    public int erros=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.MainButton2);
        setContentView(R.layout.activity_quiz_main);

        imageButtonAccept= (ImageView)findViewById(R.id.imageButtonAccept);
        imageButtonDeny= (ImageView)findViewById(R.id.imageButtonDeny);

        imageButtonAccept.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int_Play = new Intent(QuizMainActivity.this, PlayActivity.class);
                //
                int_Play.putExtra("NUM_PERGUNTA", question);
                int_Play.putExtra("NUM_ACERTOS", acertos);
                int_Play.putExtra("NUM_ERROS", erros);
                //
                startActivity(int_Play);
                finish();
            }
        });

        imageButtonDeny.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });

    }
}
