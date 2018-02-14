package com.example.administrator.colorfuldrink;

import android.view.Gravity;
import android.view.View;
import android.widget.GridView;

import com.example.administrator.colorfuldrink.base.BaseApplication;
import com.example.administrator.colorfuldrink.base.BaseFragment;
import com.youth.banner.Banner;

/**
 * Description:
 * Created by Ming on 2018-2-13.
 * Email mingqiang@bailitop.com
 */

public class MainFragment extends BaseFragment {

    Banner banner;
    GridView gridView;
    MainMenuAdapter adapter;


    @Override
    protected int getLayoutID() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initView(View view) {
        banner = view.findViewById(R.id.banner);
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(BaseApplication.images);
        banner.start();

        gridView = view.findViewById(R.id.gv_menu);
        gridView.setVerticalSpacing(10);
        gridView.setGravity(Gravity.CENTER);
        adapter = new MainMenuAdapter(getContext());
        gridView.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        //开始轮播
        banner.startAutoPlay();
    }

    @Override
    public void onPause() {
        super.onPause();
        //结束轮播
        banner.stopAutoPlay();
    }
}
