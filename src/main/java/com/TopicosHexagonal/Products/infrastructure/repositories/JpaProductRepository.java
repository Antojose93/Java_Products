package com.TopicosHexagonal.Products.infrastructure.repositories;

import com.TopicosHexagonal.Products.infrastructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {
}
