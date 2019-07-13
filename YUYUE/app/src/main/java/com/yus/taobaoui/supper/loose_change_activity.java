package com.yus.taobaoui.supper;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.yus.taobaoui.R;

public class loose_change_activity extends AppCompatActivity {
    private View loose_change_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loose_change_activity);

        loose_change_layout = findViewById(R.id.loosechangelayout);

        TextView title_back = (TextView)findViewById(R.id.title_back);
        TextView title_text = (TextView)findViewById(R.id.title_text);

        TextView my_moeny_text = (TextView) findViewById(R.id.my_money_text);

        Button chongzhi = (Button)findViewById(R.id.chongzhi);
        Button tixian = (Button)findViewById(R.id.tixian);


        /*
        设置字体加粗
         */
        TextPaint tb = my_moeny_text.getPaint();
        tb.setFakeBoldText(true);

        //   my_moeny_text.setText(); 改变逻辑实现与前一界面上的值相等；

        title_back.setText("返回");
        title_text.setText("我的零钱");

        loose_change_layout.setBackgroundColor(Color.parseColor("#ffffff"));

        chongzhi.setText("充值");

        tixian.setText("提现");
        //       chongzhi.setTextColor(Color.parseColor("#ffffff"));
        //      tixian.setBackgroundColor(Color.parseColor("A8A8A8"));

        /*
        零钱明细的点击事件跳转到Monday_Details_activity界面；
         */
        title_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loose_change_activity.this,MyWallet_activity.class);
                startActivity(intent);
            }
        });




    }
}
