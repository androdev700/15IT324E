package com.androdev.a15it324e.ex2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.androdev.a15it324e.R;

public class IntentFilterUnderstanding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_filter_understanding);

        final EditText editText = (EditText) findViewById(R.id.etIntentData);
        Button button = (Button) findViewById(R.id.intentProceed);
        Button button1 = (Button) findViewById(R.id.intentFilterChoice);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntentFilterUnderstanding.this, ReadIntent.class);
                intent.putExtra("data",editText.getText().toString());
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory("com.androdev");
                startActivity(intent);
            }
        });

    }
}
