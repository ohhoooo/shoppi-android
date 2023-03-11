package com.shoppi.shoppi_android_kjh.ui.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shoppi.shoppi_android_kjh.model.Category
import com.shoppi.shoppi_android_kjh.repository.category.CategoryRepository
import kotlinx.coroutines.launch

class CategoryViewModel(
    private val categoryRepository: CategoryRepository
): ViewModel() {

    private val _items = MutableLiveData<List<Category>>()
    val items: LiveData<List<Category>> = _items

    private val _openCategoryEvent = MutableLiveData<Category>()
    val openCategoryEvent = _openCategoryEvent

    init {
        loadCategory()
    }

    fun openCategoryDetail(category: Category) {
        _openCategoryEvent.value = category
    }

    private fun loadCategory() {
        viewModelScope.launch {
            val categories = categoryRepository.getCategories()
            _items.value = categories
        }
    }
}