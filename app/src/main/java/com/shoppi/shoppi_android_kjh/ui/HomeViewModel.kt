package com.shoppi.shoppi_android_kjh.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shoppi.shoppi_android_kjh.Banner
import com.shoppi.shoppi_android_kjh.Title

class HomeViewModel : ViewModel() {

    private val _title = MutableLiveData<Title>()
    val title: LiveData<Title> = _title

    private val _topBanners = MutableLiveData<List<Banner>>()
    val topBanners: LiveData<List<Banner>> = _topBanners

    fun loadHomeData() {
        // TODO Data Layer - Repository 에 요청
    }
}