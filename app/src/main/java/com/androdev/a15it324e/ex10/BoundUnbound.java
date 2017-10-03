package com.androdev.a15it324e.ex10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.IBinder;
import android.widget.ImageButton;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

import com.androdev.a15it324e.R;

public class BoundUnbound extends AppCompatActivity {

    BoundedAudioPlayerService myService;
    private boolean isBound;
    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_unbound);
        btn = (ImageButton) findViewById(R.id.button1);
        isBound = false;
    }

    public void playAudio(View view) {
        Intent objIntent = new Intent(this, BoundedAudioPlayerService.class);
        if (!isBound) {
            bindService(objIntent, myConnection, Context.BIND_AUTO_CREATE);
            isBound = true;
            btn.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);//setText("Pause");
            startService(objIntent);
        } else {
            myService.plauseAudio();
            btn.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
            isBound = false;
            unbindService(myConnection);
        }

    }

    public void stopAudio(View view) {
        Intent objIntent = new Intent(this, BoundedAudioPlayerService.class);
        if (isBound) {
            isBound = false;
            unbindService(myConnection);
            stopService(objIntent);

        } else
            stopService(objIntent);
        btn.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
    }

    private ServiceConnection myConnection = new ServiceConnection() {


        public void onServiceConnected(ComponentName className,
                                       IBinder service) {
            myService = ((BoundedAudioPlayerService.MyLocalBinder) service).getService();
            isBound = true;
        }

        public void onServiceDisconnected(ComponentName arg0) {
            isBound = false;
        }

    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isBound) {
            // Disconnect from an application service. You will no longer
            // receive calls as the service is restarted, and the service is
            // now allowed to stop at any time.
            unbindService(myConnection);
            isBound = false;
        }
    }
}