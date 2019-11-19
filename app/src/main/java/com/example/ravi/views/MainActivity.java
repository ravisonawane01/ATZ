package com.example.ravi.views;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.ravi.R;

import com.example.ravi.databinding.ActivityMainBinding;
import com.example.ravi.models.Example;
import com.example.ravi.models.MainViewModel;
import com.example.ravi.views.adapters.ParentAdapter;
import com.example.ravi.views.adapters.SliderImageAdapter;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    MainViewModel mainViewModel;
    ParentAdapter parentAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        observeProductList();
        setImagesSlider();
    }

    private void setImagesSlider() {
        SliderImageAdapter sliderImageAdapter = new SliderImageAdapter(this);
        mainBinding.imageViewPager.setAdapter(sliderImageAdapter);
        mainBinding.dotsIndicator.setViewPager(mainBinding.imageViewPager);
        sliderImageAdapter.registerDataSetObserver(mainBinding.dotsIndicator.getDataSetObserver());
    }

    private void observeProductList() {
        mainViewModel.getProductListObservable().observe(this, new Observer<Example>() {
            @Override
            public void onChanged(Example example) {
                if (example != null) {
                    prepareRecyclerView(example);
                }
            }
        });
    }

    private void prepareRecyclerView(Example example) {
        parentAdapter = new ParentAdapter(this, example);
        mainBinding.rvParent.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mainBinding.rvParent.setAdapter(parentAdapter);
        parentAdapter.notifyDataSetChanged();
    }
}
