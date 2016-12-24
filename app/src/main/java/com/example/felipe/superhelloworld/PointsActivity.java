package com.example.felipe.superhelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class PointsActivity extends AppCompatActivity {

    private TextView PointsText;
    private Button EndButton;
    private ImageView imageEnd;

    public int total;
    public int acertos;
    public int erros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        PointsText = (TextView) findViewById(R.id.PointsText);
        EndButton = (Button) findViewById(R.id.EndButton1);
        imageEnd = (ImageView) findViewById(R.id.imageEnd);

        Bundle pacote = getIntent().getExtras();
        total = pacote.getInt("TOTAL");
        acertos = pacote.getInt("NUM_ACERTOS");
        erros = pacote.getInt("NUM_ERROS");

        if(acertos==3){
            imageEnd.setImageResource(R.drawable.fmercury_meme);
        }else if(acertos==0){
            imageEnd.setImageResource(R.drawable.spongebob_rainbow);
        }else if (acertos==2){
            imageEnd.setImageResource(R.drawable.fmercury_meme2);
        }else if(acertos==1){
            imageEnd.setImageResource(R.drawable.spongebob_bitchface);
        }

        PointsText.setText(getString(R.string.FinalPoints, acertos, erros, total));

        EndButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent endgame = new Intent(PointsActivity.this, MainActivity.class);
                startActivity(endgame);
                finish();
            }

        });
    }
}
