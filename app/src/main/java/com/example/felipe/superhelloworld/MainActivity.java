package com.example.felipe.superhelloworld;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;



public class MainActivity extends AppCompatActivity {

    private TextView ActMainTextView;
    private Button mainbutton1;
    private Button mainbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainbutton1 = (Button)findViewById(R.id.mainbutton1);
        mainbutton2 = (Button)findViewById(R.id.mainbutton2);

        mainbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int_salute = new Intent(MainActivity.this, SaluteActivity.class);
                startActivity(int_salute);
            }
        });

        mainbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int_salute = new Intent(MainActivity.this, QuizMainActivity.class);
                startActivity(int_salute);


            }
        });

    }

}
