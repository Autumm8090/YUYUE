package com.yus.taobaoui.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yus.taobaoui.Choose_Activity;
import com.yus.taobaoui.R;

public class MeActivity extends AppCompatActivity {

    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private TextView tv_back;//返回键



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        tv_back=(TextView)findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //登录界面销毁
                MeActivity.this.finish();
            }
        });

        button2 = (Button) findViewById(R.id.btn_login1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeActivity.this, ELANDActivity.class);
                startActivity(intent);
            }
        });
        button3 = (Button) findViewById(R.id.btn_login2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeActivity.this, DingdanActivity.class);
                startActivity(intent);
            }
        });
        button4 = (Button) findViewById(R.id.btn_login3);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeActivity.this, MyStoreActivity.class);
                startActivity(intent);
            }
        });
        button5 = (Button) findViewById(R.id.btn_login4);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeActivity.this, Choose_Activity.class);
                startActivity(intent);
            }
        });

    }

}

