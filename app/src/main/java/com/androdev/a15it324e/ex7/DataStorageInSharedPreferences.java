package com.androdev.a15it324e.ex7;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.androdev.a15it324e.R;

public class DataStorageInSharedPreferences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_storagein_shared_preferences);

        final SharedPreferences sharedPreferences = getSharedPreferences("data", MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        final TextView textView = (TextView) findViewById(R.id.textName);
        final EditText editText = (EditText) findViewById(R.id.etName);
        Button button = (Button) findViewById(R.id.saveSharedPref);
        Button button1 = (Button) findViewById(R.id.clearSharedPref);

        textView.setText("Hi, " + sharedPreferences.getString("name", "Stranger"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("name", editText.getText().toString());
                editor.apply();
                textView.setText("Hi, " + editText.getText().toString());
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hi, Stranger");
                editor.clear().apply();
                editText.setText("");
            }
        });

    }
}
