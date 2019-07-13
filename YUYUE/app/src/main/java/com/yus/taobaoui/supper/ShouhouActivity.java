package com.yus.taobaoui.supper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yus.taobaoui.R;
import com.yus.taobaoui.view.ClothesActivity;

public class ShouhouActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouhou);
        TextView tv_back=(TextView)findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //登录界面销毁
                ShouhouActivity.this.finish();
            }
        });
    }
}
