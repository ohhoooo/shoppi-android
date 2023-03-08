package com.shoppi.shoppi_android_kjh.repository

import com.shoppi.shoppi_android_kjh.model.Category
import kotlinx.coroutines.withContext

class CategoryRepository(
    private val remoteDataSource: CategoryRemoteDataSource
) {

    suspend fun getCategories(): List<Category> {
        return remoteDataSource.getCategories()
    }
}