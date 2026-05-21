package org.micah.shopflux.core.network

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import org.micah.shopflux.core.network.dtos.ProductDto
import org.micah.shopflux.core.network.helpers.ApiResponse
import org.micah.shopflux.core.network.helpers.safeApiCall

class ShopFluxApiServiceImpl (private val client: HttpClient ): ShopFluxApiService{
    override suspend fun getProducts(): ApiResponse<List<ProductDto>> {
        return safeApiCall {
            client.get("$BASE_URL/products")
        }
    }

    override suspend fun getCategories(): ApiResponse<List<String>> {
        return safeApiCall {
            client.get("$BASE_URL/products/categories")
        }
    }

    override suspend fun getProductById(id: Int): ApiResponse<ProductDto> {
        return safeApiCall {
            client.get("$BASE_URL/products/$id")
        }
    }

    companion object{
        const val BASE_URL ="https://fakestoreapi.com"
    }
}
