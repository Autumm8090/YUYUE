package com.yus.taobaoui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yus.taobaoui.supper.Home2Activity;
import com.yus.taobaoui.supper.login_activity;
import com.yus.taobaoui.supper.saleActivity;
import com.yus.taobaoui.view.ClothesActivity;
import com.yus.taobaoui.view.DingdanActivity;

public class Choose_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_);
        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Choose_Activity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Choose_Activity.this, login_activity.class);
                startActivity(intent);
            }
        });
    }
}
