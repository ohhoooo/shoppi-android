package com.shoppi.shoppi_android_kjh.ui.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shoppi.shoppi_android_kjh.AssetLoader
import com.shoppi.shoppi_android_kjh.repository.HomeAssetDataSource
import com.shoppi.shoppi_android_kjh.repository.HomeRepository
import com.shoppi.shoppi_android_kjh.ui.home.HomeViewModel

class ViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            val repository = HomeRepository(HomeAssetDataSource(AssetLoader(context)))
            return HomeViewModel(repository) as T
        } else {
            throw IllegalArgumentException("Failed to create ViewModel: ${modelClass.name}")
        }
    }
}