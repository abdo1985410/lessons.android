package com.lagret.frisor.loadsms;

import android.Manifest;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private static final int R_per=123;

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void buload(View view) {
        if ((int) Build.VERSION.SDK_INT>=23) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_SMS)!= PackageManager.PERMISSION_GRANTED){
                if(!shouldShowRequestPermissionRationale(Manifest.permission.READ_SMS)){
                    requestPermissions(new String[]{Manifest.permission.READ_SMS},R_per);
                }
                return;
            }
        }

        LoadInboxMasseges();
    }

    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[] grantResults){
        switch (requestCode) {
            case R_per:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    LoadInboxMasseges();
                } else {

                }
                break;
            default:super.onRequestPermissionsResult(requestCode,permissions,grantResults);
        }
    }

    void LoadInboxMasseges(){
        try {
            String sms="";
            Uri uriSmsUri = Uri.parse("content://sms/inbox");
            Cursor cur = getContentResolver().query(uriSmsUri, null, null, null, null);
            cur.moveToPosition(0);
            while (cur.moveToNext()) {
                sms += "From :" + cur.getString(cur.getColumnIndex("adress")) + " : " + cur.getString(cur.getColumnIndex("body")) + "\n";
                TextView txtDisplay = (TextView) findViewById(R.id.txtv);
                txtDisplay.setText(sms);

            }
        } catch (Exception ex) {
        }
    }
}
