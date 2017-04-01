package com.lagret.frisor.notification1;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    NotificationManager nmanager;
    static int id=1;

    public void clknotify(View view) {
        NotificationCompat.Builder nbuild=new NotificationCompat.Builder(this)
                .setContentTitle("new product")
                .setContentText("new goods for hemlkar")
                .setSmallIcon(R.drawable.abc);

        nmanager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        nmanager.notify(id,nbuild.build());
        id++;


    }

    public void clkcancel(View view) {
        nmanager.cancelAll();
    }
}

