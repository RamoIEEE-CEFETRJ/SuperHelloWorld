package com.example.felipe.superhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;
import com.google.firebase.database.*;

public class RespErrada extends AppCompatActivity {

    private TextView RespErradaText;
    private Button NextButton2;

    private DatabaseReference myFirebaseRef;

    public int question;
    public int acertos;
    public int erros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resp_errada);

        RespErradaText = (TextView) findViewById(R.id.RespErradaText);
        NextButton2 = (Button) findViewById(R.id.NextButton2);

        myFirebaseRef = FirebaseDatabase.getInstance().getReference();

        myFirebaseRef.child("Wrong").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                RespErradaText.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        Bundle pacote = getIntent().getExtras();
        question = pacote.getInt("NUM_PERGUNTA");
        acertos = pacote.getInt("NUM_ACERTOS");
        erros = pacote.getInt("NUM_ERROS");

        NextButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent next = new Intent(RespErrada.this, PlayActivity.class);
                question ++;
                erros ++;

                next.putExtra("NUM_PERGUNTA", question);
                next.putExtra("NUM_ACERTOS", acertos);
                next.putExtra("NUM_ERROS", erros);
                startActivity(next);
                finish();
            }

        });
    }
}
