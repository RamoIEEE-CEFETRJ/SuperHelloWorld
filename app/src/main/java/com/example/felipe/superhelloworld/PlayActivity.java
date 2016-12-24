package com.example.felipe.superhelloworld;

import android.content.*;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class PlayActivity extends AppCompatActivity {

    private Button opt1;
    private Button opt2;
    private Button opt3;
    private Button opt4;
    private TextView enunciado;

    public int question;
    public int acertos;
    public int erros;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        opt1 = (Button) findViewById(R.id.opt1);
        opt2 = (Button) findViewById(R.id.opt2);
        opt3 = (Button) findViewById(R.id.opt3);
        opt4 = (Button) findViewById(R.id.opt4);

        Bundle pacote = getIntent().getExtras();
        question = pacote.getInt("NUM_PERGUNTA");
        acertos = pacote.getInt("NUM_ACERTOS");
        erros = pacote.getInt("NUM_ERROS");

        enunciado = (TextView) findViewById(R.id.enunciado);

        /*   DECIDE QUAL PERGUNTA APARECE NA TELA   */
        switch (question){
            case 1:
                setTitle(getString(R.string.TitleQuestion, question));
                opt1.setText(getString(R.string.Opt1A));
                opt2.setText(getString(R.string.Opt1B));
                opt3.setText(getString(R.string.Opt1C));
                opt4.setText(getString(R.string.Opt1D));
                enunciado.setText(getString(R.string.Enunciado01));
            break;

            case 2:
                setTitle(getString(R.string.TitleQuestion, question));
                opt1.setText(getString(R.string.Opt2A));
                opt2.setText(getString(R.string.Opt2B));
                opt3.setText(getString(R.string.Opt2C));
                opt4.setText(getString(R.string.Opt2D));
                enunciado.setText(getString(R.string.Enunciado02));
            break;

            case 3:
                setTitle(getString(R.string.TitleQuestion, question));
                opt1.setText(getString(R.string.Opt3A));
                opt2.setText(getString(R.string.Opt3B));
                opt3.setText(getString(R.string.Opt3C));
                opt4.setText(getString(R.string.Opt3D));
                enunciado.setText(getString(R.string.Enunciado03));
            break;
        }

        /*   ANALISA SE A RESPOSTA ESTÁ CERTA OU ERRADA   */

        opt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int_resposta;

                switch (question){
                    case 1:
                        int_resposta = new Intent(PlayActivity.this, RespCerta.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                    case 2:
                        int_resposta = new Intent(PlayActivity.this, RespCerta.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                    case 3:
                        int_resposta = new Intent(PlayActivity.this, RespCerta.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                }
            }
        });
        opt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int_resposta;
                switch (question){
                    case 1:
                        int_resposta = new Intent(PlayActivity.this, RespErrada.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                    case 2:
                        int_resposta = new Intent(PlayActivity.this, RespErrada.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                    case 3:
                        int_resposta = new Intent(PlayActivity.this, RespErrada.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                }
            }
        });
        opt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int_resposta;
                switch (question){
                    case 1:
                        int_resposta = new Intent(PlayActivity.this, RespErrada.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                    case 2:
                        int_resposta = new Intent(PlayActivity.this, RespErrada.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                    case 3:
                        int_resposta = new Intent(PlayActivity.this, RespErrada.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                }
            }
        });
        opt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int_resposta;
                switch (question){
                    case 1:
                        int_resposta = new Intent(PlayActivity.this, RespErrada.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                    case 2:
                        int_resposta = new Intent(PlayActivity.this, RespErrada.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                    case 3:
                        int_resposta = new Intent(PlayActivity.this, RespErrada.class);
                        int_resposta.putExtra("NUM_PERGUNTA", question);
                        int_resposta.putExtra("NUM_ACERTOS", acertos);
                        int_resposta.putExtra("NUM_ERROS", erros);
                        startActivity(int_resposta);
                        finish();
                        break;
                }
            }
        });

        if (question > 3){
            total = 10*acertos - 5*erros;
            Intent int_points = new Intent(PlayActivity.this, PointsActivity.class);
            int_points.putExtra("TOTAL", total);
            int_points.putExtra("NUM_ACERTOS", acertos);
            int_points.putExtra("NUM_ERROS", erros);
            startActivity(int_points);
            finish();

        }
    }
}