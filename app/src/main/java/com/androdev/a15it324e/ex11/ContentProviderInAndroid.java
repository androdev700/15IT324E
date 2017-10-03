package com.androdev.a15it324e.ex11;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.androdev.a15it324e.R;

public class ContentProviderInAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provide_in_android);
    }

    public void onClickAddName(View view) {
        ContentValues values = new ContentValues();
        values.put(StudentsProvider.NAME, ((EditText) findViewById(R.id.editText2)).getText().toString());
        values.put(StudentsProvider.GRADE, ((EditText) findViewById(R.id.editText3)).getText().toString());

        Uri uri = getContentResolver().insert(StudentsProvider.CONTENT_URI, values);
        assert uri != null;
        Toast.makeText(getBaseContext(), uri.toString(), Toast.LENGTH_LONG).show();
    }

    public void onClickRetrieveStudents(View view) {
        String URL = "content://com.androdev.a15it324e.ex11.StudentsProvider";

        Uri students = Uri.parse(URL);
        Cursor c = getContentResolver().query(students, null, null, null, "name");

        assert c != null;
        if (c.moveToFirst()) {
            do {
                Toast.makeText(this,
                        c.getString(c.getColumnIndex(StudentsProvider._ID)) +
                                ", " + c.getString(c.getColumnIndex(StudentsProvider.NAME)) +
                                ", " + c.getString(c.getColumnIndex(StudentsProvider.GRADE)),
                        Toast.LENGTH_SHORT).show();
            } while (c.moveToNext());
        }
        c.close();
    }
}
