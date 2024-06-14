package com.TopicosHexagonal.Products.application.usecases;

import com.TopicosHexagonal.Products.domain.models.Product;
import com.TopicosHexagonal.Products.domain.ports.in.CreateProductUseCase;
import com.TopicosHexagonal.Products.domain.ports.out.ProductRepositoryPort;

public class CreateProductUseCaseImpl implements CreateProductUseCase {

    private final ProductRepositoryPort productRepositoryPort;

    public CreateProductUseCaseImpl(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepositoryPort.save(product);
    }
}
