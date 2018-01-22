package com.hanbin.mvpexample.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanbin.mvpexample.R;
import com.hanbin.mvpexample.data.MainItem;
import com.hanbin.mvpexample.onclick.MainOnClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hanbin on 2018. 1. 21..
 */

public class MainViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.main_item_imageView)
    ImageView mImageView;

    @BindView(R.id.main_item_textView)
    TextView mTextView;

    public MainViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void onBindView(final MainOnClickListener mainOnClickListener, MainItem mainItem) {
        mImageView.setImageResource(mainItem.getImageRes());
        mTextView.setText(mainItem.getTitle());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainOnClickListener.onMainItemClicked(getAdapterPosition());
            }
        });
    }


}
