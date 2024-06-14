package com.TopicosHexagonal.Products.application.services;

import com.TopicosHexagonal.Products.domain.models.Product;
import com.TopicosHexagonal.Products.domain.ports.in.CreateProductUseCase;
import com.TopicosHexagonal.Products.domain.ports.in.DeleteProductUseCase;
import com.TopicosHexagonal.Products.domain.ports.in.RetrieveProductUseCase;
import com.TopicosHexagonal.Products.domain.ports.in.UpdateProductUseCase;

import java.util.List;
import java.util.Optional;

public class ProductService implements CreateProductUseCase, RetrieveProductUseCase, UpdateProductUseCase, DeleteProductUseCase {

    private final CreateProductUseCase createProductUseCase;
    private final RetrieveProductUseCase retrieveProductUseCase;
    private final UpdateProductUseCase updateProductUseCase;
    private final DeleteProductUseCase deleteProductUseCase;

    public ProductService(CreateProductUseCase createProductUseCase, RetrieveProductUseCase retrieveProductUseCase, UpdateProductUseCase updateProductUseCase, DeleteProductUseCase deleteProductUseCase) {
        this.createProductUseCase = createProductUseCase;
        this.retrieveProductUseCase = retrieveProductUseCase;
        this.updateProductUseCase = updateProductUseCase;
        this.deleteProductUseCase = deleteProductUseCase;
    }

    @Override
    public Product createProduct(Product product) {
        return createProductUseCase.createProduct(product);
    }

    @Override
    public boolean deleteProduct(long id) {
        return deleteProductUseCase.deleteProduct(id);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return retrieveProductUseCase.getProductById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return retrieveProductUseCase.getAllProducts();
    }

    @Override
    public Optional<Product> updateProduct(Long id, Product product) {
        return updateProductUseCase.updateProduct(id, product);
    }
}
