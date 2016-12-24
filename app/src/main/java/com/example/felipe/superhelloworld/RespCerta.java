package com.example.felipe.superhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;
import com.google.firebase.database.*;

public class RespCerta extends AppCompatActivity {

    private TextView RespCertaText;
    Button NextButton1;

    public int question;
    public int acertos;
    public int erros;

    DatabaseReference myFirebaseRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resp_certa);

        RespCertaText = (TextView) findViewById(R.id.RespCertaText);
        NextButton1 = (Button) findViewById(R.id.NextButton1);

        myFirebaseRef = FirebaseDatabase.getInstance().getReference();

        myFirebaseRef.child("Right").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                RespCertaText.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        Bundle pacote = getIntent().getExtras();
        question = pacote.getInt("NUM_PERGUNTA");
        acertos = pacote.getInt("NUM_ACERTOS");
        erros = pacote.getInt("NUM_ERROS");

        NextButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent next = new Intent(RespCerta.this, PlayActivity.class);
                question ++;
                acertos ++;

                next.putExtra("NUM_PERGUNTA", question);
                next.putExtra("NUM_ACERTOS", acertos);
                next.putExtra("NUM_ERROS", erros);
                startActivity(next);
                finish();
            }

        });

    }
}