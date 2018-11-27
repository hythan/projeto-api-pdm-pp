package com.hythan.apipadroesandroid.entities.dao;

import com.hythan.apipadroesandroid.entities.Product;

import java.util.Optional;

public interface ProductDAO {

    Optional<Product> findById(Integer id);
    Iterable<Product> findAll();
    Product save(Product product);
    void deleteById(Integer id);
}
