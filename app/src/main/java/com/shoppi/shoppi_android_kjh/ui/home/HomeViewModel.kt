package com.shoppi.shoppi_android_kjh.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shoppi.shoppi_android_kjh.model.Banner
import com.shoppi.shoppi_android_kjh.model.Promotion
import com.shoppi.shoppi_android_kjh.model.Title
import com.shoppi.shoppi_android_kjh.repository.home.HomeRepository
import com.shoppi.shoppi_android_kjh.ui.common.Event

class HomeViewModel(private val homeRepository: HomeRepository) : ViewModel() {

    private val _title = MutableLiveData<Title>()
    val title: LiveData<Title> = _title

    private val _topBanners = MutableLiveData<List<Banner>>()
    val topBanners: LiveData<List<Banner>> = _topBanners

    private val _promotions = MutableLiveData<Promotion>()
    val promotions: LiveData<Promotion> = _promotions

    private val _openProductEvent = MutableLiveData<Event<String>>()
    val openProductEvent: LiveData<Event<String>> = _openProductEvent

    init {
        loadHomeData()
    }

    fun openProductDetail(productId: String) {
        _openProductEvent.value = Event(productId)
    }

    private fun loadHomeData() {
        val homeData = homeRepository.getHomeData()
        homeData?.let {  homeData ->
            _title.value = homeData.title
            _topBanners.value = homeData.topBanners
            _promotions.value = homeData.promotions
        }
    }
}