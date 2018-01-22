package com.hanbin.mvpexample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanbin.mvpexample.R;
import com.hanbin.mvpexample.adapter.viewholder.MainViewHolder;
import com.hanbin.mvpexample.data.MainItem;
import com.hanbin.mvpexample.onclick.MainOnClickListener;

import java.util.ArrayList;

/**
 * Created by hanbin on 2018. 1. 21..
 */

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private MainOnClickListener mMainOnClickListener;
    private ArrayList<MainItem> mMainItem;

    public MainAdapter(MainOnClickListener mainOnClickListener) {
        mMainOnClickListener = mainOnClickListener;
        mMainItem = new ArrayList<>();
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_main_item, parent, false);
        MainViewHolder mainViewHolder = new MainViewHolder(view);
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.onBindView(mMainOnClickListener, mMainItem.get(position));
    }

    @Override
    public int getItemCount() {
        return mMainItem.size();
    }

    public void addItem(MainItem mainItem){
        mMainItem.add(mainItem);
        notifyItemChanged(mMainItem.size()-1);
    }
    public void removeItem(int position){
        mMainItem.remove(position);
    }
}
