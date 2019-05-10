package com.example.nasea.musicplayer.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nasea.musicplayer.BR;
import com.example.nasea.musicplayer.model.MP3Media;

import java.util.ArrayList;
import java.util.List;

public class BaseAdapter<T extends MP3Media> extends RecyclerView.Adapter<BaseAdapter.ViewHolder> {

    private @LayoutRes
    int resId;
    private LayoutInflater inflater;
    private ArrayList<T> data;
    private ListItemListener listener;

    public BaseAdapter(Context context, @LayoutRes int resId) {
        this.resId = resId;
        inflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<T> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public ArrayList<T> getData() {
        return data;
    }

    public void setListener(ListItemListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, resId, viewGroup, false);
        return new ViewHolder(binding);
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public void onBindViewHolder(@NonNull BaseAdapter.ViewHolder viewHolder, int i) {
        T t = data.get(i);
        viewHolder.binding.setVariable(BR.item, t);
//        viewHolder.binding.setVariable(BR.listener,listener);
        viewHolder.binding.executePendingBindings();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding binding;

        public ViewHolder(@NonNull ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public interface ListItemListener {
    }
}
