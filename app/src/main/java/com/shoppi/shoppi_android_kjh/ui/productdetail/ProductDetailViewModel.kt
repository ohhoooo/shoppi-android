package com.shoppi.shoppi_android_kjh.ui.productdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shoppi.shoppi_android_kjh.model.Product
import com.shoppi.shoppi_android_kjh.repository.productdetail.ProductDetailRepository
import kotlinx.coroutines.launch

class ProductDetailViewModel(
    private val productDetailRepository: ProductDetailRepository
) : ViewModel() {

    private val _product = MutableLiveData<Product>()
    val product: LiveData<Product> = _product

    fun loadProductDetail(productId: String) {
        viewModelScope.launch {
            _product.value = productDetailRepository.getProductDetail(productId)
        }
    }
}