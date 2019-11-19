package com.example.ravi.models;

import java.util.List;

public class ParentModel {

    String title;
    List<Example> childList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Example> getChildList() {
        return childList;
    }

    public void setChildList(List<Example> childList) {
        this.childList = childList;
    }
}
