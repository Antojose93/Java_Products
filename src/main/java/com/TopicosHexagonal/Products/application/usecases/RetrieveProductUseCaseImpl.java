package com.TopicosHexagonal.Products.application.usecases;

import com.TopicosHexagonal.Products.domain.models.Product;
import com.TopicosHexagonal.Products.domain.ports.in.RetrieveProductUseCase;
import com.TopicosHexagonal.Products.domain.ports.out.ProductRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveProductUseCaseImpl implements RetrieveProductUseCase {
    private final ProductRepositoryPort productRepositoryPort;

    public RetrieveProductUseCaseImpl(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepositoryPort.findById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepositoryPort.findAll();
    }
}
