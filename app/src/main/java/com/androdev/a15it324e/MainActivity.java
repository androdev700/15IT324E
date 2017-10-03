package com.androdev.a15it324e;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.androdev.a15it324e.ex1.ActivityLifeCycle;
import com.androdev.a15it324e.ex10.BoundUnbound;
import com.androdev.a15it324e.ex11.ContentProviderInAndroid;
import com.androdev.a15it324e.ex12.MapsAndLocationServices;
import com.androdev.a15it324e.ex13.JSONBasedWebService;
import com.androdev.a15it324e.ex14.AnimationsInAndroid;
import com.androdev.a15it324e.ex2.IntentFilterUnderstanding;
import com.androdev.a15it324e.ex3.FragmentsInAndroid;
import com.androdev.a15it324e.ex4.BasicUIViewComponents;
import com.androdev.a15it324e.ex5.AndroidScreenUILayouts;
import com.androdev.a15it324e.ex6.ListViewAdapterView;
import com.androdev.a15it324e.ex7.DataStorageInSharedPreferences;
import com.androdev.a15it324e.ex8.DataStorageInSQL;
import com.androdev.a15it324e.ex9.AsyncTaskServlet;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activityLifeCycle(View view) {
        startActivity(new Intent(this, ActivityLifeCycle.class));
    }

    public void intentFilterUnderstanding(View view) {
        startActivity(new Intent(this, IntentFilterUnderstanding.class));
    }

    public void fragmentsInAndroid(View view) {
        startActivity(new Intent(this, FragmentsInAndroid.class));
    }

    public void dataStorageSharedPref(View view) {
        startActivity(new Intent(this, DataStorageInSharedPreferences.class));
    }

    public void jsonWebService(View view) {
        startActivity(new Intent(this, JSONBasedWebService.class));
    }

    public void animationsInAndroid(View view) {
        startActivity(new Intent(this, AnimationsInAndroid.class));
    }

    public void contentProvider(View view) {
        startActivity(new Intent(this, ContentProviderInAndroid.class));
    }

    public void mapsAndLocationServices(View view) {
        startActivity(new Intent(this, MapsAndLocationServices.class));
    }

    public void dataStorageSQL(View view) {
        startActivity(new Intent(this, DataStorageInSQL.class));
    }

    public void listView(View view) {
        startActivity(new Intent(this, ListViewAdapterView.class));
    }

    public void screenUI(View view) {
        startActivity(new Intent(this, AndroidScreenUILayouts.class));
    }

    public void uiViewComponents(View view) {
        startActivity(new Intent(this, BasicUIViewComponents.class));
    }

    public void boundUnboundServices(View view) {
        startActivity(new Intent(this, BoundUnbound.class));
    }

    public void asyncPost(View view) {
        startActivity(new Intent(this, AsyncTaskServlet.class));
    }
}
