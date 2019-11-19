package com.example.ravi.views.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.ravi.R;

import org.jetbrains.annotations.NotNull;

public class SliderImageAdapter extends PagerAdapter {

    Activity activity;

    public SliderImageAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return object == view;
    }

    @NotNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(activity).inflate(R.layout.image_item, null);
        ImageView imageView = view.findViewById(R.id.imageView);
        Glide.with(activity)
                .load(getImageAt(position))
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    private int getImageAt(int position) {
        switch (position) {
            case 0:
                return R.drawable.one;
            case 1:
                return R.drawable.two;
            case 2:
                return R.drawable.three;
            case 3:
                return R.drawable.one;
            default:
                return R.drawable.two;
        }
    }
}
