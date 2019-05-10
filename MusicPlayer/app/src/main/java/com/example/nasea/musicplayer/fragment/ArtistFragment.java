package com.example.nasea.musicplayer.fragment;

import com.example.nasea.musicplayer.R;
import com.example.nasea.musicplayer.base.BaseFragment;
import com.example.nasea.musicplayer.databinding.FragmentArtistBinding;

public class ArtistFragment extends BaseFragment<FragmentArtistBinding> {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_artist;
    }

    @Override
    public int getTitle() {
        return R.string.artist;
    }
}
