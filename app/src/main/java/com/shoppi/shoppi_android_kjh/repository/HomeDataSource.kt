package com.shoppi.shoppi_android_kjh.repository

import com.shoppi.shoppi_android_kjh.model.HomeData

interface HomeDataSource {

    fun getHomeData(): HomeData?
}