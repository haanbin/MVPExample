package com.hanbin.mvpexample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanbin.mvpexample.R;
import com.hanbin.mvpexample.adapter.MainAdapter;
import com.hanbin.mvpexample.data.MainItem;
import com.hanbin.mvpexample.onclick.MainOnClickListener;
import com.hanbin.mvpexample.presenter.MainContract;
import com.hanbin.mvpexample.presenter.impl.MainPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hanbin on 2018. 1. 21..
 */

public class MainFragment extends Fragment implements MainContract.view, MainOnClickListener {

    @BindView(R.id.main_recyclerView)
    RecyclerView mRecyclerView;

    private MainContract.presenter mPresenter;
    private MainAdapter mMainAdapter;

    public static MainFragment getInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init() {
        mMainAdapter = new MainAdapter(this);
        mPresenter = new MainPresenterImpl(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setAdapter(mMainAdapter);

        mPresenter.loadItem();
    }

    // MainContract.view interface
    @Override
    public void showProgressbar() {

    }

    @Override
    public void hideProgressbar() {

    }

    @Override
    public void showFailLoad() {

    }

    @Override
    public void addItem(MainItem data) {
        mMainAdapter.addItem(data);
    }

    @Override
    public void showEmptyVIew() {

    }

    //recyclerView item clickListener
    @Override
    public void onMainItemClicked(int position) {
        Snackbar.make(getView(), "RecyclerView " + position + "Clicked", Snackbar.LENGTH_SHORT);
    }
}
