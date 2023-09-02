package com.feature.module1.data.mappers

import com.feature.module1.data.model.ProductDetailsResponse
import com.feature.module1.domain.model.Product

fun ProductDetailsResponse.toProduct() : Product {
    return Product(
        brand = this.brand,
        category = this.category,
        description = this.description,
        discountPercentage = this.discountPercentage,
        id = this.id,
        images = this.images,
        price = this.price,
        rating = this.rating,
        stock = this.stock,
        thumbnail = this.thumbnail,
        title = this.title
    )
}