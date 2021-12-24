package com.ripalay.viewpagerwithmvvm.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ripalay.viewpagerwithmvvm.R
import com.ripalay.viewpagerwithmvvm.databinding.FragmentFirstBinding
import com.ripalay.viewpagerwithmvvm.ui.activities.MainViewModel
import com.ripalay.viewpagerwithmvvm.ui.activities.ViewPagerAdapter

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        val view = binding.root
        return view

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        binding.plusBtn.setOnClickListener {
            viewModel.plus()
            viewModel.addPlus()

        }
        binding.minusBtn.setOnClickListener {
            viewModel.minus()
            viewModel.addMinus()
        }
    }
}