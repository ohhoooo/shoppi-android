package com.shoppi.shoppi_android_kjh.repository

import com.shoppi.shoppi_android_kjh.model.HomeData

class HomeRepository(
    private val assetDataSource: HomeAssetDataSource
) {

    fun getHomeData(): HomeData? {
        return assetDataSource.getHomeData()
    }
}