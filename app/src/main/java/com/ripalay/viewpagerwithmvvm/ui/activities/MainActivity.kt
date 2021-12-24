package com.ripalay.viewpagerwithmvvm.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ripalay.viewpagerwithmvvm.databinding.ActivityMainBinding
import com.ripalay.viewpagerwithmvvm.ui.fragments.FirstFragment
import com.ripalay.viewpagerwithmvvm.ui.fragments.SecondFragment
import com.ripalay.viewpagerwithmvvm.ui.fragments.third.ThirdFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = ViewPagerAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFragment()
        binding.viewPager.adapter = adapter
    }

    private fun initFragment() {
        adapter.list.add(FirstFragment())
        adapter.list.add(SecondFragment())
        adapter.list.add(ThirdFragment())
    }
}