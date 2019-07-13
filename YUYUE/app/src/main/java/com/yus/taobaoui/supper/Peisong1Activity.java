package com.yus.taobaoui.supper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.yus.taobaoui.Choose_Activity;
import com.yus.taobaoui.R;

public class Peisong1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peisong1);
        ImageButton imageButton=(ImageButton)findViewById(R.id.imageView1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Peisong1Activity.this, PeisongActivity.class);
                startActivity(intent);
            }
        });
        TextView tv_back=(TextView)findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //登录界面销毁
                Peisong1Activity.this.finish();
            }
        });
    }
}
