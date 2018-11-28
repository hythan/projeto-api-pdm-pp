package com.hythan.apipadroesandroid.entities.dao;

import com.hythan.apipadroesandroid.dto.ProductDTO;
import com.hythan.apipadroesandroid.entities.Product;

import java.util.Optional;

public interface ProductDAO {

    Optional<Product> findById(Integer id);
    Iterable<Product> findAll();
    Product save(ProductDTO productDTO);
    void deleteById(Integer id);
}
