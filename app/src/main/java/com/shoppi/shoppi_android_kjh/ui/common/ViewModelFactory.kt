package com.shoppi.shoppi_android_kjh.ui.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.shoppi.shoppi_android_kjh.AssetLoader
import com.shoppi.shoppi_android_kjh.network.ApiClient
import com.shoppi.shoppi_android_kjh.repository.CategoryRemoteDataSource
import com.shoppi.shoppi_android_kjh.repository.CategoryRepository
import com.shoppi.shoppi_android_kjh.repository.HomeAssetDataSource
import com.shoppi.shoppi_android_kjh.repository.HomeRepository
import com.shoppi.shoppi_android_kjh.ui.category.CategoryViewModel
import com.shoppi.shoppi_android_kjh.ui.home.HomeViewModel

class ViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                val repository = HomeRepository(HomeAssetDataSource(AssetLoader(context)))
                HomeViewModel(repository) as T
            }
            modelClass.isAssignableFrom(CategoryViewModel::class.java) -> {
                val repository = CategoryRepository(CategoryRemoteDataSource(ApiClient.create()))
                CategoryViewModel(repository) as T
            }
            else -> {
                throw IllegalArgumentException("Failed to create ViewModel: ${modelClass.name}")
            }
        }
    }
}