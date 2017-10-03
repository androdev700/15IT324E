package com.androdev.a15it324e.ex4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import com.androdev.a15it324e.R;

public class BasicUIViewComponents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_uiview_components);

        final TextView textView = (TextView) findViewById(R.id.colorText);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        final RadioButton radioButton = (RadioButton) findViewById(R.id.redRadio);
        final RadioButton radioButton1 = (RadioButton) findViewById(R.id.greenRadio);

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.RED);
                radioButton.setChecked(true);
                radioButton1.setChecked(false);
                checkBox.setChecked(true);
            }
        });

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.GREEN);
                radioButton1.setChecked(true);
                radioButton.setChecked(false);
                checkBox.setChecked(true);
            }
        });
    }
}
