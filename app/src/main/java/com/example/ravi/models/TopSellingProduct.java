package com.example.ravi.models;

import com.google.gson.annotations.SerializedName;

public class TopSellingProduct {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;
    @SerializedName("quantity_from")
    private String quantityFrom;
    @SerializedName("max_price")
    private String maxPrice;
    @SerializedName("min_price")
    private String minPrice;
    @SerializedName("sales")
    private String sales;
    @SerializedName("max_final_price")
    private String maxFinalPrice;
    @SerializedName("min_final_price")
    private String minFinalPrice;
    @SerializedName("discount")
    private String discount;
    @SerializedName("mrp")
    private String mrp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQuantityFrom() {
        return quantityFrom;
    }

    public void setQuantityFrom(String quantityFrom) {
        this.quantityFrom = quantityFrom;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getMaxFinalPrice() {
        return maxFinalPrice;
    }

    public void setMaxFinalPrice(String maxFinalPrice) {
        this.maxFinalPrice = maxFinalPrice;
    }

    public String getMinFinalPrice() {
        return minFinalPrice;
    }

    public void setMinFinalPrice(String minFinalPrice) {
        this.minFinalPrice = minFinalPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

}
