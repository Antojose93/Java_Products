package com.TopicosHexagonal.Products.infrastructure.entities;

import com.TopicosHexagonal.Products.domain.models.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private double cost;
    private LocalDateTime creationDate;
    private boolean deleted;
    private String description;
    public ProductEntity() {}
    public ProductEntity(Long id, String name, double price, double cost, LocalDateTime creationDate, boolean deleted, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.creationDate = creationDate;
        this.deleted = deleted;
        this.description = description;
    }
    public static ProductEntity fromDomainModel(Product product) {
        return new ProductEntity(product.getId(), product.getName(), product.getPrice(), product.getCost(),product.getCreationDate(), product.isDeleted(), product.getDescription());
    }
    public Product toDomainModel() {
        return new Product(id, name, price, cost, creationDate, deleted, description);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
