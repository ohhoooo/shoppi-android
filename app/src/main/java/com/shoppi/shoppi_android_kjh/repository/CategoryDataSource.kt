package com.shoppi.shoppi_android_kjh.repository

import com.shoppi.shoppi_android_kjh.model.Category

interface CategoryDataSource {

    suspend fun getCategories(): List<Category>
}