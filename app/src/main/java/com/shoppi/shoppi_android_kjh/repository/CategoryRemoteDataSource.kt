package com.shoppi.shoppi_android_kjh.repository

import com.shoppi.shoppi_android_kjh.model.Category
import com.shoppi.shoppi_android_kjh.network.ApiClient

class CategoryRemoteDataSource(private val apiClient: ApiClient) : CategoryDataSource {
    override suspend fun getCategories(): List<Category> {
        return apiClient.getCategories()
    }
}