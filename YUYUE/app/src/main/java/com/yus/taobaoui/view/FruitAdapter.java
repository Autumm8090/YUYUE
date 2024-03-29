package com.yus.taobaoui.view;


import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.yus.taobaoui.R;

import java.util.List;

import static android.support.v7.recyclerview.R.styleable.RecyclerView;

public class FruitAdapter  extends RecyclerView.Adapter<FruitAdapter.ViewHolder>{
    private List<Fruit> mFruitList;

//内部类，继承自RecyclerView.ViewHolder
//接收一个View ，通常就是RecyclerView子项的最外层布局，
//所以就可以用findViewById 来获取控件

static class  ViewHolder extends RecyclerView.ViewHolder{
    ImageButton imageView;
    TextView TextName;
    public ViewHolder(View View) {
        super(View);

        imageView = (ImageButton)View.findViewById(R.id.fruit_item);
        TextName = (TextView) View.findViewById(R.id.Tv);
    }
}
    //将要展示的数据传递进来，
    FruitAdapter(List<Fruit> list){
        this.mFruitList = list ;
    }
    //将fruit_item 布局加载进来，然后创建一个ViewHolder实例，
    //将加载的布局传给ViewHolder的构造函数中。就可以获取布局中的控件
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    //这个方法会在屏幕滚动的时候执行
    // 通过position获取到Fruit 的实例，然后给布局上的控件进行赋值，
    @Override
    public void onBindViewHolder(FruitAdapter.ViewHolder holder, int position) {

        Fruit fruit = mFruitList.get(position);
        holder.imageView.setImageResource(fruit.getImageId());
        holder.TextName.setText(fruit.getName());
    }
    //他用于告诉RecyclerView有多少子项，直接返回数据源的长度就行了
    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
