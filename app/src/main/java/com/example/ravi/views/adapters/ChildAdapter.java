package com.example.ravi.views.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.ravi.R;

import java.util.List;

import com.example.ravi.databinding.ChildRecyclerBinding;
import com.example.ravi.models.Example;
import com.example.ravi.models.SubCategory;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.MyViewHolder> {

    Activity activity;
    Example example;
    List<SubCategory> subCategoryList;

    public ChildAdapter(Activity activity, List<SubCategory> subCategoryList) {
        this.activity = activity;
        this.subCategoryList = subCategoryList;
    }

    @NonNull
    @Override
    public ChildAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ChildRecyclerBinding childRecyclerBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.child_recycler, viewGroup, false);
        return new ChildAdapter.MyViewHolder(childRecyclerBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildAdapter.MyViewHolder myViewHolder, int position) {

        myViewHolder.childRecyclerBinding.tvProductName.setText(subCategoryList.get(position).getCategoriesName());

        StringBuffer stringBuffer = new StringBuffer("Upto")
                .append(" ")
                .append(subCategoryList.get(position).getMaxDis())
                .append("%")
                .append(" ")
                .append("OFF");

        myViewHolder.childRecyclerBinding.tvProductVal.setText(stringBuffer);
        Glide.with(activity)
                .load(subCategoryList.get(position).getCategoriesImage())
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(myViewHolder.childRecyclerBinding.ivSubCat);
    }

    @Override
    public int getItemCount() {
        return (null != subCategoryList ? subCategoryList.size() : 0);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ChildRecyclerBinding childRecyclerBinding;

        public MyViewHolder(ChildRecyclerBinding childRecyclerBinding) {
            super(childRecyclerBinding.getRoot());
            this.childRecyclerBinding = childRecyclerBinding;
        }
    }
}
