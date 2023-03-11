package com.shoppi.shoppi_android_kjh.repository.categorydetail

import com.shoppi.shoppi_android_kjh.model.CategoryDetail
import com.shoppi.shoppi_android_kjh.network.ApiClient

class CategoryDetailRemoteDataSource(private val api: ApiClient) : CategoryDetailDataSource {
    override suspend fun getCategoryDetail(): CategoryDetail {
        return api.getCategoryDetail()
    }
}