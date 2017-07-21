package com.bwie.photoviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

public class MainActivity extends AppCompatActivity {
    private PhotoView mPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPhotoView = (PhotoView) findViewById(R.id.photo_view);
        mPhotoView.setImageResource(R.mipmap.ic_launcher);
    }
}
