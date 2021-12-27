package com.example.datasenderreceiver;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  String mSendUrl = "/data/pics";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loadPicUrlBtn = (Button)findViewById(R.id.btn);
        String loadUrlStr = "사진 블러오기 : " + mSendUrl;
        loadPicUrlBtn.setText(loadUrlStr);
    }

    public void onClickA(View v)
    {
        switch (v.getId())
        {
            case R.id.btn:
            {
                Intent intent = new Intent();
                intent.setClass(this, BActivity.class);
                intent.putExtra("PIC_URL", mSendUrl);
                startActivityForResult(intent, 2);
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.v("result code", "test" + resultCode); //여기 안 찍힘

        if (resultCode == 2) {
            String picFileUrlStr = data.getStringExtra("URL_TEST");
            Log.v("pic url", "test" + picFileUrlStr); //여기도 안 찍힘.
            TextView picUrlTxt = (TextView)findViewById(R.id.receiveTxt);
            picUrlTxt.setText(picFileUrlStr);
        }
    }
}