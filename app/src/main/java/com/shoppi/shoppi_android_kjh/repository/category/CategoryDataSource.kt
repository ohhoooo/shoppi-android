package com.shoppi.shoppi_android_kjh.repository.category

import com.shoppi.shoppi_android_kjh.model.Category

interface CategoryDataSource {

    suspend fun getCategories(): List<Category>
}