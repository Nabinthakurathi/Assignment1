package com.e.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnArea, btnReverse, btnPalindrom, btnSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArea=findViewById(R.id.btnArea);
        btnArea.setOnClickListener(new View.OnClickListener(){

           public void onClick(View v) {
               Intent area = new Intent(MainActivity.this, AreaofCircleActivity.class);
               startActivity(area);
           }
        });


        btnReverse=findViewById(R.id.btnReverse);
        btnReverse.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent reverse = new Intent(MainActivity.this, ReverseActivity.class);
                startActivity(reverse);
            }
        });

        btnPalindrom=findViewById(R.id.btnPalindrom);
        btnPalindrom.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent palindrom = new Intent(MainActivity.this, PalindromActivity.class);
                startActivity(palindrom);
            }
        });

        btnSwap=findViewById(R.id.btnSwap);
        btnSwap.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent swap = new Intent(MainActivity.this, SwapActivity.class);
                startActivity(swap);
            }
        });
    }
}
