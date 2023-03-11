package com.shoppi.shoppi_android_kjh.repository.categorydetail

import com.shoppi.shoppi_android_kjh.model.CategoryDetail

interface CategoryDetailDataSource {

    suspend fun getCategoryDetail(): CategoryDetail
}