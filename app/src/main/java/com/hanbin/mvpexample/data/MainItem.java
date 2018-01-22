package com.hanbin.mvpexample.data;

/**
 * Created by hanbin on 2017. 8. 16..
 */

public class MainItem {
    private String title;
    private int imageRes;

    public MainItem(String title, int imageRes) {
        this.title = title;
        this.imageRes = imageRes;
    }

    public String getTitle() {
        return title;
    }

    public int getImageRes() {
        return imageRes;
    }
}
