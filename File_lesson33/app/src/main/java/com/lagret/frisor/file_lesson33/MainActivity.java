package com.lagret.frisor.file_lesson33;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class MainActivity extends AppCompatActivity {
    EditText etxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         etxt =(EditText)findViewById(R.id.editText);
    }



    public void busave(View view) {
        try {
            FileOutputStream fout = this.openFileOutput("abc.txt", MODE_PRIVATE);
            String s = etxt.getText().toString();
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            etxt.setText("success...");
        } catch (Exception e) {etxt.setText(e.getMessage());}
        }

    public void buload(View view){
        try {
            FileInputStream fin =this.openFileInput("abc.txt");
            int i;
            String filed="";
            while ((i=fin.read())!=-1){
                filed=filed+String.valueOf((char) i);
            }
            fin.close();
            etxt.setText(filed);
        } catch (Exception e){etxt.setText(e.getMessage());}
    }



}
