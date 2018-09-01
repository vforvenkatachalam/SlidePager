package com.example.chalam.slidepager

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ViewPagerAdapter: PagerAdapter {

    var context:Context? = null
    var layouts:Array<Int>? = null

    constructor(context: Context,layouts:Array<Int>)
    {
        this.context = context
        this.layouts = layouts
    }
    override fun isViewFromObject(p0: View, p1: Any): Boolean {
        return p0 == p1
    }

    override fun getCount(): Int {
        return layouts!!.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        var view:View = LayoutInflater.from(context).inflate(layouts!![position],container,false)
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        var view:View = `object` as View
        container.removeView(view)
    }
}