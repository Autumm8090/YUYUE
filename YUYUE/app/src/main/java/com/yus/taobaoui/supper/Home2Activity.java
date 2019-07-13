package com.yus.taobaoui.supper;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.yus.taobaoui.HomeActivity;
import com.yus.taobaoui.LoginActivity;
import com.yus.taobaoui.R;
import com.yus.taobaoui.util.UIUtils;
import com.yus.taobaoui.view.ButtomBtn;
import com.yus.taobaoui.view.ChampionActivity;
import com.yus.taobaoui.view.ClothesActivity;
import com.yus.taobaoui.view.DingdanActivity;
import com.yus.taobaoui.view.ELANDActivity;
import com.yus.taobaoui.view.MeActivity;
import com.yus.taobaoui.view.MyStoreActivity;
import com.yus.taobaoui.view.SaleActivity;
import com.yus.taobaoui.view.StoreActivity;
import com.yus.taobaoui.view.SupplierActivity;
import com.yus.taobaoui.view.ThenorthfaceActivity;

import butterknife.BindView;
import butterknife.OnClick;

import static com.yus.taobaoui.R.id.bomBtnAsk;
import static com.yus.taobaoui.R.id.bomBtnHome;
import static com.yus.taobaoui.R.id.bomBtnMy;
import static com.yus.taobaoui.R.id.bomBtnShopCar;
import static com.yus.taobaoui.R.id.bomBtnTiny;

public class Home2Activity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;
    private ImageButton BUTTON4;
    private ImageButton BUTTON2;
    private ImageButton BUTTON3;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        button1 = (ImageButton) findViewById(R.id.imageButton3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, saleActivity.class);
                startActivity(intent);
            }
        });
        button2 = (ImageButton) findViewById(R.id.imageButton4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, ChangkuActivity.class);
                startActivity(intent);
            }
        });
        button3 = (ImageButton) findViewById(R.id.imageButton2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, PersonActivity.class);
                startActivity(intent);
            }
        });
        button4 = (ImageButton) findViewById(R.id.imageButton5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, Peisong1Activity.class);
                startActivity(intent);
            }
        });
        button5 = (ImageButton) findViewById(R.id.imageButton6);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, ShouhouActivity.class);
                startActivity(intent);
            }
        });
        button6 = (ImageButton) findViewById(R.id.imageButton7);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, NewsActivity.class);
                startActivity(intent);
            }
        });
        BUTTON2 = (ImageButton) findViewById(R.id.BUTTON2);
        BUTTON2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, salenewActivity.class);
                startActivity(intent);
            }
        });
        BUTTON3 = (ImageButton) findViewById(R.id.BUTTON3);
        BUTTON3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, tablayout_Activity.class);
                startActivity(intent);
            }
        });
        BUTTON4 = (ImageButton) findViewById(R.id.BUTTON4);
        BUTTON4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, PersonFragment.class);
                startActivity(intent);
            }
        });

    }
}

