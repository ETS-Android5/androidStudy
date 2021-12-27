package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View v)
    {
        //1. 인텐트 생성
        Intent intent = new Intent();

        //2. 인텐트 실행할 패키지 액티비티 정보
        ComponentName componentName = new ComponentName(
                "com.example.intentexample2", "com.example.intentexample2.MainActivityB"
        );
        intent.setComponent(componentName);

        //정보 실어서 보내기
        intent.putExtra("Name", "Su Heon Kim");

        //Bundle로 정보 실어서 보내기
        Bundle bundle = new Bundle();
        bundle.putInt("Int", 1234);
        bundle.putString("Str", "Bundle String");

        intent.putExtra("Sample", bundle);

        //3. B액티비티 실행
        startActivity(intent);
    }

    public void Cal(View v)
    {
        Intent intent = new Intent();

        //1. 단말기에 설치된 앱을 실행했을 때 가장 먼저 실행되는 액티비티 보여달라는 액션
        intent.setAction(Intent.ACTION_MAIN);

        //2. 안드로이드 기본 앱 중 계산기 카테고리
        intent.addCategory(Intent.CATEGORY_APP_CALCULATOR);

        //시작
        startActivity(intent);
        
    }
}