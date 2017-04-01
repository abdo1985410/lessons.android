package com.lagret.frisor.abdo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickage(View view) {
        EditText etage =(EditText) findViewById(R.id.etage);                  // ربط etage  بالاداة text
        int yearofbirth=Integer.parseInt(etage.getText().toString());
        int age = 2017-yearofbirth;

        Toast.makeText(this,"age: "+ String.valueOf(age),Toast.LENGTH_LONG).show();     // show massage to user
    }
}
