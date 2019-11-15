package com.e.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseActivity extends AppCompatActivity {
    private EditText etReverse;
    private Button btnreverse;
    private TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        etReverse=findViewById(R.id.etReverse);
        btnreverse=findViewById(R.id.btnreverse);
        tvresult=findViewById(R.id.tvresult);

        btnreverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etReverse.getText()))
                {
                    etReverse.setError("Enter Number");
                    etReverse.requestFocus();
                    return;
                }

                int x, result;
                x = Integer.parseInt(etReverse.getText().toString());
                Reverse r = new Reverse();
                result = r.reverse(x);
                 tvresult.setText("Reverse Number is " + Integer.toString(result));

            }
        });

    }
}
