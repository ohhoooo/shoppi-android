package com.shoppi.shoppi_android_kjh.repository.categorydetail

import com.shoppi.shoppi_android_kjh.model.CategoryDetail

class CategoryDetailRepository(
    private val remoteDataSource: CategoryDetailRemoteDataSource
) {

    suspend fun getCategoryDetail(): CategoryDetail {
        return remoteDataSource.getCategoryDetail()
    }
}