package com.hanbin.mvpexample.data;


import com.hanbin.mvpexample.R;

import java.util.ArrayList;

/**
 * Created by hanbin on 2017. 8. 16..
 */

public class MainData {

    private static MainData mainData;


    public ArrayList<MainItem> getMainItemArrayList() {
        ArrayList<MainItem> items = new ArrayList<>();
        items.add(new MainItem("twice1twice1twice1twice1twice1twice1twice1twice1twice1twice1twice1", R.drawable.twice_01));
        items.add(new MainItem("twice2", R.drawable.twice_02));
        items.add(new MainItem("twice", R.drawable.twice_03));
        items.add(new MainItem("twice", R.drawable.twice_04));
        items.add(new MainItem("twice", R.drawable.twice_05));
        items.add(new MainItem("twice", R.drawable.twice_06));
        items.add(new MainItem("twice", R.drawable.twice_07));
        items.add(new MainItem("twice", R.drawable.twice_08));
        items.add(new MainItem("twice", R.drawable.twice_09));


        return items;
    }


}
