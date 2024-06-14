package com.TopicosHexagonal.Products.domain.ports.in;

import com.TopicosHexagonal.Products.domain.models.Product;

public interface CreateProductUseCase {
    Product createProduct(Product product);
}
