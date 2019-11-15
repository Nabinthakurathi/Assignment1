package com.e.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromActivity extends AppCompatActivity {
    private EditText etpalindrom;
    private Button btnpan;
    private TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrom);

        etpalindrom=findViewById(R.id.etpalindrom);
        btnpan=findViewById(R.id.btnpan);
        tvRes=findViewById(R.id.tvRes);

        btnpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etpalindrom.getText()))
                {
                    etpalindrom.setError("Enter Number");
                    etpalindrom.requestFocus();
                    return;
                }

                int x, result;
                x=Integer.parseInt(etpalindrom.getText().toString());

                Palindrom pal = new Palindrom();
                result =pal.reverse(x);

                if(result == x)
                {
                    tvRes.setText("it is palindrome" + Integer.toString(x));


                }
                else
                {
                    tvRes.setText("it is not palindrome" +Integer.toString(x));
                }

            }
        });

    }
}
