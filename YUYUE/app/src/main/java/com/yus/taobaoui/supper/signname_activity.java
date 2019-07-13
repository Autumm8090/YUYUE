package com.yus.taobaoui.supper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.yus.taobaoui.R;

public class signname_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname_);
        ActionBar actionBar = getSupportActionBar();
        TextView tv_back=(TextView)findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //登录界面销毁
                signname_activity.this.finish();
            }
        });
        if (actionBar != null){
            actionBar.hide();
        }
        TextView title_text = (TextView)findViewById(R.id.title_text);
        EditText editText = (EditText)findViewById(R.id.edit_Text);

        title_text.setText("修改你的个性签名");
        //title_finish.setText("完成");

        /*
        需要修改逻辑 实现和前一页上面值的一样
         */

        editText.setText("欢迎");


    }
}
