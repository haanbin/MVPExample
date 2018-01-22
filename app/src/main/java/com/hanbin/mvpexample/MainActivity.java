package com.hanbin.mvpexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hanbin.mvpexample.util.ActivityUtil;
import com.hanbin.mvpexample.view.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityUtil.getInstance().replaceToActivityFragment(getSupportFragmentManager(), MainFragment.getInstance(), R.id.main_container);

    }
}
