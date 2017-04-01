package com.lagret.frisor.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int i;
    int [] mypic= new int[]{R.drawable.a,R.drawable.b,R.drawable.c};

    public void click(View view) {
        ImageView mypicv =(ImageView)findViewById(R.id.pic);
        mypicv.setImageResource(mypic[i]);
        i++;
        if (i>2) i=0;
    }
    
}
