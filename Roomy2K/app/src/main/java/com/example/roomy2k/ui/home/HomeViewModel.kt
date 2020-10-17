package com.example.roomy2k.ui.home

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.roomy2k.TestData

class HomeViewModel: ViewModel() {
    val LOG_TAG: String = javaClass.simpleName

    val testData : TestData = TestData()

    //Bills
    private val _billData = MutableLiveData<MutableList<MutableMap<String, String>>>().apply{
        Log.v( LOG_TAG, "in billData apply section" )
        value = testData.getBills()
    }

    fun getBills() : LiveData<MutableList<MutableMap<String, String>>> {
        Log.v( LOG_TAG, "in getBills" )
        return _billData
    }

    //Shared Items
    private val _sharedItems = MutableLiveData<MutableList<MutableMap<String, Object>>>().apply{
        Log.v( LOG_TAG, "in sharedItems apply section" )
        value = testData.getSharedItems()
    }

    fun getSharedItems() : LiveData<MutableList<MutableMap<String, Object>>> {
        Log.v( LOG_TAG, "in getSharedItems" )
        return _sharedItems
    }


}