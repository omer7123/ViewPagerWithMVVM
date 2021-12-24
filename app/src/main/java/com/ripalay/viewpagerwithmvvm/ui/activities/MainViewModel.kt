package com.ripalay.viewpagerwithmvvm.ui.activities

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var mCounter = 0
    private var mList = mutableListOf<String>()

    val counter = MutableLiveData<Int>()
    val list = MutableLiveData<MutableList<String>>()

    fun plus() {
        mCounter++
        counter.value = mCounter
    }

    fun minus() {
        mCounter--
        counter.value = mCounter
    }

    fun addPlus() {
        mList.add("+")
        Log.e("ololo",mList.toString())
        list.value = mList
    }

    fun addMinus() {
        mList.add("-")
        list.value = mList
    }


}
