package com.lagret.frisor.sum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txt1= (EditText) findViewById(R.id.tx1);
        final EditText txt2= (EditText) findViewById(R.id.tx2);
        final EditText txt3= (EditText) findViewById(R.id.tx3);
        Button bu = (Button) findViewById(R.id.buadd);
        bu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1=Integer.parseInt(txt1.getText().toString());
                int n2=Integer.parseInt(txt2.getText().toString());
                int nr=n1+n2;
                txt3.setText(String.valueOf(nr));
            }
                              }
        );

    }
}
