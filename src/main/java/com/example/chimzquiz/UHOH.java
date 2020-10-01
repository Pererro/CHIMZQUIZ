package com.example.chimzquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UHOH extends AppCompatActivity {
    private Button backbtn;
    private Button menubtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_h_o_h);

        backbtn = (Button) findViewById(R.id.back_btn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtoHome();
            }
        });

        menubtn = (Button) findViewById(R.id.menu_btn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtoMenu();
            }
        });


    }
    public void backtoHome()
    {
        Intent intent = new Intent(this,  Home.class);
        startActivity(intent);
    }
    public void backtoMenu()
    {
        Intent intent = new Intent(this,  Menu.class);
        startActivity(intent);
    }

}