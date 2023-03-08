package com.shoppi.shoppi_android_kjh.repository.category

import com.shoppi.shoppi_android_kjh.model.Category
import com.shoppi.shoppi_android_kjh.repository.category.CategoryRemoteDataSource

class CategoryRepository(
    private val remoteDataSource: CategoryRemoteDataSource
) {

    suspend fun getCategories(): List<Category> {
        return remoteDataSource.getCategories()
    }
}