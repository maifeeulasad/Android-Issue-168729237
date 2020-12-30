package com.mua.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mua.myapplication.R;
import com.mua.myapplication.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity {


    private ActivityUserBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}