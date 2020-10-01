package com.example.chimzquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button homebtn;
    private Button homebtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        homebtn = (Button) findViewById(R.id.back_btntohome);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtoHome();
            }
        });


        homebtn1 = (Button) findViewById(R.id.home_btn);
        homebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtoHome();
            }
        });

        }

    public void backtoHome()
    {
        Intent intent = new Intent(this,  Home.class);
        startActivity(intent);
    }
}