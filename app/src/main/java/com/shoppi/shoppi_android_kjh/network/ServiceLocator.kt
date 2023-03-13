package com.shoppi.shoppi_android_kjh.network

object ServiceLocator {

    private var apiClient: ApiClient? = null

    fun provideApiClient(): ApiClient {
        return apiClient ?: kotlin.run {
            ApiClient.create().also {
                apiClient = it
            }
        }
    }
}