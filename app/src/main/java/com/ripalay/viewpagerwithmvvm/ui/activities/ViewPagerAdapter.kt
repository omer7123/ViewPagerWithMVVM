package com.ripalay.viewpagerwithmvvm.ui.activities

import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ripalay.viewpagerwithmvvm.ui.fragments.FirstFragment
import com.ripalay.viewpagerwithmvvm.ui.fragments.SecondFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    val list = ArrayList<Fragment>()



    override fun getItemCount(): Int {
        Log.e("oloo", list.size.toString())
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}