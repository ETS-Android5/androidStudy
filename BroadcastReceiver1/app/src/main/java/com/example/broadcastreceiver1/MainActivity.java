package com.example.broadcastreceiver1;

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
    }

    public void onClick(View v)
    {
        Intent intent = new Intent();
        intent.setAction("com.example.broadcastreceiver1.hihi");
        intent.putExtra("FILE_NAME", "superoid.png");
        sendBroadcast(intent);
    }
}