package com.example.datasenderreceiver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BActivity extends AppCompatActivity {

    String picUrlStr = "전달받은 사진 폴더 : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity_main);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String picUrl = bundle.getString("PIC_URL");

        TextView loadPicUrlTextView = (TextView)findViewById(R.id.receiver);
        picUrlStr += picUrl;
        loadPicUrlTextView.setText(picUrlStr);
    }

    public void onClickB(View v)
    {
        String urlTest = "/sdcard/aaa.png";
        Intent intent = new Intent();
        intent.putExtra("URL_TEST", urlTest);
        setResult(2, intent);
        Log.v("ClickB", intent.getStringExtra("URL_TEST")); //여기 잘 찍힘.
        finish();
    }
}