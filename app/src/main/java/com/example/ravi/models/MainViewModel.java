package com.example.ravi.models;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;

import com.example.ravi.Utils;

public class MainViewModel extends AndroidViewModel {

    private final MutableLiveData<Example> productListObservable;

    public MainViewModel(@NonNull Application application) {
        super(application);
        productListObservable = new MutableLiveData<>();
        String data = Utils.getAssetJsonData(getApplication());
        productListObservable.postValue(new Gson().fromJson(data, Example.class));
    }

    public MutableLiveData<Example> getProductListObservable() {
        return productListObservable;
    }
}
