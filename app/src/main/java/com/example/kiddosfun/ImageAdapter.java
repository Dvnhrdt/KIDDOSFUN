package com.example.kiddosfun;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context context;

    public ImageAdapter(Context context)
    {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;
        if (convertView == null)
        {
            imageView = new ImageView(this.context);
            imageView.setLayoutParams(new GridView.LayoutParams(480,480));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }

        else imageView = (ImageView)convertView;


        imageView.setImageResource(R.drawable.bt_kotakbiru1);
        return imageView;
    }
}
