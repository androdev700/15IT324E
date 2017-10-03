package com.androdev.a15it324e.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androdev.a15it324e.R;

public class ReadIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_intent);

        TextView textView = (TextView) findViewById(R.id.textIntentData);
        textView.setText(getIntent().getStringExtra("data"));
    }
}
