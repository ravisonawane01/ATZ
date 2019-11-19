package com.example.ravi.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TopTrendingCat {

    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("subCategories")
    private List<SubCategory> subCategories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

}
