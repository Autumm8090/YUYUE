package com.yus.taobaoui.supper;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.yus.taobaoui.Choose_Activity;
import com.yus.taobaoui.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.yus.taobaoui.view.ChampionActivity;
import com.yus.taobaoui.view.ClothesActivity;
import com.yus.taobaoui.view.DingdanActivity;
import com.yus.taobaoui.view.MeActivity;
import com.yus.taobaoui.view.MyStoreActivity;

import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.CropCircleTransformation;


public class PersonFragment extends AppCompatActivity {
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private TextView tv_back;//返回键



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_page3);
        tv_back=(TextView)findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //登录界面销毁
                PersonFragment.this.finish();
            }
        });

        button2 = (Button) findViewById(R.id.btn_login1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonFragment.this, Nickname_Activity.class);
                startActivity(intent);
            }
        });
        button3 = (Button) findViewById(R.id.btn_login2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonFragment.this, Sex_Activity.class);
                startActivity(intent);
            }
        });
        button4 = (Button) findViewById(R.id.btn_login3);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonFragment.this, signname_activity.class);
                startActivity(intent);
            }
        });
        button5 = (Button) findViewById(R.id.btn_login4);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonFragment.this, MyWallet_activity.class);
                startActivity(intent);
            }
        });

        button6 = (Button) findViewById(R.id.btn_login5);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonFragment.this, collect_activity.class);
                startActivity(intent);
            }
        });
        button7 = (Button) findViewById(R.id.btn_login6);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonFragment.this, about_activity.class);
                startActivity(intent);
            }
        });
        button8 = (Button) findViewById(R.id.btn_login7);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonFragment.this, Choose_Activity.class);
                startActivity(intent);
            }
        });
        button9 = (Button) findViewById(R.id.btn_login8);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonFragment.this, MyStoreActivity.class);
                startActivity(intent);
            }
        });

    }

}

