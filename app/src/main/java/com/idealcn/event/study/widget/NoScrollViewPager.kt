package com.idealcn.event.study.widget

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent


/**
 * author: guoning
 * date: 2018/7/11 5:03 PM
 * description: 不允许viewpager左右滑动
 */
class NoScrollViewPager : ViewPager{


    constructor(context: Context) : super(context)

    constructor(context: Context,attributeSet: AttributeSet) : super(context,attributeSet)


    /**
     * 返回true自己消费
     */
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {

        return super.dispatchTouchEvent(ev)
    }



    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }





}