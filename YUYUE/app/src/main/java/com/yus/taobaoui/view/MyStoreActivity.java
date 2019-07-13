package com.yus.taobaoui.view;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.yus.taobaoui.R;
import com.yus.taobaoui.ui.NewTabActivity;

public class MyStoreActivity extends AppCompatActivity {
private ImageButton button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_store);
        TextView tv_back;//返回键
        tv_back=(TextView)findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //登录界面销毁
                MyStoreActivity.this.finish();
            }
        });
        button1 = (ImageButton) findViewById(R.id.Image1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyStoreActivity.this, NewTabActivity.class);
                startActivity(intent);
            }
        });
    }
}
