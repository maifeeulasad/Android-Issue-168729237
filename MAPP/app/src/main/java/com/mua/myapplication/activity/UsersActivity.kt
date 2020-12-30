package com.mua.myapplication.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mua.myapplication.R
import com.mua.myapplication.databinding.ActivityUsersBinding

class UsersActivity : AppCompatActivity() {


    private lateinit var mBinding: ActivityUsersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)


    }
}