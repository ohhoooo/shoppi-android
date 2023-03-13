package com.shoppi.shoppi_android_kjh.repository.productdetail

import com.shoppi.shoppi_android_kjh.model.Product

interface ProductDetailDataSource {

    suspend fun getProductDetail(productId: String): Product
}