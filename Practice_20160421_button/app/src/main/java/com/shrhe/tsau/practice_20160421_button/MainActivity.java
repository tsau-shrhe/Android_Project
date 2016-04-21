package com.shrhe.tsau.practice_20160421_button;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView view01;
    private Button btn01;
    private EditText ed_num01 , ed_num02;
    int number01,number02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view01 = (TextView) findViewById(R.id.view01);
        btn01 = (Button) findViewById(R.id.btn01);
        ed_num01 = (EditText) findViewById(R.id.ed_num01);
        ed_num02 = (EditText) findViewById(R.id.ed_num02);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number01 = Integer.valueOf(ed_num01.getText().toString());
                number02 = Integer.valueOf(ed_num02.getText().toString());
                int sum = number01+number02;
                view01.setText("" + sum);
            }
        });

    }
}
