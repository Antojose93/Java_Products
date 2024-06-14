package com.TopicosHexagonal.Products.domain.ports.out;

import com.TopicosHexagonal.Products.domain.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryPort {
    Product save(Product product);
    Optional<Product> findById(Long id);
    List<Product> findAll();
    Optional<Product> update(Long id, Product product);
    boolean deleteById(Long id);

}
