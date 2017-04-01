package com.lagret.frisor.notification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    NewMessageNotification newn=new NewMessageNotification();

    public void buadd(View view) {
        newn.notify(this,"good morning",1234);

    }

    public void buremove(View view) {
        newn.cancel(this);
    }
}
