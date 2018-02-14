package com.example.administrator.colorfuldrink;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.colorfuldrink.base.BaseApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Created by Ming on 2018-2-14.
 * Email mingqiang@bailitop.com
 */

public class MainMenuAdapter extends BaseAdapter {

    Context mContext;
    private String[] mainMenuText = {"咖啡", "茶", "鸡尾酒", "小吃"};
    private int[] mainMenuImg = {R.drawable.coffee,R.drawable.tea,R.drawable.cocktail,R.drawable.cake};

    MainMenuAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.main_menu_item,viewGroup,false);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv_menu_pic);
            holder.textView = view.findViewById(R.id.tv_menu_text);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.imageView.setImageDrawable(mContext.getResources().getDrawable(mainMenuImg[i]));
        holder.textView.setText(mainMenuText[i]);
        return view;
    }

    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
