package com.example.bt1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1, button2, button3, button4;
        final RelativeLayout relativeLayout;

        // set button 1 with its id
        button1 = findViewById(R.id.Var1);

        // set button 2 with its id
        button2 = findViewById(R.id.Var2);

        button3 = findViewById(R.id.Var3);

        button4 = findViewById(R.id.Var4);
        // set relative layout with its id
        relativeLayout = findViewById(R.id.rlVar1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                relativeLayout.setBackgroundResource(R.color.white);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                relativeLayout.setBackgroundResource(R.color.red);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                relativeLayout.setBackgroundResource(R.color.green);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                relativeLayout.setBackgroundResource(R.color.blue);
            }
        });
    }
}