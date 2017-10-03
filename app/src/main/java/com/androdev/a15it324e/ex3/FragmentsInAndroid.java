package com.androdev.a15it324e.ex3;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.androdev.a15it324e.R;

public class FragmentsInAndroid extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            FragmentTransaction transaction;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new BlankFragment1();
                    transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.content, fragment).commit();
                    return true;
                case R.id.navigation_dashboard:
                    fragment = new BlankFragment2();
                    transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.content, fragment).commit();
                    return true;
                case R.id.navigation_notifications:
                    fragment = new BlankFragment3();
                    transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.content, fragment).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_in_android);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_home);
    }

}
