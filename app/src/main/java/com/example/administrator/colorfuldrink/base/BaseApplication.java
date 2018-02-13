package com.example.administrator.colorfuldrink.base;

import android.app.Application;
import android.content.Context;

import com.example.administrator.colorfuldrink.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * Created by Ming on 2018-2-13.
 * Email mingqiang@bailitop.com
 */

public class BaseApplication extends Application {

    public static ArrayList images = new ArrayList();
    public Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = this;

        String[] urls = getResources().getStringArray(R.array.url);
        List list = Arrays.asList(urls);
        images = new ArrayList(list);
    }
}
