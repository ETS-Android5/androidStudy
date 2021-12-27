package com.example.broadcastreceiver1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class StaticReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String fileName = intent.getStringExtra("FILE_NAME");
        Toast.makeText(context, "정적 Receiver : " + fileName, Toast.LENGTH_LONG).show();
        throw new UnsupportedOperationException("Not yet implemented");
    }
}