package com.example.intentexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //A액티비티에서 보낸 정보 받기
        Intent intent = getIntent();
        
        //일반 데이터 전달법
        String name = intent.getStringExtra("Name");

        //Bundle로 데이터 받기
        Bundle bundle = intent.getBundleExtra("Sample");

        if(bundle == null)
        {
            Toast.makeText(this, "Bundle Data Null!!", Toast.LENGTH_SHORT).show();

            return;
        }

        TextView receivedStr = (TextView)findViewById(R.id.name);

        TextView receivedBundleInt = (TextView)findViewById(R.id.bundleInt);
        TextView receivedBundleStr = (TextView)findViewById(R.id.bundleStr);

        receivedStr.setText(""+ name);
        receivedBundleInt.setText("" + bundle.getInt("Int"));
        receivedBundleStr.setText("" + bundle.getString("Str"));
    }
}