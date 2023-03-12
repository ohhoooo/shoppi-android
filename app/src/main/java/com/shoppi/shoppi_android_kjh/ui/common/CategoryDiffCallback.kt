package com.shoppi.shoppi_android_kjh.ui.common

import androidx.recyclerview.widget.DiffUtil
import com.shoppi.shoppi_android_kjh.model.Category

class CategoryDiffCallback : DiffUtil.ItemCallback<Category>() {
    override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
        return oldItem.categoryId == newItem.categoryId
    }

    override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
        return oldItem == newItem
    }
}