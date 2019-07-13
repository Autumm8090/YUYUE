package com.yus.taobaoui.supper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.yus.taobaoui.R;

import java.util.ArrayList;
import java.util.List;

public class tablayout_Activity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    List<Fragment>fragments;
    String[]title={"全部","待付款","待发货","已发货","已完成"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_page4);
        tabLayout=(TabLayout) findViewById(R.id.tablayout);
        viewPager=(ViewPager) findViewById(R.id.viewpager);
        fragments=new ArrayList<>();
        fragments.add(new ddmyfragment1());
        fragments.add(new ddmyfragment2());
        fragments.add(new ddmyfragment3());
        fragments.add(new ddmyfragment4());
        fragments.add(new ddmyfragment5());
        adapter myadapter=new adapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(myadapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    private class adapter extends FragmentPagerAdapter
    {

        private List<Fragment>list;
        public adapter(FragmentManager fm,List<Fragment> list) {
            super(fm);
            this.list=list;
        }

        @Override
        public Fragment getItem(int i) {
            return list.get(i);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }
}
