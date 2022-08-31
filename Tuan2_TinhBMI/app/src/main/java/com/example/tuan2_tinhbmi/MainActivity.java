package com.example.tuan2_tinhbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button button;
     TextView show_result, BMI_rs;
     EditText vl1,vl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_click); //Tìm lại button
        show_result= findViewById(R.id.result);
        vl1 = findViewById(R.id.height);
        vl2 = findViewById(R.id.weight);
        BMI_rs = findViewById(R.id.rsBMI);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float  x = Float.parseFloat(vl1.getText().toString());
                float  y = Float.parseFloat(vl2.getText().toString());
                float rs = y/(x*x);
                BMI_rs.setText("BMI: " + rs);
                if (rs < 18){
                    show_result.setText("Người gầy");
                }else if (rs < 25){
                    show_result.setText("Người bình thường");
                }
                else if (rs < 39){
                    show_result.setText("Người béo phì độ I");
                }
                else if (rs < 35){
                    show_result.setText("Người béo phì độ II");
                } else {
                    show_result.setText("Người béo phì độ III");
                }

            }
        });
    }
}