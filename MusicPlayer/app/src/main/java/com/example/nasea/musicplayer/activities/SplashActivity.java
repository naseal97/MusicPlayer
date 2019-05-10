package com.example.nasea.musicplayer.activities;

import android.content.Intent;
import android.os.Handler;

import com.example.nasea.musicplayer.base.BaseActivity;
import com.example.nasea.musicplayer.R;
import com.example.nasea.musicplayer.databinding.ActivitySplashBinding;



public class SplashActivity extends BaseActivity<ActivitySplashBinding> {
    @Override
    protected void initAct() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
            }
        },1000);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }
}
