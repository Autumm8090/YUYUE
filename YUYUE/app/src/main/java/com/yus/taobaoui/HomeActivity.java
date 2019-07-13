package com.yus.taobaoui;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.yus.taobaoui.ui.NewTabActivity;
import com.yus.taobaoui.util.UIUtils;
import com.yus.taobaoui.view.ButtomBtn;
import com.yus.taobaoui.view.DingdanActivity;
import com.yus.taobaoui.view.DividerGridItemDecoration;
import com.yus.taobaoui.view.FlyBanner;
import com.yus.taobaoui.view.GridMenu;
import com.yus.taobaoui.view.ClothesActivity;
import com.yus.taobaoui.view.MeActivity;
import com.yus.taobaoui.view.MyStoreActivity;
import com.yus.taobaoui.view.SaleActivity;
import com.yus.taobaoui.view.StoreActivity;
import com.yus.taobaoui.view.SupplierActivity;
import com.yus.taobaoui.view.YslActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, View.OnClickListener, RvAdapter.OnItemClickListener {
    /**
     * 普通商品的（normalHolder）的标题集合
     */
    public String[] mStrs = {"adidas", "vans", "ysl", "aj","champion"};
    private SearchView mSearchView;
    private ListView lListView;
    static private int k=0;
    private List<String> normalGoodsTitls = new ArrayList<>();
    private String[] gridMenuTitles = new String[]{"衣服", "鞋子", "女包", "美妆", "母婴"};
    @BindView(R.id.buttomBtnScan)
    ButtomBtn buttomBtnScan;
    @BindView(R.id.bomBtnMsg)
    ButtomBtn bomBtnMsg;

    @BindView(R.id.bomBtnHome)
    ButtomBtn bomBtnHome;

    @BindView(R.id.bomBtnTiny)
    ButtomBtn bomBtnTiny;
    @BindView(R.id.bomBtnAsk)
    ButtomBtn bomBtnAsk;
    @BindView(R.id.bomBtnShopCar)
    ButtomBtn bomBtnShopCar;
    @BindView(R.id.bomBtnMy)
    ButtomBtn bomBtnMy;

    @BindView(R.id.swp)
    SwipeRefreshLayout swp;
    @BindView(R.id.rv)
    RecyclerView rv;
    private Handler mHandler;
    private List<String> bigPics;
    private List<String> smallPics = new ArrayList<>();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        ButterKnife.bind(this);
        initBigPics();
        initSmallPics();
        mHandler = new Handler();
        initTopBtn();
        initBomBtn();
        initRv();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    private void initBigPics() {
        bigPics = new ArrayList<>();
        bigPics.add("https://img.alicdn.com/imgextra/i3/791105148/O1CN01rfIihx1ntpRhYeHlP_!!791105148.jpg");
        bigPics.add("https://gd1.alicdn.com/imgextra/i2/4203112040/O1CN01ksNE7k1QwMSvWbGPV_!!4203112040.jpg");
        bigPics.add("https://gd3.alicdn.com/imgextra/i3/650022218/TB2ju9SlwKTBuNkSne1XXaJoXXa_!!650022218.jpg\n");
        bigPics.add("https://gd1.alicdn.com/imgextra/i1/1765107423/O1CN01YgZ9oY24hmUcaUZaK_!!1765107423.jpg");
        bigPics.add("https://gd4.alicdn.com/imgextra/i1/33479751/TB2WC3KnBjTBKNjSZFwXXcG4XXa_!!33479751.jpg");
    }

    private void initSmallPics() {
        smallPics.add("http://ob9thtnhs.bkt.clouddn.com/tuisong/37895e3d741e4c17a032781e33e76507.jpg?e=1477622637&token=m2BF8x75sZF4DIfwnxFri5sT51HeuFRmU2Ue0uVf:U1V7RIOesNu_pz2r48LpaXXlYUo=");
        smallPics.add("http://ob9thtnhs.bkt.clouddn.com/tuisong/7b7256de5e854d7fa842e5ae72f98a74.jpg?e=1477544893&token=m2BF8x75sZF4DIfwnxFri5sT51HeuFRmU2Ue0uVf:yaDTDbhakBFP22cy0eAfHjPfTB4=");

    }

    private void initTopBtn() {
        buttomBtnScan.setIvAndTv(R.drawable.scan, "扫一扫");
        buttomBtnScan.setTvColor(Color.WHITE);
        bomBtnMsg.setIvAndTv(R.drawable.comment, "消息");
        bomBtnMsg.setTvColor(Color.WHITE);
    }

    private void initBomBtn() {
        bomBtnHome.setIvAndTv(R.drawable.home_fill, "首页");
        bomBtnHome.setTvColor(Color.parseColor("#d81e06"));

        bomBtnTiny.setIvAndTv(R.drawable.we, "销售方");
        bomBtnTiny.setTvColor(getResources().getColor(R.color.font33));

        bomBtnAsk.setIvAndTv(R.drawable.ask, "供货商");
        bomBtnAsk.setTvColor(getResources().getColor(R.color.font33));

        bomBtnShopCar.setIvAndTv(R.drawable.cart, "下单");
        bomBtnShopCar.setTvColor(getResources().getColor(R.color.font33));

        bomBtnMy.setIvAndTv(R.drawable.my, "我的");
        bomBtnMy.setTvColor(getResources().getColor(R.color.font33));
    }

    private void initRv() {
        swp.setOnRefreshListener(this);
        RvAdapter rvAdapter = new RvAdapter(normalGoodsTitls);
        rvAdapter.setmOnItemClickLitener(this);

        initBannerTop(rvAdapter);
        initGridMenu(rvAdapter);
        initHeadLines(rvAdapter);
        initSnapUp(rvAdapter);
        initMiddleBannner(rvAdapter);
        initHotMarket(rvAdapter);
        initGoodsTrend(rvAdapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        // 设置布局管理一条数据占用几行，如果是头布局则头布局自己占用一行
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int postion) {
                if (postion == 0) {
                    return 2;
                } else if (postion == 1) {
                    return 2;
                } else if (postion == 2) {
                    return 2;
                } else if (postion == 3) {
                    return 2;
                } else if (postion == 4) {
                    return 2;
                } else if (postion == 5) {
                    return 2;
                } else if (postion == 6) {
                    return 2;
                } else {
                    return 1;
                }
            }
        });
        rv.setLayoutManager(gridLayoutManager);
        rv.setAdapter(rvAdapter);
        rv.addItemDecoration(new DividerGridItemDecoration(this));

    }

    private void initBannerTop(RvAdapter rvAdapter) {
        View bannerBigView = View.inflate(UIUtils.getContext(), R.layout.banner_top, null);
        FlyBanner bannerTop = (FlyBanner) bannerBigView.findViewById(R.id.bannerTop);
        rvAdapter.addHeadView0(bannerBigView);
        bannerTop.setImagesUrl(bigPics);
        bannerTop.setOnItemClickListener(new FlyBanner.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                UIUtils.showToast("position--->" + position);
            }
        });
    }

    /**
     * 初始化10个子菜单
     */
    private void initGridMenu(RvAdapter rvAdapter) {
        View gridMenu = View.inflate(UIUtils.getContext(), R.layout.grid_menu_10, null);

        List<GridMenu> gridMenus = new ArrayList<>();
        GridMenu gridCat = (GridMenu) gridMenu.findViewById(R.id.gridCat);
        GridMenu gridJHS = (GridMenu) gridMenu.findViewById(R.id.gridJHS);
        GridMenu gridTMgj = (GridMenu) gridMenu.findViewById(R.id.gridTMgj);
        GridMenu grid_wm = (GridMenu) gridMenu.findViewById(R.id.grid_wm);
        GridMenu grid_tmcs = (GridMenu) gridMenu.findViewById(R.id.grid_tmcs);


        gridMenus.add(gridCat);
        gridMenus.add(gridJHS);
        gridMenus.add(gridTMgj);
        gridMenus.add(grid_wm);
        gridMenus.add(grid_tmcs);


        initGridMenuAttr(gridMenus);
        initOnCLick(gridMenus);
        rvAdapter.addHeaderView1(gridMenu);

    }

    /**
     * 初始化淘宝头条
     */
    private void initHeadLines(RvAdapter rvAdapter) {
        View headLineView = View.inflate(UIUtils.getContext(), R.layout.tao_bao_headline, null);
        LinearLayout ll_headline = (LinearLayout) headLineView.findViewById(R.id.ll_headline);
        ll_headline.setOnClickListener(this);
        rvAdapter.addHeaderView2(headLineView);
    }

    /**
     * 初始化抢购
     */
    private void initSnapUp(RvAdapter rvAdapter) {
        View snapUpView = View.inflate(UIUtils.getContext(), R.layout.snapup_layout, null);
        snapUpView.findViewById(R.id.ll_qtg).setOnClickListener(this);
        snapUpView.findViewById(R.id.ll_yhh).setOnClickListener(this);
        snapUpView.findViewById(R.id.ll_agj).setOnClickListener(this);
        snapUpView.findViewById(R.id.ll_bmqd).setOnClickListener(this);
        rvAdapter.addHeaderView3(snapUpView);
    }

    /**
     * 初始化中间的banner
     */
    private void initMiddleBannner(RvAdapter rvAdapter) {
        View middleBannerView = View.inflate(UIUtils.getContext(), R.layout.banner_middle, null);
        FlyBanner bannerMiddle = (FlyBanner) middleBannerView.findViewById(R.id.bannerMiddle);
        rvAdapter.addHeaderView4(middleBannerView);
        bannerMiddle.setImagesUrl(smallPics);
        bannerMiddle.setOnItemClickListener(new FlyBanner.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                UIUtils.showToast("position--->" + position);
            }
        });
    }

    /**
     * 初始化潮流商品
     */
    private void initGoodsTrend(RvAdapter rvAdapter) {
        View goodsTrendView = View.inflate(UIUtils.getContext(), R.layout.goods_trend, null);
        goodsTrendView.findViewById(R.id.goodsSectionIfashion).setOnClickListener(this);
        goodsTrendView.findViewById(R.id.goodsSectionCWC).setOnClickListener(this);
        goodsTrendView.findViewById(R.id.goodsSectionqbb).setOnClickListener(this);
        goodsTrendView.findViewById(R.id.goodsSectionZqtd).setOnClickListener(this);

        rvAdapter.addHeaderView6(goodsTrendView);
    }

    private void initHotMarket(RvAdapter rvAdapter) {
        View hotMarketView = View.inflate(UIUtils.getContext(), R.layout.hot_market, null);
        hotMarketView.findViewById(R.id.rl_hotMarket).setOnClickListener(this);
        rvAdapter.addHeaderView5(hotMarketView);
    }

    /**
     * 设置10个子菜单的图片和文字
     */
    private void initGridMenuAttr(List<GridMenu> gridMenus) {
        for (int i = 0; i < gridMenus.size(); i++) {
            GridMenu gridMenu = gridMenus.get(i);
            if (i == 0) gridMenu.setAttr(R.drawable.art_collection, gridMenuTitles[i]);
            if (i == 1) gridMenu.setAttr(R.drawable.art_collection1, gridMenuTitles[i]);
            if (i == 2) gridMenu.setAttr(R.drawable.art_collection2, gridMenuTitles[i]);
            if (i == 3) gridMenu.setAttr(R.drawable.art_collection3, gridMenuTitles[i]);
            if (i == 4) gridMenu.setAttr(R.drawable.art_collection4, gridMenuTitles[i]);
        }
    }

    private void initOnCLick(List<GridMenu> gridMenus) {
        for (GridMenu gridMenu : gridMenus) {
            gridMenu.setOnClickListener(this);
        }
    }

    @OnClick(R.id.buttomBtnScan)
    public void clickScan(View v) {
        UIUtils.showToast("扫一扫");
    }

    @OnClick(R.id.bomBtnMsg)
    public void clickMsg(View v) {
        UIUtils.showToast("消息");
    }

    @OnClick(R.id.ll_search)
    public void clickSearch(View v) {
        UIUtils.showToast("搜索");
    }

    @OnClick(R.id.iv_photo)
    public void clickPhoto(View v) {
        UIUtils.showToast("拍照");
    }


    @OnClick(R.id.bomBtnHome)
    public void bomBtnHome(View v) {
        UIUtils.showToast("首页");
    }

    @OnClick(R.id.bomBtnTiny)
    public void bomBtnTiny(View v) {
        UIUtils.showToast("销售方");
        Intent intent = new Intent(HomeActivity.this, SaleActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.bomBtnAsk)
    public void bomBtnAsk(View v) {
        UIUtils.showToast("供货商");
        if(k==0){
        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(intent);
        k++;
        }
        else{
            Intent intent = new Intent(HomeActivity.this, SupplierActivity.class);
            startActivity(intent);
        }
    }

    @OnClick(R.id.bomBtnShopCar)
    public void bomBtnShopCar(View v) {
        UIUtils.showToast("下单");
        Intent intent = new Intent(HomeActivity.this, StoreActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.bomBtnMy)
    public void bomBtnMy(View v) {
        UIUtils.showToast("我的");
        Intent intent = new Intent(HomeActivity.this, MeActivity.class);
        startActivity(intent);
    }

    public void onRefresh() {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                swp.setRefreshing(false);
            }
        }, 1500);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.gridCat://天猫
                UIUtils.showToast("衣服");
                Intent intent = new Intent(HomeActivity.this, ClothesActivity.class);
                startActivity(intent);
                break;
            case R.id.gridJHS://聚划算
                UIUtils.showToast("鞋子");
                break;
            case R.id.gridTMgj://天猫国际
                UIUtils.showToast("女包");
                break;
            case R.id.grid_wm://外卖
                UIUtils.showToast("美妆");
                break;
            case R.id.grid_tmcs://天猫超市
                UIUtils.showToast("母婴");
                break;
            case R.id.ll_headline://淘宝头条
                UIUtils.showToast("new鱼悦");
                break;

            case R.id.rl_hotMarket:
                UIUtils.showToast("热门商品");
                break;
            case R.id.goodsSectionIfashion:
            case R.id.goodsSectionCWC:
            case R.id.goodsSectionqbb:
            case R.id.goodsSectionZqtd:
                String msg = "";
                if (v.getId() == R.id.goodsSectionIfashion) {
                    msg = "ELAN";
                } else if (v.getId() == R.id.goodsSectionCWC) {
                    msg = "Dyson";
                } else if (v.getId() == R.id.goodsSectionqbb) {
                    msg = "Estee Lauder";
                } else if (v.getId() == R.id.goodsSectionZqtd) {
                    msg = "Aptamil";
                }
                UIUtils.showToast(msg);
                break;
        }
    }

    @Override
    public void onItemClick(View v, int postion) {
        UIUtils.showToast("item click postion " + postion);
    }

    @Override
    public void onItemLongClick(View v, int postion) {
        UIUtils.showToast("item long click postion " + postion);

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }
    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
    public void search(){

        mSearchView = (SearchView) findViewById(R.id.searchView);
        lListView = (ListView) findViewById(R.id.listView);
        //lListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mStrs));
        lListView.setTextFilterEnabled(true);

        // 设置搜索文本监听
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            // 当点击搜索按钮时触发该方法
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            // 当搜索内容改变时触发该方法
            @Override
            public boolean onQueryTextChange(String newText) {
                if (!TextUtils.isEmpty(newText)){
                    lListView.setFilterText(newText);
                }else{
                    lListView.clearTextFilter();
                }
                return false;
            }
        });
    }
}
