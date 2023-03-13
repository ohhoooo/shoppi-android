package com.shoppi.shoppi_android_kjh.repository.productdetail

import com.shoppi.shoppi_android_kjh.model.Product

class ProductDetailRepository(
    private val remoteDataSource: ProductDetailDataSource
) {

    suspend fun getProductDetail(productId: String): Product {
        return remoteDataSource.getProductDetail(productId)
    }
}