package com.shoppi.shoppi_android_kjh.repository.productdetail

import com.shoppi.shoppi_android_kjh.model.Product
import com.shoppi.shoppi_android_kjh.network.ApiClient

class ProductDetailRemoteDataSource(
    private val api: ApiClient
) : ProductDetailDataSource {

    override suspend fun getProductDetail(productId: String): Product {
        return api.getProductDetail(productId)
    }
}