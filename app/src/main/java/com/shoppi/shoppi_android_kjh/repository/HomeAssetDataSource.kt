package com.shoppi.shoppi_android_kjh.repository

import com.google.gson.Gson
import com.shoppi.shoppi_android_kjh.AssetLoader
import com.shoppi.shoppi_android_kjh.model.HomeData

class HomeAssetDataSource(private val assetLoader: AssetLoader) : HomeDataSource {

    private val gson = Gson()

    override fun getHomeData(): HomeData? {
        return assetLoader.getJsonString("home.json")?.let { homeJsonString ->
            gson.fromJson(homeJsonString, HomeData::class.java)
        }
    }
}