package com.yus.taobaoui.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.yus.taobaoui.R;
import com.yus.taobaoui.ui.NewTabActivity;

public class StoreActivity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private TextView tv_back;//返回键
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        tv_back=(TextView)findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //登录界面销毁
                StoreActivity.this.finish();
            }
        });
        button1 = (ImageButton) findViewById(R.id.Image1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoreActivity.this, NewTabActivity.class);
                startActivity(intent);
            }
        });
        button2 = (ImageButton) findViewById(R.id.Image2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoreActivity.this, DingdanActivity.class);
                startActivity(intent);
            }
        });
        button3 = (ImageButton) findViewById(R.id.Image3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoreActivity.this, ELANDActivity.class);
                startActivity(intent);
            }
        });
        button4 = (ImageButton) findViewById(R.id.Image4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoreActivity.this, ThenorthfaceActivity.class);
                startActivity(intent);
            }
        });
        button5 = (ImageButton) findViewById(R.id.Image5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoreActivity.this, MyStoreActivity.class);
                startActivity(intent);
            }
        });
    }
}
