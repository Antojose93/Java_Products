package com.TopicosHexagonal.Products.application.usecases;

import com.TopicosHexagonal.Products.domain.models.Product;
import com.TopicosHexagonal.Products.domain.ports.in.UpdateProductUseCase;
import com.TopicosHexagonal.Products.domain.ports.out.ProductRepositoryPort;

import java.util.Optional;

public class UpdateProductUseCaseImpl implements UpdateProductUseCase {
    private final ProductRepositoryPort productRepositoryPort;

    public UpdateProductUseCaseImpl(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public Optional<Product> updateProduct(Long id, Product product) {
        return productRepositoryPort.update(id,product);
    }
}
