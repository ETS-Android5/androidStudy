package com.example.viewtest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_test_main);
        TextView textView = (TextView) findViewById(R.id.id_test_view);
        textView.setText("hihihi");

        /*
        //btnView2 등록
        Button btnView2 = findViewById(R.id.btnView2);
        btnView2.setOnKeyListener(keyListenerTest);
         */
    }

    //onButtonClick 이벤트 등록하게 되면
    public void onButtonClick(View v)
    {
        Toast.makeText(this, "버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();
    }

    private long mExitModeExit = 0L;

    //뒤로가기 2번 누르면
    @Override
    public void onBackPressed()
    {
        if(mExitModeExit != 0 && SystemClock.uptimeMillis() - mExitModeExit < 3000)
        {
            finish();
        }
        else
        {
            Toast.makeText(this, "이전 키를 한번 더 누르면 종료", Toast.LENGTH_SHORT).show();
            mExitModeExit = SystemClock.uptimeMillis();
        }
    }

    /*
    View.OnKeyListener keyListenerTest = new View.OnKeyListener() {
        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if(event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_B && event.isLongPress() == true)
            {
                Toast.makeText(getApplicationContext(), "B키가 길게 눌러짐.", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    };
     */

}