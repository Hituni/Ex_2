package com.example.igor.ex_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ex_2 extends AppCompatActivity {

    private TextView mHelloTextView;

    public static Integer schetchik = new Integer(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_2);
        mHelloTextView = (TextView)findViewById(R.id.textView);
    }

    public void onClick1(View view) {
        schetchik++;
        mHelloTextView.setText(schetchik.toString());
    }

    public void onClick2(View view) {
        if(schetchik<=100){
            mHelloTextView.setText("Недобор");
        }
        else if(schetchik>=1000){
            mHelloTextView.setText("Перебор");
        }
        else {
            mHelloTextView.setText("Примерно Да");
        }
    }
}
