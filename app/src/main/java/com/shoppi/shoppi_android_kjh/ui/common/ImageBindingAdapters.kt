package com.shoppi.shoppi_android_kjh.ui.common

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.shoppi.shoppi_android_kjh.GlideApp

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, imageUrl: String?) {
    if(!imageUrl.isNullOrEmpty()) {
        GlideApp.with(view)
            .load(imageUrl)
            .into(view)
    }
}