package com.idealcn.event.study

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


/**
 * author: guoning
 * date: 2018/7/12 10:25 AM
 * description:
 */
class DetailActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val title = intent.extras.getString("title")
        setTitle(title)
    }

}