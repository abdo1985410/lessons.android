package com.lagret.frisor.lesson14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bu(View view) {
        EditText tx1=(EditText)findViewById(R.id.tx1);
        EditText tx2=(EditText)findViewById(R.id.tx2);

        Intent myintent=new Intent(this,Main2Activity.class);

        Bundle b= new Bundle();
        b.putString("user",tx1.getText().toString());
        b.putString("pass",tx2.getText().toString());
        myintent.putExtras(b);

        // او بدل Bundle  كان نقدر نستخدم مايلي مباشرة
        //myintent.putExtra("user",tx1.getText().toString());
        //myintent.putExtra("pass",tx2.getText().toString());

        startActivity(myintent);


    }
}
