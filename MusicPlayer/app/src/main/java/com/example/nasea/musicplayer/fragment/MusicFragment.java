package com.example.nasea.musicplayer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.nasea.musicplayer.R;
import com.example.nasea.musicplayer.base.BaseAdapter;
import com.example.nasea.musicplayer.base.BaseFragment;
import com.example.nasea.musicplayer.databinding.FragmentMusicBinding;
import com.example.nasea.musicplayer.model.Music;

public class MusicFragment extends BaseFragment<FragmentMusicBinding>
        implements MediaListener<Music> {

    private BaseAdapter<Music> adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_music;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new BaseAdapter<>(getContext(), R.layout.item_music);
        binding.lvSong.setAdapter(adapter);
        adapter.setData(systemData.getSongs());
    }

    @Override
    public int getTitle() {
        return R.string.music;
    }

    @Override
    public void onItemMediaClick(Music music) {
        app.getService().setArrMusic(adapter.getData());
        int index = adapter.getData().indexOf(music);
        app.getService().create(index);
    }
}
