package com.example.ravi.models;

import com.google.gson.annotations.SerializedName;

public class SubCategory {

    @SerializedName("category_id")
    private String categoryId;
    @SerializedName("categories_name")
    private String categoriesName;
    @SerializedName("categories_image")
    private String categoriesImage;
    @SerializedName("min_dis")
    private String minDis;
    @SerializedName("max_dis")
    private String maxDis;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName;
    }

    public String getCategoriesImage() {
        return categoriesImage;
    }

    public void setCategoriesImage(String categoriesImage) {
        this.categoriesImage = categoriesImage;
    }

    public String getMinDis() {
        return minDis;
    }

    public void setMinDis(String minDis) {
        this.minDis = minDis;
    }

    public String getMaxDis() {
        return maxDis;
    }

    public void setMaxDis(String maxDis) {
        this.maxDis = maxDis;
    }

}
