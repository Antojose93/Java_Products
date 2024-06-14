package com.TopicosHexagonal.Products.domain.ports.in;

import com.TopicosHexagonal.Products.domain.models.Product;

import java.util.Optional;

public interface UpdateProductUseCase {
    Optional<Product> updateProduct(Long id, Product product);
}
