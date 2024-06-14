package com.TopicosHexagonal.Products.application.usecases;

import com.TopicosHexagonal.Products.domain.ports.in.DeleteProductUseCase;
import com.TopicosHexagonal.Products.domain.ports.out.ProductRepositoryPort;

public class DeleteProductUseCaseImpl implements DeleteProductUseCase {
    private final ProductRepositoryPort productRepositoryPort;

    public DeleteProductUseCaseImpl(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;

    }

    @Override
    public boolean deleteProduct(long id) {
        return productRepositoryPort.deleteById(id);
    }
}
