package com.ripalay.viewpagerwithmvvm.ui.fragments.third

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ripalay.viewpagerwithmvvm.R
import com.ripalay.viewpagerwithmvvm.databinding.FragmentThirdBinding
import com.ripalay.viewpagerwithmvvm.ui.activities.MainViewModel

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    private val adapter: Adapter = Adapter()
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        val view: View = binding.root
        return view
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel.list.observe(requireActivity()) {
            adapter.list = it.asReversed()
            adapter.notifyDataSetChanged()
        }
        binding.recycler.adapter = adapter
    }
}