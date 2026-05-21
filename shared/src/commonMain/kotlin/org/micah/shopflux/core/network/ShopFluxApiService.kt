package org.micah.shopflux.core.network

import org.micah.shopflux.core.network.dtos.ProductDto
import org.micah.shopflux.core.network.helpers.ApiResponse


interface ShopFluxApiService {
    suspend fun getProducts(): ApiResponse<List<ProductDto>>
    suspend fun getCategories(): ApiResponse<List<String>>
    suspend fun getProductById(id: Int): ApiResponse<ProductDto>
}
