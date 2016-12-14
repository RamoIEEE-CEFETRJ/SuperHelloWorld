package com.example.felipe.superhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

import org.w3c.dom.Text;

public class SaluteActivity extends AppCompatActivity {

    private Button ReturnButton;
    private TextView SaluteText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salute);

        ReturnButton = (Button)findViewById(R.id.ReturnButton);
        SaluteText = (TextView)findViewById(R.id.SaluteText);

        ReturnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                finish();
            }
        });

    }
}
