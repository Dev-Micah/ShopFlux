package org.micah.shopflux.core.network

import org.micah.shopflux.core.network.dtos.ProductDto
import org.micah.shopflux.core.network.dtos.ProductsResponse


interface ShopFluxApiService {
    suspend fun getProducts(): List<ProductsResponse>
    suspend fun getCategories(): List<String>
    suspend fun getProductById(id: Int): ProductsResponse
}
