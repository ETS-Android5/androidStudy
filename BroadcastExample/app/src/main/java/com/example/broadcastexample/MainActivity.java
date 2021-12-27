package com.example.broadcastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver mReceiver = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("FILE_DOWNLOADED");

        mReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if(intent.getAction().equals("FILE_DOWNLOADED"))
                {
                    String fileName = intent.getStringExtra("FILE_NAME");
                    Toast.makeText(context, "동적 Receiver : " + fileName, Toast.LENGTH_LONG).show();
                }
            }
        };
        registerReceiver(mReceiver, intentFilter);
    }
    public void onClick(View v)
    {
        Intent intent = new Intent();
        intent.setAction("FILE_DOWNLOADED");
        intent.putExtra("FILE_NAME", "superoid.png");
        sendBroadcast(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mReceiver);
    }
}