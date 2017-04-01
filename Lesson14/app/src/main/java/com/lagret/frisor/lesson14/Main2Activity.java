package com.lagret.frisor.lesson14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tx3=(TextView)findViewById(R.id.tx3) ;

        Bundle b=getIntent().getExtras();
        String us=b.getString("user");
        String ps=b.getString("pass");

        tx3.setText("user: "+us + " " + ",pass: "+ps);

    }
}
