package com.example.nasea.musicplayer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.nasea.musicplayer.R;
import com.example.nasea.musicplayer.base.BaseAdapter;
import com.example.nasea.musicplayer.base.BaseFragment;
import com.example.nasea.musicplayer.databinding.FragmentAlbumBinding;
import com.example.nasea.musicplayer.model.Album;

public class AlbumFragment extends BaseFragment<FragmentAlbumBinding>
        implements MediaListener<Album>,BaseAdapter.ListItemListener {
    private BaseAdapter<Album> adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_album;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new BaseAdapter<>(getContext(), R.layout.item_album);
        binding.lvAlbum.setAdapter(adapter);
        adapter.setData(systemData.getAlbums());
        adapter.setListener(this);
    }

    @Override
    public int getTitle() {
        return R.string.album;
    }

    @Override
    public void onItemMediaClick(Album album) {

    }
}