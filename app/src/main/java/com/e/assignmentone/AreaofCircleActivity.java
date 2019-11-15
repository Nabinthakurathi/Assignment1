package com.e.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaofCircleActivity extends AppCompatActivity {
    EditText etRadius;
    Button btnCircle;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaof_circle);

        etRadius=findViewById(R.id.etRadius);
        btnCircle=findViewById(R.id.btnCircle);
        tvResult=findViewById(R.id.teResult);
        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etRadius.getText())) {
                    etRadius.setError("Please enter the value of radius");
                    etRadius.requestFocus();
                    return;
                }

                    else
                    {
                        float Radius = Float.parseFloat(etRadius.getText().toString());
                        Circle circle = new Circle();
                        {
                            circle.Radius = Radius;

                        }

                        tvResult.setText("Area of Circle =" + Float.toString(circle.area()) );

                    }
                }
        });

    }
}
