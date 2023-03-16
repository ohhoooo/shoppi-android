package com.shoppi.shoppi_android_kjh.ui.cart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shoppi.shoppi_android_kjh.model.CartItem

class CartViewModel : ViewModel() {

    private val _items = MutableLiveData<List<CartItem>>()
    val items: LiveData<List<CartItem>> = _items

    fun loadCartItem() {
        _items.value
    }
}