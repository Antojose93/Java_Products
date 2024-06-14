package com.TopicosHexagonal.Products.domain.models;

import java.time.LocalDateTime;

public class Product {
    private Long id;
    private String name;
    private double price;
    private double cost;
    private LocalDateTime creationDate;
    private boolean deleted;
    private String description;

    public Product(Long id, String name, double price, double cost, LocalDateTime creationDate, boolean deleted, String description ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.creationDate = creationDate;
        this.deleted = deleted;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getCost() {
        return cost;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
