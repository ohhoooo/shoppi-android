package com.shoppi.shoppi_android_kjh.model

import com.google.gson.annotations.SerializedName

data class HomeData(
    val title: Title,
    @SerializedName("top_banners") val topBanners: List<Banner>,
    val promotions: Promotion
)
