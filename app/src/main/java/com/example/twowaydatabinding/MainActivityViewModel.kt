package com.example.twowaydatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
     private var count = MutableLiveData<Int>()
    val countData : LiveData<Int>
        get() {
           return count
        }

    init {
        count.value = 0
    }
     fun incCount(){
        count.value = (count.value?.plus(1))
    }
}