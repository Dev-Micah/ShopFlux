package org.micah.shopflux.core.network.dtos

import kotlinx.serialization.Serializable


@Serializable
data class ProductDto(
   val id: Int,
   val title: String,
   val price: Double,
   val description: String,
   val category: String,
   val image: String
)

@Serializable
data class ProductsResponse(
    val products: List<ProductDto>
)
