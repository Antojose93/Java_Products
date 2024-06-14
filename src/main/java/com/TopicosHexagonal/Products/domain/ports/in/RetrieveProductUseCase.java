package com.TopicosHexagonal.Products.domain.ports.in;

import com.TopicosHexagonal.Products.domain.models.Product;

import java.util.List;
import java.util.Optional;

public interface RetrieveProductUseCase {
    Optional<Product> getProductById(Long id);
    List<Product> getAllProducts();
}
