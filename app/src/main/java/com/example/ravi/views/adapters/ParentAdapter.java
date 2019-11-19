package com.example.ravi.views.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ravi.R;

import java.util.List;

import com.example.ravi.databinding.ParentRecyclerBinding;
import com.example.ravi.models.Example;
import com.example.ravi.models.TopTrendingCat;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.MyViewHolder> {

    Activity activity;
    Example example;

    public ParentAdapter(Activity activity, Example example) {
        this.activity = activity;
        this.example = example;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ParentRecyclerBinding parentRecyclerBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.parent_recycler, viewGroup, false);
        return new MyViewHolder(parentRecyclerBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {

        List<TopTrendingCat> topTrendingCats = example.getTopTrendingCats();

        myViewHolder.parentRecyclerBinding.tvProductTitle.setText(topTrendingCats.get(position).getTitle());

        ChildAdapter childAdapter = new ChildAdapter(activity, example.getTopTrendingCats().get(position).getSubCategories());
        myViewHolder.parentRecyclerBinding.rvChild.setLayoutManager(new LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false));
        myViewHolder.parentRecyclerBinding.rvChild.setAdapter(childAdapter);
    }


    @Override
    public int getItemCount() {
        return (null != example.getTopTrendingCats() ? example.getTopTrendingCats().size() : 0);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ParentRecyclerBinding parentRecyclerBinding;

        public MyViewHolder(ParentRecyclerBinding parentRecyclerBinding) {
            super(parentRecyclerBinding.getRoot());
            this.parentRecyclerBinding = parentRecyclerBinding;
        }
    }
}
