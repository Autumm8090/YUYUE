package com.yus.taobaoui.supper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.yus.taobaoui.R;

import org.w3c.dom.Text;

public class MyWallet_activity extends AppCompatActivity {

    private View my_wallet_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wallet_activity);

        ImageView creditcard = (ImageView) findViewById(R.id.creditcard);
        ImageView loosechange = (ImageView) findViewById(R.id.loosechange);

        my_wallet_layout = findViewById(R.id.mywalletlayout);
        TextView title_text = (TextView)findViewById(R.id.title_text);
        TextView mywallet = (TextView)findViewById(R.id.mywallet);
        TextView mycreditcard = (TextView)findViewById(R.id.mycreditcard);
        TextView title_back = (TextView)findViewById(R.id.title_back);
        //TextView title_finish = (TextView) findViewById(R.id.title_finish);

        title_text.setText("我的钱包");
//        title_text.setGravity(Gravity.CENTER);
        title_text.setTextColor(Color.parseColor("#ffffff"));
        title_back.setTextColor(Color.parseColor("#ffffff"));
        // title_finish.setVisibility(View.INVISIBLE);

        my_wallet_layout.setBackgroundColor(Color.parseColor("#696969"));

        title_back.setText("我");
        mywallet.setText("零钱￥14312.23");
        mycreditcard.setText("银行卡");

        creditcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyWallet_activity.this,loose_change_activity.class);
                startActivity(intent);

            }
        });
        loosechange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyWallet_activity.this,loose_change_activity.class);
                startActivity(intent);

            }
        });
        //   mywallet.setTextSize();
        //   mycreditcard.setTextSize();
        //  mywallet.setGravity();
        //  mycreditcard.setGravity();

    }
}
