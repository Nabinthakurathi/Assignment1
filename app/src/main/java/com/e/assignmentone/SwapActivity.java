package com.e.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SwapActivity extends AppCompatActivity {

    private EditText etfirst, etsecond;
    private Button btnSw;
    private TextView tvR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap);

        etfirst=findViewById(R.id.etfirst);
        etsecond=findViewById(R.id.etsecond);
        btnSw=findViewById(R.id.btnSw);
        tvR=findViewById(R.id.tvR);

        btnSw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etfirst.getText())) {
                    etfirst.setError("Enter number");
                    etfirst.requestFocus();
                    return;
                } else if (TextUtils.isEmpty(etsecond.getText())) {
                    etsecond.setError("Enter second number");
                    etsecond.requestFocus();
                    return;
                }


                int first, second, Result;
                first = Integer.parseInt(etfirst.getText().toString());
                second = Integer.parseInt(etsecond.getText().toString());


                Swap s = new Swap();
                s.setA(Integer.parseInt(etfirst.getText().toString()));
                s.setB((Integer.parseInt(etsecond.getText().toString())));
                tvR.setText("Before Swap:" + "A = " + Integer.parseInt(etfirst.getText().toString()) + "B = "
                        + Integer.parseInt(etsecond.getText().toString()));
                tvR.setText(s.swapnumber());
            }



        });

    }
}
