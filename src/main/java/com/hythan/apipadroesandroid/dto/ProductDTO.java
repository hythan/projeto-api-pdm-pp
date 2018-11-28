package com.hythan.apipadroesandroid.dto;

import javax.validation.constraints.NotNull;

public class ProductDTO {

    private Integer id;

    private String name;

    private String description;

    private Double price;

    public ProductDTO() {
    }

    public ProductDTO(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull(message = "Nome do produto não pode ser nulo.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotNull(message = "Preço do produto não pode ser nulo.")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
