package com.example.nasea.musicplayer.fragment;

import com.example.nasea.musicplayer.base.BaseAdapter;
import com.example.nasea.musicplayer.model.MP3Media;

public interface MediaListener<T extends MP3Media>
        extends BaseAdapter.ListItemListener {
    void onItemMediaClick(T t);
}
