package com.TopicosHexagonal.Products.infrastructure.config;

import com.TopicosHexagonal.Products.application.services.ProductService;
import com.TopicosHexagonal.Products.application.usecases.CreateProductUseCaseImpl;
import com.TopicosHexagonal.Products.application.usecases.DeleteProductUseCaseImpl;
import com.TopicosHexagonal.Products.application.usecases.RetrieveProductUseCaseImpl;
import com.TopicosHexagonal.Products.application.usecases.UpdateProductUseCaseImpl;
import com.TopicosHexagonal.Products.domain.ports.out.ProductRepositoryPort;
import com.TopicosHexagonal.Products.infrastructure.repositories.JpaProductRepository;
import com.TopicosHexagonal.Products.infrastructure.repositories.JpaRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public class ApplicationConfig {

    @Bean
    public ProductService productService(ProductRepositoryPort productRepositoryPort) {
        return new ProductService(
                new CreateProductUseCaseImpl(productRepositoryPort),
                new RetrieveProductUseCaseImpl(productRepositoryPort),
                new UpdateProductUseCaseImpl(productRepositoryPort),
                new DeleteProductUseCaseImpl(productRepositoryPort)
        );
    }

    @Bean
    public ProductRepositoryPort productRepositoryPort(JpaRepositoryAdapter productRepositoryAdapter) {
        return productRepositoryAdapter;
    }
}
