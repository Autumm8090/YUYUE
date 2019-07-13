package com.yus.taobaoui.supper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.yus.taobaoui.R;

public class collect_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect_activity);


        TextView title_text = (TextView)findViewById(R.id.title_text);


        title_text.setText("我的收藏");



    }
}
