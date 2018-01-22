package com.hanbin.mvpexample.presenter.impl;

import com.hanbin.mvpexample.data.MainData;
import com.hanbin.mvpexample.data.MainItem;
import com.hanbin.mvpexample.presenter.MainContract;

/**
 * Created by hanbin on 2018. 1. 21..
 */

public class MainPresenterImpl implements MainContract.presenter {

    private MainContract.view mView;

    public MainPresenterImpl(MainContract.view view) {
        mView = view;
    }

    @Override
    public void loadItem() {
        mView.showProgressbar();
        /**
         *  server connect error
         *  mView.showFailLoad();
         *  mView.showEmptyVIew();
         */
        MainData mainData = new MainData();
        for (MainItem mainItem : mainData.getMainItemArrayList()) {
            mView.addItem(mainItem);
        }

        mView.hideProgressbar();
    }
}
