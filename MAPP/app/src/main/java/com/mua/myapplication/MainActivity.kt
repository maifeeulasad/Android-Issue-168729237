package com.mua.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mua.myapplication.activity.InfoActivity
import com.mua.myapplication.activity.UserActivity
import com.mua.myapplication.activity.UsersActivity
import com.mua.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initSetup()

        //Toast.makeText(this,"Hello world -?",Toast.LENGTH_LONG).show()

        mBinding.btnUser.setOnClickListener {
            val intent = Intent(this,UserActivity::class.java)
            startActivityForResult(intent,1234)
        }

        mBinding.btnUsers.setOnClickListener {
            val intent = Intent(this, UsersActivity::class.java)
            startActivityForResult(intent,4321)
        }
        
        mBinding.btnInfo.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }

    }


    private fun initSetup(){
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = mBinding.root
        setContentView(view)
    }
}