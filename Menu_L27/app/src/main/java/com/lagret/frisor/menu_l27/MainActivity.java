package com.lagret.frisor.menu_l27;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.abdo_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id =item.getItemId();

        if (id == R.id.goback) {
            Toast.makeText(this,"habibi kan oalla",Toast.LENGTH_LONG).show();
        }
        if (id == R.id.next) {
            Toast.makeText(this, "alle ba3do", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
        }
    }

