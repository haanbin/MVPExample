package com.hanbin.mvpexample.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by undetermined on 2017-03-24.
 */

public class ActivityUtil {

    private static ActivityUtil activityUtil;

    public static ActivityUtil getInstance() {
        if (activityUtil == null) {
            activityUtil = new ActivityUtil();
        }
        return activityUtil;
    }

    public void replaceToActivityFragment(FragmentManager fragmentManager,
                                          Fragment fragment, int fragmentId) {
        fragmentManager.beginTransaction()
                .replace(fragmentId, fragment)
                .commit();

    }

}
