package com.example.chimzquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    viewquiz quizDB;
    private Button button;
    private Button menubtn;
    private Button viewbtn;
    private Button viewquizzz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        button = (Button) findViewById(R.id.back_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backButton();
            }
        });


        menubtn = (Button) findViewById(R.id.gotomenu);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuButton();
            }
        });



    }
    public void backButton()
    {
        Intent intent = new Intent(this,  MainActivity.class);
        startActivity(intent);
    }
    public void menuButton()
    {
        Intent intent = new Intent(this,  Menu.class);
        startActivity(intent);
    }





}