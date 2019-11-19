package com.example.ravi.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("ws")
    private String ws;
    @SerializedName("status")
    private Integer status;
    @SerializedName("message")
    private String message;
    @SerializedName("top_selling_products")
    private List<TopSellingProduct> topSellingProducts;
    @SerializedName("top_trending_cats")
    private List<TopTrendingCat> topTrendingCats;

    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<TopSellingProduct> getTopSellingProducts() {
        return topSellingProducts;
    }

    public void setTopSellingProducts(List<TopSellingProduct> topSellingProducts) {
        this.topSellingProducts = topSellingProducts;
    }

    public List<TopTrendingCat> getTopTrendingCats() {
        return topTrendingCats;
    }

    public void setTopTrendingCats(List<TopTrendingCat> topTrendingCats) {
        this.topTrendingCats = topTrendingCats;
    }

}
