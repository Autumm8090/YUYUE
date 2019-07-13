package com.yus.taobaoui.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yus.taobaoui.R;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yus.taobaoui.R;

public class YslActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ysl);
        TextView tv_back;//返回键
        tv_back=(TextView)findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //登录界面销毁
                YslActivity.this.finish();
            }
        });
        Button button=(Button)findViewById(R.id.dianhua) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //为了跳转到注册界面，并实现注册功能
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:88888888"));
                startActivity(intent);
            }
        });
    }
}
