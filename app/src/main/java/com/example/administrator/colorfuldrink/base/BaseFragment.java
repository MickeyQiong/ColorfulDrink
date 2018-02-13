package com.example.administrator.colorfuldrink.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Description:
 * Created by Ming on 2018-2-13.
 * Email mingqiang@bailitop.com
 */

public abstract class BaseFragment extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(getLayoutID(), container, false);
        }

        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null){
            viewGroup.removeView(view);
        }
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    abstract protected int getLayoutID();
    abstract protected void initView(View view);
}
