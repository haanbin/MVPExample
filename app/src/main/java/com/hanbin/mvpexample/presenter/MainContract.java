package com.hanbin.mvpexample.presenter;

import com.hanbin.mvpexample.data.MainItem;

/**
 * Created by hanbin on 2018. 1. 21..
 */

public interface MainContract {

    interface view{

        void showProgressbar();

        void hideProgressbar();

        void showFailLoad();

        void addItem(MainItem data);

        void showEmptyVIew();

    }

    interface presenter{

        void loadItem();
    }

}
