package com.hythan.apipadroesandroid.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "item_order")
public class ItemOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
//    @JoinTable(name = "products",
//            joinColumns ={@JoinColumn(name = "id")})
    private Product product;

    private Integer amount;

    public ItemOrder(){}

    public ItemOrder(Product product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
